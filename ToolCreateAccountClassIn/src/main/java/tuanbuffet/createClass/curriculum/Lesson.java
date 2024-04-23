package tuanbuffet.createclass.curriculum;

public class Lesson {
    private String curriculumName;
    public Lesson(String curriculumName) {
        this.curriculumName = curriculumName;
    }

    public String getCurriculumName() {
        return curriculumName;
    }

    public void setCurriculumName(String curriculumName) {
        this.curriculumName = curriculumName;
    }
    public String getLesson(){
        if (getCurriculumName().contains("Starters 2")){
            return "36";
        } else if (getCurriculumName().contains("Movers 2")||getCurriculumName().contains("Flyers 2") ) {
            return "46";
        } else return "1";
    }
}
