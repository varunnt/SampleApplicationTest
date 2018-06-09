package testExecutor;

import org.openqa.selenium.WebDriver;

import testCases.SearchAndStore;

public class TestSuite1 {
	
	public boolean run(WebDriver driver){
		boolean result;
		SearchAndStore test = new SearchAndStore(driver);
		result = test.preTest();
		result = test.test();
		result = test.postTest();
		return result;
	}

}
