package tuanbuffet.createclass.generalInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import tuanbuffet.common.WebUI;
public class GeneralInformation extends WebUI{
    ProductName productName = new ProductName(getClassType1(),getTeacherName1());
    NumberOfStudent numberOfStudent = new NumberOfStudent();
    ClassType classtype = new ClassType();
    CustomerService customerService = new CustomerService();
    private final By selectProductInput = By.xpath("//input[@placeholder=\"Chọn Sản Phẩm\"]");
    private final By nameClassInput = By.xpath("//input[@placeholder=\"Nhập Tên Lớp\"]");
    private final By numberStudentInput = By.xpath("//input[@placeholder=\"Chọn Số Lượng Tối Đa Học Viên\"]");
    private final By typeClassInput = By.xpath("//input[@placeholder=\"Chọn Loại Lớp\"]");
    private final By CSKHInput = By.xpath("//input[@placeholder=\"Chọn CKSH\"]");
    private final By submitButton = By.xpath("//button[contains(text(),'Tiếp Tục')]");
    private String studentName1;
    private String classType1;
    private String teacherName1;
    private String schedule1;
    private String curriculum1;
    private String studentName2;
    private String classType2;
    private String teacherName2;
    private String schedule2;
    private String curriculum2;

    public void setStudentName1(String studentName1) {
        this.studentName1 = studentName1;
    }

    public void setClassType1(String classType1) {
        this.classType1 = classType1;
    }

    public void setTeacherName1(String teacherName1) {
        this.teacherName1 = teacherName1;
    }

    public void setSchedule1(String schedule1) {
        this.schedule1 = schedule1;
    }

    public void setCurriculum1(String curriculum1) {
        this.curriculum1 = curriculum1;
    }

    public void setStudentName2(String studentName2) {
        this.studentName2 = studentName2;
    }

    public void setClassType2(String classType2) {
        this.classType2 = classType2;
    }

    public void setTeacherName2(String teacherName2) {
        this.teacherName2 = teacherName2;
    }

    public void setSchedule2(String schedule2) {
        this.schedule2 = schedule2;
    }

    public void setCurriculum2(String curriculum2) {
        this.curriculum2 = curriculum2;
    }

    public String getStudentName1() {
        return studentName1;
    }

    public String getClassType1() {
        return classType1;
    }

    public String getTeacherName1() {
        return teacherName1;
    }

    public String getSchedule1() {
        return schedule1;
    }

    public String getCurriculum1() {
        return curriculum1;
    }

    public String getStudentName2() {
        return studentName2;
    }

    public String getClassType2() {
        return classType2;
    }

    public String getTeacherName2() {
        return teacherName2;
    }

    public String getSchedule2() {
        return schedule2;
    }

    public String getCurriculum2() {
        return curriculum2;
    }

    public GeneralInformation(String studentName1, String classType1, String teacherName1, String schedule1, String curriculum1, String studentName2, String classType2, String teacherName2, String schedule2, String curriculum2) {
        this.studentName1 = studentName1;
        this.classType1 = classType1;
        this.teacherName1 = teacherName1;
        this.schedule1 = schedule1;
        this.curriculum1 = curriculum1;
        this.studentName2 = studentName2;
        this.classType2 = classType2;
        this.teacherName2 = teacherName2;
        this.schedule2 = schedule2;
        this.curriculum2 = curriculum2;
    }

    public boolean addGeneralInformation() throws InterruptedException {
        ClassName className = new ClassName(getStudentName1(), getClassType1(), getTeacherName1(), getSchedule1(), getCurriculum1(), getStudentName2(), getClassType2(), getTeacherName2(), getSchedule2(), getCurriculum2());
        if (className.getClassName().isEmpty()){
            return false;
        }
        else {
            System.out.println(className.getClassName() + "|" + getClassType1() + "|" + getTeacherName1() + "|" + getSchedule1() + "|");
            setText(selectProductInput, productName.getProductCourseName() + Keys.DOWN + Keys.ENTER);
            Thread.sleep(1000);
            setText(nameClassInput,className.getClassName());
            Thread.sleep(500);
            setText(numberStudentInput,numberOfStudent.getNumberOfStudent());
            Thread.sleep(500);
            setText(typeClassInput, classtype.getClassType()+ Keys.DOWN + Keys.ENTER);
            Thread.sleep(500);
            setText(CSKHInput,customerService.getCustomerService() + Keys.DOWN + Keys.ENTER );
            Thread.sleep(500);
            clickElement(submitButton);
            Thread.sleep(2000);
            return true;
        }
    }
}
