package tuanbuffet.createclass.generalInformation;

import java.util.Objects;

public class ClassName {
    private String studentName1;
    private String classType1;
    private String teacherName1;
    private String schedule1;
    private String curriculum1;
    private String studentName2;
    private String classType2;
    private String teacherName2;
    private String schedule2;

    public String getCurriculum2() {
        return curriculum2;
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

    private String curriculum2;

    public ClassName(String studentName1, String classType1, String teacherName1, String schedule1, String curriculum1, String studentName2, String classType2, String teacherName2, String schedule2, String curriculum2) {
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
    public String getClassName(){
        if (getClassType1().contains("1:2")){
            if (Objects.equals(getClassType1(),getClassType2()) && Objects.equals(getTeacherName1(),getTeacherName2()) && Objects.equals(getSchedule1(),getSchedule2()) && Objects.equals(getCurriculum1(),getCurriculum2())){
                return getStudentName1() + " + " + getStudentName1();
            }
            else return "";
        }
        else {

            return getStudentName1();
        }
    }
}
