package tuanbuffet.createClass;

import org.openqa.selenium.By;

public class AddStudnents {
    By informationStudentInput = By.xpath("//input[@placeholder=\"Tìm Kiếm Theo Mã, SĐT Và Tên Học Viên\"] ");
    By searchButton = By.xpath("//button[contains(text(),'Tìm Kiếm')]");
    By nameStudentText = By.xpath("//*[@id=\"root\"]/div/main/form/div[2]/div[1]/div[2]/div[2]/div[1]/table/tbody/tr/td[1]");
    By addStudentButton = By.xpath("//p/button[contains(text(),'Thêm')]");
    By saveAndContinueButton = By.xpath("//button[contains(text(),'Lưu Và Tiếp Tục')]");

}
