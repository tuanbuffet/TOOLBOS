package tuanbuffet.common;

import org.openqa.selenium.By;
import tuanbuffet.common.WebUI;

public class Login extends WebUI {
    private String URL = "https://spu.bos.hocmai.com/auth/login";
    private String account = "ctvanhnt2";
    private String password = "anhnt216836";

    private By accountInput = By.xpath("//input[@name=\"username\"]");
    private By passwordInput = By.xpath("//input[@name=\"password\"]");
    private By loginButton = By.xpath("//button[contains(text(),'Login')]");
    public void Login(String account, String password) throws InterruptedException {
        openBrowser();
        openURL(URL);
        setText(accountInput, account);
        setText(passwordInput, password);
        clickElement(loginButton);
        Thread.sleep(3000);
    }
}