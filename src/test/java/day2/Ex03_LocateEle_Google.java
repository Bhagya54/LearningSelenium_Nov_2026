package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex03_LocateEle_Google {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
//		WebElement storeLink=driver.findElement(By.linkText("Store"));
//		storeLink.click();
		
		//Method Chaining
		driver.findElement(By.linkText("Store")).click();
	}

}
