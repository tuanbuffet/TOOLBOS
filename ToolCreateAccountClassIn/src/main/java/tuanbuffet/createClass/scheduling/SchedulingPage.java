package tuanbuffet.createclass.scheduling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import tuanbuffet.common.WebUI;

public class SchedulingPage extends WebUI {
    private final String curriculum;
    public SchedulingPage(String curriculum) {
        if (curriculum.contains("flyer") || curriculum.contains("movers") || curriculum.contains("starter") || curriculum.contains("beginner")){
            this.curriculum = "Kid's Box";
        }
        else if (curriculum.contains("chat room for teen")){
            this.curriculum = "Chat room for teens";
        }
        else this.curriculum = "Four Corners";
    }
    public String getCurriculum() {
        return curriculum;
    }
    public String getCourseName(){
        return curriculum;
    }
    private final By nameCourseInput = By.xpath("//input[@placeholder=\"Khóa Học\"]");
    private final  By startDay = By.xpath("//input[@placeholder=\"ngày/tháng/năm\"]");
    private final  By numberDurationInput = By.xpath("//input[@placeholder=\"Số Buổi\"]");
    private final  By scheduleInput = By.xpath("//input[@placeholder=\"Lịch Học\"]");
    private final  By submitCreateButton = By.xpath("//button[contains(text(),'Tạo Và Sang Bước Kế')]");
    public void addScheduleClass() throws InterruptedException {
        setText(nameCourseInput,getCourseName() + Keys.DOWN + Keys.ENTER);
        Thread.sleep(500);
        setText(startDay,"10102025");
        Thread.sleep(500);
        setText(numberDurationInput,"1");
        Thread.sleep(500);
        setText(scheduleInput,"08:25 - 08:55" + Keys.DOWN + Keys.ENTER );
        Thread.sleep(500);
        clickElement(submitCreateButton);
        Thread.sleep(3000);
    }
}
