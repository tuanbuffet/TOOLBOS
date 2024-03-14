package tuanbuffet.createAcount;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import tuanbuffet.common.WebUI;

public class CreateStudent extends WebUI {
    private String URL = "https://spu.bos.hocmai.com/students/create";
    private By fullNameInput = By.xpath("//input[@name=\"fullName\"]");
    private By phoneInput = By.xpath("//input[@name=\"phone\"]");
    private By emailInput = By.xpath("//input[@name=\"email\"]");
    private By birthdayInput = By.xpath("//input[@placeholder=\"ngày/tháng/năm\"]");
    private By representButton = By.xpath("//span[contains(text(),'Học Viên Là Người Đại Diện')]");
    private By CSKHbutton = By.xpath("//*[@placeholder=\"Chọn CKSH\"]");
    private By classinPhone = By.xpath("//input[@name=\"classInPhone\"]");
    private By createButton = By.xpath("//h6[text()=\"Tạo\"]");
    private By notification = By.xpath("//*[@id=\"notistack-snackbar\"]");
    CheckClassIn checkClassIn = new CheckClassIn();
    public void EnterInformation(String fullName, String phone) throws InterruptedException {
        String email = phone + "@gmail.com";
        openURL(URL);
        System.out.print(fullName + "|" + phone + "|");
        setText(fullNameInput,fullName);
        setText(phoneInput,phone);
        setText(emailInput,email);
        setText(birthdayInput,"19022001");
        clickElement(representButton);
        setText(CSKHbutton,"(cs) - ( CS Default )" + Keys.DOWN + Keys.ENTER);
        setText(classinPhone,phone);
        clickElement(createButton);
        Thread.sleep(2000);
        CheckCreatedAccount(phone,email);
    }
    public boolean CheckCreatedAccount(String phone,String email) throws InterruptedException {
            if (CreateFail().contains("Email đã tồn tại")){
                ReEdit(phone,email);
                return false;
            }
            else{
                ReEdit(phone,email);
                return true;
            }
    }
    public String CreateFail(){
        return getTextElement(notification);
    }
    public void ReEdit(String phone,String email) throws InterruptedException {
            if (CreateFail().contains("Email đã tồn tại")){
                for (int i = 0; i<10; i++) {
                    email = i + phone + "@gmail.com";
                    setText(emailInput, Keys.CONTROL + "a");
                    setText(emailInput, email);
                    clickElement(createButton);
                    Thread.sleep(3000);
                    if (CheckCreatedAccount(phone,email)){
                        break;
                    }
                }
            }
            else if (CreateFail().contains("ClassIn Phone đã tồn tại") || CreateFail().contains("Họ tên và số điện thoại liên lạc đã tồn tại")){
                checkClassIn.SearchInformation(phone);
            }
            else if (CreateFail().contains("Tạo học viên thành công!")){
                checkClassIn.SearchInformation(phone);
            }


    }

}
