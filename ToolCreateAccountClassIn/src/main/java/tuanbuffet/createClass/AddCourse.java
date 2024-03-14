package tuanbuffet.createClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import tuanbuffet.common.WebUI;

public class AddCourse extends WebUI {
    private By nameCourseInput = By.xpath("//input[@placeholder=\"Khóa Học\"]");
    private By startDay = By.xpath("//input[@placeholder=\"ngày/tháng/năm\"]");
    private By numberDurationInput = By.xpath("//input[@placeholder=\"Số Buổi\"]");
    private By scheduleInput = By.xpath("//input[@placeholder=\"Lịch Học\"]");
    private By submitCreateButton = By.xpath("//button[contains(text(),'Tạo Và Sang Bước Kế')]");
    public void EnterClassInformation() throws InterruptedException {
        setText(nameCourseInput,"Kid's Box" + Keys.DOWN + Keys.ENTER);
        Thread.sleep(500);
        setText(startDay,"10102025");
        Thread.sleep(500);
        setText(numberDurationInput,"1");
        Thread.sleep(500);
        setText(scheduleInput,"08:25 - 08:55" + Keys.DOWN + Keys.ENTER );
        Thread.sleep(500);
        clickElement(submitCreateButton);
    }
}
