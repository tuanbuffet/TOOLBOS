package tuanbuffet.createclass.curriculum;

public class Curriculum {
    private final String curriculumName;
    public Curriculum(String curriculum) {
        if (curriculum.contains("Starters")){
            this.curriculumName = "Starters";
        }
        else if (curriculum.contains("Flyers")){
            this.curriculumName = "Flyers";
        }
        else if (curriculum.contains("Beginners")){
            this.curriculumName = "Beginners (NEW PROGRAMME - 48 Lessons)";
        }
        else if (curriculum.contains("Movers")){
            this.curriculumName = "Movers";
        }
        else if (curriculum.contains("Chat room for teens 1")){
            this.curriculumName = "Chat room for teens 1";
        }
        else if (curriculum.contains("Chat room for teens 2")){
            this.curriculumName = "Chat room for teens 2";
        }
        else if (curriculum.contains("Chat room for teens 3")){
            this.curriculumName = "Chat room for teens 3";
        }
        else if (curriculum.contains("Four Corners 1")){
            this.curriculumName = "Four Corners 1";
        }
        else if (curriculum.contains("Four Corners 2")){
            this.curriculumName = "Four Corners 2";
        }
        else this.curriculumName = "Four Corners 3";
    }
    public String getCurriculumName() {
        return curriculumName;
    }
}
