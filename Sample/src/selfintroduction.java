
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class selfintroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","/Users/mayurijoshi/Downloads/geckodriver");
		//System.setProperty("webdriver.chrome.driver","/Users/mayurijoshi/Downloads/chromedriver");
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
		driver.close();
	}

	
}
