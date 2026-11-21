package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*Java - static 
 * Thread.sleep(5000)
 * 1. Elem can load - functional < 5000 -2000
 * 2. Elem can load - functional > 5000 - 100000
 * 
 * Selenium - dynamic -
 * 1. Implicit Wait
 * 2. Explicit Wait
 */
public class Ex007_Synchronization_Java_Static {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://gmail.com");
	driver.findElement(By.id("identifierId")).sendKeys("trainer@way2automation.com");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(5000);//hard wait 
	driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("ghgdhsgadhs");
	driver.findElement(By.cssSelector("div#passwordNext")).click();
	
	Thread.sleep(5000);
	WebElement forgotPasswordEle=driver.findElement(By.xpath("//span[contains(text(),'Wrong password')]"));
	String textValue=forgotPasswordEle.getText();
	System.out.println(textValue);

}
}
