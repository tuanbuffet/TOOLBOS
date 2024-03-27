package tuanbuffet.getlistnameteacher;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import tuanbuffet.common.WebUI;

public class ListNameTeacher extends WebUI {
     String URL = "https://spu.bos.hocmai.com/teachers";
    By selectProductInput = By.xpath("//input[@placeholder=\"Chọn Sản Phẩm\"]");
    By searchTeacherButton = By.xpath("//button[text()='Tìm Kiếm']");
    By nextPageButton = By.xpath("//button[@aria-label=\"Go to next page\"]");

    public void getListNameTeacher(String product) throws InterruptedException {
        openURL(URL);
        setText(selectProductInput,product + Keys.DOWN + Keys.ENTER);
        clickElement(searchTeacherButton);
        Thread.sleep(5000);
        for (int i = 0; i <= 100; i++){
            for (int j = 1; j <= listElements(By.xpath("//tbody/tr")); j++){
                if (j == 26) System.out.println();
                System.out.print('"' + getTextElement(By.xpath("//tbody/tr["+ j +"]/td[2]")) + '"' + ",");
            }
            clickElement(nextPageButton);
            Thread.sleep(5000);
            System.out.println();
        }

    }
}
