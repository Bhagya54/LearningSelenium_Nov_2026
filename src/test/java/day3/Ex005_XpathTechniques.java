package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex005_XpathTechniques {
	/*
	 * XPATH
1.Basic Syntax:
//tagname[@attribute='attrValue']
//input[@name='email']
//input[@id='_R_c9l6neappb6amH1_']

2.Multiple Attributes
//input[@name='email' and @id='_R_c9l6neappb6amH1_']
//input[@name='email' or @id='_R_c9l6neappb6amH1_']

3.text()
//tagname[text()='textValue']
//span[text()='Log in']

4.contains - text()
//tagname[contains(text(),'subtextValue')]
//span[contains(text(),'Log')]

5.If duplicate values are identified - apply index - start with 1
(//span[contains(text(),'Log')])[2]

6. contains - attributes
//span[contains(@id,'xyz')]

id="_R_c9l6neappb6amH1_"
id=_R_cdl6neappb6amH1_
//input[contains(@id,'6amH1_')]
//input[contains(@name,'ema')]
	 */

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("student");
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		if(actualTitle.contains("Logged In")) {
			System.out.println("Login is successful");
		}
		else {
			System.out.println("Not Successful");
		}
	
	}

}
