package tuanbuffet.createclass.generalInformation;

import tuanbuffet.getlistnameteacher.ListTeacherName;

public class ProductName extends ListTeacherName {
    private String classType;
    private String teacherName;

    public ProductName(String classType, String teacherName) {
        this.classType = classType;
        this.teacherName = teacherName;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getClassType() {
        return classType;
    }

    public String getTeacherName() {
        return teacherName;
    }

    boolean status = false;

    public boolean checkTeacherType(String[] teacherType) {
        for (String s : teacherType) {
            if (s.contains(getTeacherName()) || getTeacherName().contains(s)) {
                status = true;
                break;
            }
        }
        return status;
    }

    public String checkClassType() {
        if (getClassType().contains("1:1")) {
            return "1:1";
        } else if (getClassType().contains("1:2")) {
            return "1:2";
        } else return "1:3";
    }

    public String getProductCourseName() {
        if (checkClassType().equals("1:1")) {
            if (checkTeacherType(teacherVietNam)) {
                return "SPEAKWELL - GV Việt Nam 1:1";
            } else if (checkTeacherType(teacherPhilippines)) {
                return "SPEAKWELL - GV Philippines 1:1";
            } else if (checkTeacherType(teacherNamPhi)) {
                return "SPEAKWELL - GV Nam Phi 1:1";
            } else return "SPEAKWELL - GV US/UK 1:1";
        } else if (checkClassType().equals("1:2")) {
            if (checkTeacherType(teacherVietNam)) {
                return "SPEAKWELL - GV Việt Nam 1:2";
            } else if (checkTeacherType(teacherPhilippines)) {
                return "SPEAKWELL - GV Philippines 1:2";
            } else if (checkTeacherType(teacherNamPhi)) {
                return "SPEAKWELL - GV Nam Phi 1:2";
            } else return "SPEAKWELL - GV US/UK 1:2";
        } else {
            if (checkTeacherType(teacherVietNam)) {
                return "SPEAKWELL - GV Việt Nam 1:3";
            } else if (checkTeacherType(teacherPhilippines)) {
                return "SPEAKWELL - GV Philippines 1:3";
            } else if (checkTeacherType(teacherNamPhi)) {
                return "SPEAKWELL - GV Nam Phi 1:3";
            } else return "SPEAKWELL - GV US/UK 1:3";
        }
    }
}
