package testExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestExecutor {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		TestSuite1 testSuite = new TestSuite1();
		testSuite.run(driver);
	}

}
