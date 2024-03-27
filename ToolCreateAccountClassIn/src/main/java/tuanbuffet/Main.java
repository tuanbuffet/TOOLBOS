package tuanbuffet;

import tuanbuffet.common.Login;
import tuanbuffet.createclass.RunCreateNewClass;
import tuanbuffet.getlistnameteacher.ListNameTeacher;

public class Main {
    static String[][] information = {
            {"demo","phunglien25071988@gmail.com","968732317","SPU 1:2","Thứ ba: 19:10-19:40Thứ sáu: 19:10-19:40","Thành Đạt 2","Chat room for teens 1","ST111111"},
            {"test","phunglien25071988@gmail.com","968732317","SPU 1:2","Thứ ba: 19:10-19:40Thứ sáu: 19:10-19:40","Thành Đạt 2","Chat room for teens 1","ST11111"},
            {"demo ","phunglien25071988@gmail.com","968732318","SPU 1:1","Thứ ba: 19:10-19:40Thứ sáu: 19:10-19:40","Thành Đạt 3","Chat room for teens 1","ST111493"},
            /*{"test","phunglien25071988@gmail.com","968732317","SPU 1:1","Thứ ba: 19:10-19:40Thứ sáu: 19:10-19:40","Thành Đạt 2","Chat room for teens 1","ST111492"},
            {"Nguyễn Thành Long 15","phunglien25071988@gmail.com","968732318","SPU 1:1","Thứ ba: 19:10-19:40Thứ sáu: 19:10-19:40","Thành Đạt 3","Chat room for teens 1","ST111493"},*/
    };
    static RunCreateNewClass runCreateNewClass = new RunCreateNewClass(information);
    static ListNameTeacher listNameTeacher = new ListNameTeacher();
    public static void main(String[] args) throws InterruptedException{
        Login login = new Login();
        login.Login("ctvanhnt2","anhnt216836");
        runCreateNewClass.RUN();
    }
}