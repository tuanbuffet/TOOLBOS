package tuanbuffet.packageCourse;

import org.openqa.selenium.By;
import tuanbuffet.common.WebUI;

public class addPackage extends WebUI {
    private String URL = "https://spu.bos.hocmai.com/students";
    private By searchInput = By.xpath("//*[@name=\"nameOrPhoneOrCode\"]");
    private By submitButton = By.xpath("//button[(text()=\"Tìm Kiếm\")]");
    public void SearchInformationStudent (String studentCode, String nameTeacher) throws InterruptedException {
        openURL(URL);
        setText(searchInput, studentCode);
        clickElement(submitButton);
        Thread.sleep(3000);

    }

}
