package tuanbuffet;

import tuanbuffet.common.Login;
import tuanbuffet.createclass.RunCreateNewClass;
import tuanbuffet.listnameteacher.getListTeacherName;

public class Main {
    static String[] information = {
    };
    static RunCreateNewClass runCreateNewClass = new RunCreateNewClass(information);
    static getListTeacherName listNameTeacher = new getListTeacherName();
    public static void main(String[] args) throws InterruptedException{
        Login login = new Login();
        login.login(/*"ctvanhnt2","anhnt216836"*/);
        runCreateNewClass.RUN();
    }

    String name;
    String teacherName;
    
}