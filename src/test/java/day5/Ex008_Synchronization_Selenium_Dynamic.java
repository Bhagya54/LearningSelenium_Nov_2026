package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*Java - static 
 * Thread.sleep(5000)
 * 1. Elem can load - functional < 5000 -2000
 * 2. Elem can load - functional > 5000 - 100000
 * 
 * Selenium - dynamic -
 * 1. Implicit Wait - Nosuchelement - presence of an element
 * 2. Explicit Wait - other exception we can handle
 */
public class Ex008_Synchronization_Selenium_Dynamic {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
	driver.manage().window().maximize();
	driver.get("https://gmail.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("identifierId")).sendKeys("java@way2automation.com");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	
	WebElement passwordEle=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Passwd']")));
	passwordEle.sendKeys("ghgdhsgadhs");
	driver.findElement(By.cssSelector("div#passwordNext")).click();
	

	WebElement forgotPasswordEle=driver.findElement(By.xpath("//span[contains(text(),'Wrong password')]"));
	String textValue=forgotPasswordEle.getText();
	System.out.println(textValue);

}
}
