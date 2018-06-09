package testExecutor;

import org.openqa.selenium.WebDriver;

import testCases.*;

public class TestSuite1 {
	
	public boolean run(WebDriver driver){
		boolean result;
		AddComputer test = new AddComputer(driver);
		result = test.preTest();
		result = test.test();
		result = test.postTest();
		return result;
	}

}
