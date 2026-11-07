package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex01_BrowserCompatibility {

	public static void main(String[] args) {
		String browserName="Edge";
		WebDriver driver = null;
		if(browserName.equals("Chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equals("Firefox")) {
			 driver = new FirefoxDriver();
		}
		else if(browserName.equals("Edge")) {
			 driver = new EdgeDriver();
		}

		
		driver.get("https://google.com");
		String url = driver.getCurrentUrl();
		System.out.println("Url: " + url);
		
		String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Titles are matching - Pass");
		}
		else {
			System.out.println("Titles are not matching - Fail");
		}
		
		driver.quit();

	}

}
