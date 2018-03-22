package eukleiaWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EukleiaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/swetha/Desktop/selenium jars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://eukleia.com/");
		
		
		
		
	}

}
