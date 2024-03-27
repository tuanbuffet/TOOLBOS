package tuanbuffet.createclass.curriculum;

import org.openqa.selenium.By;
import tuanbuffet.common.WebUI;

public class CurriculumPage extends WebUI {
    private final String curriculumName;

    public CurriculumPage(String curriculumName) {
        this.curriculumName = curriculumName;
    }

    public String getCurriculum() {
        return curriculumName;
    }


    Curriculum curriculum = new Curriculum(getCurriculum());
    Lesson lesson = new Lesson(getCurriculum());
    By chon_Giao_Trinh_Input = By.xpath("//input[@placeholder=\"Chọn Giáo Trình\"]");
    By chooseCurriculum = By.xpath("//input[@placeholder=\"Choose Curriculum\"]");
    By chon_Bai_Hoc_Input = By.xpath("//input[@placeholder=\"Chọn Bài Học\"]");
    By chooseLesson = By.xpath("//input[@placeholder=\"Choose Lesson\"]");
    By saveButton = By.xpath("//button[contains(text(),'Lưu Lại')]");
    public void addCurriculum() throws InterruptedException {
        try {
            setText(chon_Giao_Trinh_Input,curriculum.getCurriculumName());
        }
        catch (Exception e){
            setText(chooseCurriculum, curriculum.getCurriculumName());
        }
        Thread.sleep(1000);
        try {
            setText(chon_Bai_Hoc_Input, lesson.getLesson());
        }
        catch (Exception e){
            setText(chooseLesson,lesson.getLesson());
        }
        Thread.sleep(1000);
        clickElement(saveButton);
    }
}
