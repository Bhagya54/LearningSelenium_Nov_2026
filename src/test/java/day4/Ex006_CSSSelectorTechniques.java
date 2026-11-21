package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex006_CSSSelectorTechniques {
/*
 * css - 
1.Basic Syntax

tagname[att_name='att_value'] - input[aria-label='Google Search']

2.id value
tagname#idValue
div#dh215c

3.class value
tagname.classValue
div.zs1JGd
div.acUsEb.gwogMd

4.combination
div#dh215c[role='presentation']

5.attribute is starts with some attribute value
tagname[att_name^='att_value']
input[aria-label^='Google']

6.attribute is ends with some attribute value
tagname[att_name$='att_value']
input[aria-label$='Search']


5.attribute contains some attribute value
tagname[att_name*='att_value']
input[aria-label*='Sea']

6. Parent - child
form[id='login_form']>div>div:last-child
form[id='login_form']>div>div:first-child
form[id='login_form']>div>div:nth-child(2)
 */
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.cssSelector("input#username")).sendKeys("student");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Password123");
		driver.findElement(By.cssSelector("button.btn")).click();
		
		//If the url contains - logged-in-success
		String url=driver.getCurrentUrl();
		if(url.contains("logged-in-success")) {
			System.out.println("URL Verified: Login is successfull: " + url);
		}
		else {
			System.out.println("Failed");
		}
		//If the title contains - Logged In Successfully
		String title=driver.getTitle();
		if(title.contains("Logged In Successfully")) {
			System.out.println("Title Verified: Login is successfull: " + title);
		}
		else {
			System.out.println("Failed");
		
		//Logged In Successfully element is displayed
		WebElement loginSuccess=driver.findElement(By.cssSelector("h1.post-title"));
		if(loginSuccess.isDisplayed()) {
			System.out.println("Element Verified:Login is successfull");
		}
		else {
			System.out.println("Failed");
		}
		
		}
	}
}
		
		



