package tuanbuffet.createclass.scheduling;

public class CourseName {
    private final String curriculum;

    public CourseName(String curriculum) {
        if (curriculum.contains("flyer") || curriculum.contains("movers") || curriculum.contains("starter") || curriculum.contains("beginner")){
            this.curriculum = "Kid's Box";
        }
        else if (curriculum.contains("chat room for teen")){
            this.curriculum = "Chat room for teens";
        }
        else this.curriculum = "Four Corners";
    }
    public String getCourseName(){
        return curriculum;
    }
}
