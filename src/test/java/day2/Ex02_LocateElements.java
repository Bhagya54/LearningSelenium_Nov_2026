package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//CTRL+SHIFT+o

public class Ex02_LocateElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement emailField = driver.findElement(By.name("email"));
		emailField.sendKeys("testing123@gmail.com");
		
		WebElement passwordField = driver.findElement(By.name("pass"));
		passwordField.sendKeys("password123");
		
		WebElement loginBtn = driver.findElement(By.xpath("//span[text()='Log in']"));
		loginBtn.click();

	}

}
