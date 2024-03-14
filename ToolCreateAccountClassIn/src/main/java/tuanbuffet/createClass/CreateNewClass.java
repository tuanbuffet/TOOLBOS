package tuanbuffet.createClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import tuanbuffet.common.WebUI;

public class CreateNewClass extends WebUI {
    private String URL = "https://spu.bos.hocmai.com/classes/create";
    By selectProductInput = By.xpath("//input[@placeholder=\"Chọn Sản Phẩm\"]");
    By nameClassInput = By.xpath("//input[@placeholder=\"Nhập Tên Lớp\"]");
    By numberStudentInput = By.xpath("//input[@placeholder=\"Chọn Số Lượng Tối Đa Học Viên\"]");
    By typeClassInput = By.xpath("//input[@placeholder=\"Chọn Loại Lớp\"]");
    By CSKHInput = By.xpath("//input[@placeholder=\"Chọn CKSH\"]");
    By submitButton = By.xpath("//button[contains(text(),'Tiếp Tục')]");
    public void CreateNewClass(String classname, String typeClass , String teacherName) throws InterruptedException {
        openURL(URL);
        setText(selectProductInput,ProductCourse(typeClass,teacherName) + Keys.DOWN + Keys.ENTER);
        Thread.sleep(500);
        setText(nameClassInput,"classname");
        Thread.sleep(500);
        setText(numberStudentInput,"5");
        Thread.sleep(500);
        setText(typeClassInput,"Chính Thức" + Keys.DOWN + Keys.ENTER);
        Thread.sleep(500);
        setText(CSKHInput,"(cs) - ( CS Default )" + Keys.DOWN + Keys.ENTER );
        Thread.sleep(500);
        clickElement(submitButton);
        Thread.sleep(2000);
    }
    public String ProductCourse(String typeClass, String teacherName){
        if (typeClass.equals("1")){
            if (teacherName.equals("Việt")){
                return "Việt Nam 1:1";
            }
            else if (teacherName.equals("phil")){
                return "Phil 1:1";
            }
            else if (teacherName.equals("Nam Phi")){
                return "Nam Phi 1:1";
            }
            else if (teacherName.equals("US/UK")){
                return "US/UK 1:1"
            }
        }
        else {
            if (teacherName.equals("Việt")){
                return "Việt Nam 1:2";
            }
            else if (teacherName.equals("phil")){
                return "Phil 1:2";
            }
            else if (teacherName.equals("Nam Phi")){
                return "Nam Phi 1:2";
            }
            else if (teacherName.equals("US/UK")){
                return "US/UK 1:2";
            }
        }
    }
}
