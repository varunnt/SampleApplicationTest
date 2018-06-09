package testExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestExecutor {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Software\\Java Work\\Webdrivers\\FirefoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://computer-database.herokuapp.com/computers");
		TestSuite1 testSuite = new TestSuite1();
		testSuite.run(driver);
	}

}
