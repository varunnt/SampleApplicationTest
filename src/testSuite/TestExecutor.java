package testSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import seleniumFunction.SeleniumWrapper;

public class TestExecutor {
	private WebDriver driver;
@BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.chrome.driver",
				"D:\\Software\\Java Work\\Webdrivers\\choredriver\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get("http://computer-database.herokuapp.com/computers");
		SeleniumWrapper selWrap = SeleniumWrapper.setInstance(this.driver);
  }
@AfterSuite
	public void afterSuite(){
		this.driver.close();	
	}
}
