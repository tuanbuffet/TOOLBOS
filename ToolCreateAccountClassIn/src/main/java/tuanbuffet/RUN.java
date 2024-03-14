package tuanbuffet;

import tuanbuffet.createAcount.CreateStudent;

public class RUN {
    CreateStudent createStudent = new CreateStudent();
    public void Work(String[][] information) throws InterruptedException {
        for (int i = 0 ; i <information.length; i++){
            createStudent.EnterInformation(information[i][0],information[i][1]);
        }
    }
}
