package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex004_MethodChaining {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		Options opt = driver.manage();
//		Window win = opt.window();
//		win.maximize();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
//		WebElement emailField = driver.findElement(By.name("email"));
//		emailField.sendKeys("testing123@gmail.com");

		driver.findElement(By.name("email")).sendKeys("testing123@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("password123");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.quit();
	}

}
