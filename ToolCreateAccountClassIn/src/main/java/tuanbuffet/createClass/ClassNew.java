package tuanbuffet.createclass;

import tuanbuffet.common.WebUI;
import tuanbuffet.createclass.generalInformation.GeneralInformation;
import tuanbuffet.createclass.pickStudent.PickStudentPage;
import tuanbuffet.createclass.scheduling.SchedulingPage;

public class ClassNew extends WebUI {
    private String studentName1;
    private String email1;
    private String phone1;
    private String classType1;
    private String schedule1;
    private String teacherName1;
    private String curriculum1;
    private String idBos1;
    private String studentName2;
    private String email2;
    private String phone2;
    private  String classType2;
    private String teacherName2;
    private  String schedule2;
    private  String idBos2;
    private String curriculum2;


    public void setStudentName1(String studentName1) {
        this.studentName1 = studentName1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public void setClassType1(String classType1) {
        this.classType1 = classType1;
    }

    public void setSchedule1(String schedule1) {
        this.schedule1 = schedule1;
    }

    public void setTeacherName1(String teacherName1) {
        this.teacherName1 = teacherName1;
    }

    public void setCurriculum1(String curriculum1) {
        this.curriculum1 = curriculum1;
    }

    public void setIdBos1(String idBos1) {
        this.idBos1 = idBos1;
    }

    public void setStudentName2(String studentName2) {
        this.studentName2 = studentName2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
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

    public void setIdBos2(String idBos2) {
        this.idBos2 = idBos2;
    }

    public void setCurriculum2(String curriculum2) {
        this.curriculum2 = curriculum2;
    }

    public String getStudentName1() {
        return studentName1;
    }

    public String getEmail1() {
        return email1;
    }

    public String getPhone1() {
        return phone1;
    }

    public String getClassType1() {
        return classType1;
    }

    public String getSchedule1() {
        return schedule1;
    }

    public String getTeacherName1() {
        return teacherName1;
    }

    public String getCurriculum1() {
        return curriculum1;
    }


    public String getIdBos1() {
        return idBos1;
    }

    public String getStudentName2() {
        return studentName2;
    }

    public String getEmail2() {
        return email2;
    }

    public String getPhone2() {
        return phone2;
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

    public String getIdBos2() {
        return idBos2;
    }

    public String getCurriculum2() {
        return curriculum2;
    }
    public ClassNew(String studentName1, String email1, String phone1, String classType1, String schedule1, String teacherName1,  String curriculum1,String idBos1, String studentName2, String email2, String phone2, String classType2,String schedule2, String teacherName2,String curriculum2 ,String idBos2) {
        this.studentName1 = studentName1;
        this.email1 = email1;
        this.phone1 = phone1;
        this.classType1 = classType1;
        this.teacherName1 = teacherName1;
        this.schedule1 = schedule1;
        this.curriculum1 = curriculum1;
        this.curriculum2 = curriculum2;
        this.studentName2 = studentName2;
        this.email2 = email2;
        this.phone2 = phone2;
        this.classType2 = classType2;
        this.teacherName2 = teacherName2;
        this.schedule2 = schedule2;
        this.idBos1 = idBos1;
        this.idBos2 = idBos2;
    }
    GeneralInformation generalInformation = new GeneralInformation(studentName1,classType1,teacherName1,schedule1,curriculum1,studentName2,classType2,teacherName2,schedule2,curriculum2);
    PickStudentPage pickStudentPage = new PickStudentPage(getIdBos1(),getIdBos2());
    SchedulingPage schedulingPage = new SchedulingPage(getCurriculum1());



    String URL_CREATE_CLASS ="https://spu.bos.hocmai.com/classes/create";
    public void createClass() throws InterruptedException {
        openURL(URL_CREATE_CLASS);
        System.out.println(getCurriculum1() + "oke chưa");
        if (generalInformation.addGeneralInformation()){
            schedulingPage.addScheduleClass();
            pickStudentPage.pickStudent();
        }
    }

}
