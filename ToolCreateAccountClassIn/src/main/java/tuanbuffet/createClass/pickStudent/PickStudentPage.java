package tuanbuffet.createclass.pickStudent;

import org.openqa.selenium.By;
import tuanbuffet.common.WebUI;

public class PickStudentPage extends WebUI {
    private final By informationStudentInput = By.xpath("//input[@placeholder=\"Tìm Kiếm Theo Mã, SĐT Và Tên Học Viên\"]");
    private final By searchButton = By.xpath("//form/div/div//button[contains(text(),'Tìm ')]");
    private final By nameStudentText = By.xpath("//*[@id=\"root\"]/div/main/form/div[2]/div[1]/div[2]/div[2]/div[1]/table/tbody/tr/td[1]");
    private final By addStudentButton = By.xpath("//tbody/tr/td//button[text()='Thêm']");
    private final By saveAndContinueButton = By.xpath("//button[contains(text(),'Lưu Và Tiếp Tục')]");
    private final By courseInformationText = By.xpath("//form//legend[contains(text(),'SPEAKWELL - GV')]");

    private String idBos1;
    private String idBos2;
    public PickStudentPage(String idBos1, String idBos2){
        this.idBos1 = idBos1;
        this.idBos2 = idBos2;
    }
    public void setIdBos1(String idBos1){
        if (!idBos1.isEmpty()){
            this.idBos1 = idBos1;
        }
        else this.idBos1 ="0";
    }
    public String getIdBos1(){
        return idBos1;
    }
    public void setIdBos2(String idBos2){
        if (!idBos2.isEmpty()){
            this.idBos2 = idBos2;
        }
        else this.idBos2 ="0";
    }
    public String getIdBos2(){
        return idBos2;
    }
    public void pickStudent() throws InterruptedException {
        String nameCourseProduct = getTextElement(courseInformationText);
        addStudent(getIdBos1());
        if (nameCourseProduct.contains("1:2")){
            addStudent(getIdBos2());
        }
        Thread.sleep(3000);
        clickElement(saveAndContinueButton);
    }
    public void addStudent(String idBos) throws InterruptedException {
        setText(informationStudentInput,idBos);
        Thread.sleep(1000);
        clickElement(searchButton);
        Thread.sleep(3000);
        if (verifyElementVisible(addStudentButton,5)){
            clickElement(addStudentButton);
            System.out.println("done add " + idBos + " vào lớp! |");
        }
        else {
            System.out.print("lỗi add " + idBos + " vào lớp! |");
        }
    }
}
