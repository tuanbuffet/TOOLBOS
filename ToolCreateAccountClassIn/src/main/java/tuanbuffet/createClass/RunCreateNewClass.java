package tuanbuffet.createclass;

public class RunCreateNewClass {
    private final String[][] information;


    public RunCreateNewClass(String[][] information){
        this.information = information;
    }
    public void RUN() throws InterruptedException {
        for (int i = 0; i < this.information.length; i++){
            if (i < this.information.length - 1){
                ClassNew classNew = new ClassNew(information[i][0],information[i][1],information[i][2],information[i][3],information[i][4],information[i][5],information[i][6],information[i][7],information[i+1][0],information[i+1][1],information[i+1][2],information[i+1][3],information[i+1][4],information[i+1][5],information[i+1][6],information[i+1][7]);
            }
            else {
                ClassNew classNew = new ClassNew(information[i][0],information[i][1],information[i][2],information[i][3],information[i][4],information[i][5],information[i][6],information[i][7],"","","","","","","","");

                classNew.createClass(information[i][0],information[i][1],information[i][2],information[i][3],information[i][4],information[i][5],information[i][6],information[i][7],"","","","","","","","");
            }
        }
    }
}
