package tuanbuffet;

import tuanbuffet.common.Login;
import tuanbuffet.createClass.AddCourse;
import tuanbuffet.createClass.CreateNewClass;

public class Main {
    static CreateNewClass createNewClass = new CreateNewClass();
    static AddCourse addCourse = new AddCourse();
    public static void main(String[] args) throws InterruptedException{
        String[][] information = {
                {"name","phone","","",""},
                {"Nguyễn Đình Thái An","985426734","",""," "},
                {"Dương Phước Minh","914760159","",""," "},
                {"Phan Lê Bảo","976321553","",""," "},
                {"Phùng Bảo An","856583042","",""," "},
                {"Võ Thanh Hà 2","902614785","",""," "},
                {"Nguyễn Phương Anh 31","353498318","",""," "},
                {"Lê Hùng Minh","917649889","",""," "},
                {"Nguyễn Bá Lương 2","973588871","",""," "},
                {"Đặng Trần Ngân Khánh","984682468, 942620222","",""," "},
                {"Nguyễn Hoàng Hiệp 5","977331363","",""," "},
                {"Phạm Trần Ngọc Long","888442007","",""," "},
                {"Đỗ Minh Dũng","936592678","",""," "},
                {"Huỳnh Lê Bảo Ngọc","902886032","",""," "},
                {"Trịnh Minh Quân 5","947650678","",""," "},
                {"Lê Hoàng Đức Kiên","936141383","",""," "},
                {"Bùi Lê Trúc Quyên","989113956","",""," "},
                {"Nguyễn Văn Khánh Nghĩa","938366384","",""," "}

        };
        Login login = new Login();
        RUN run = new RUN();
        login.Login("ctvanhnt2","anhnt216836");

        run.Work(information);
        createNewClass.CreateNewClass();
        addCourse.EnterClassInformation();
    }
}