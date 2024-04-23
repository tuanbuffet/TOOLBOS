package tuanbuffet.common;

import org.openqa.selenium.By;

import java.util.Scanner;

public class Login extends WebUI {
    private String URL = "https://spu.bos.hocmai.com/auth/login";

    private final By accountInput = By.xpath("//input[@name=\"username\"]");
    private final  By passwordInput = By.xpath("//input[@name=\"password\"]");
    private final  By loginButton = By.xpath("//button[contains(text(),'Login')]");
    private final  By notificationTextFail = By.xpath("//form/p");
    private final  By titlePageText = By.xpath("//h4[text()='Tổng Quan']");
    Scanner sc = new Scanner(System.in);
    public void login() throws InterruptedException {
        openBrowser();
        for (int i = 0; i < 2; i++){
            openURL(URL);
            setText(accountInput, "hocmai");
            setText(passwordInput, "Hocmai@1234");
            clickElement(loginButton);
            Thread.sleep(3000);
                if (verifyElementIsDisplay(notificationTextFail,5)){
                    System.out.println("Sai tài khoản hoặc mật khẩu!");
                    System.out.println("Mời bạn nhập lại nhé!!!");
                    i--;
                }
                else if (verifyElementIsDisplay(titlePageText,5)){
                    System.out.println("Đăng nhập tài khoản thành công!");
                    break;
                }
                else {
                    for (int j = 0; j < 3 ; j++){
                    Thread.sleep(1000);
                    j -= 1;
                }
            }

        }
    }
}