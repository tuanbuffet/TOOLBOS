package tuanbuffet.createAcount;

import org.openqa.selenium.By;
import tuanbuffet.common.WebUI;

public class CheckClassIn extends WebUI {
    private String URL = "https://spu.bos.hocmai.com/students";
    private By searchInput = By.xpath("//*[@name=\"nameOrPhoneOrCode\"]");
    private By submitButton = By.xpath("//button[(text()=\"Tìm Kiếm\")]");

    private By listClassinButton = By.xpath("//tbody/tr");
    public void SearchInformation (String phone) throws InterruptedException {
        openURL(URL);
        setText(searchInput, phone);
        clickElement(submitButton);
        Thread.sleep(3000);
        UpData(phone);
    }
    public void UpData(String phone){
        if (ContentBody().contains("Không Có Dữ Liệu")){

        }else {
            for (int i = 1 ; i<= listElements(listClassinButton) ; i++){
                String numberClassInOnWeb = getTextElement(By.xpath("//tbody/tr["+i+"]/td[4]"));
                if (numberClassInOnWeb.contains(phone)){
                    System.out.println(getTextElement(By.xpath("//tbody/tr["+ i +"]/td[1]")) + "|" + getTextElement(By.xpath("//tbody/tr["+ i +"]/td[2]")));
                }
            }
        }
    }
    public String ContentBody(){
        return getTextElement(listClassinButton);
    }
}
