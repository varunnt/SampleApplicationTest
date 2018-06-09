package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import seleniumFunction.SeleniumFunction;
import seleniumFunction.SeleniumFunctionXpath;

public class AddComputer implements GenericTestCase {
	private SeleniumFunction sel;
	
	public AddComputer(WebDriver driver){
		this.sel = new SeleniumFunctionXpath(driver);
	}
	
	
	@BeforeTest
	public boolean preTest(){
		
		return true;
	}
	@Test
	public boolean test(){
		boolean result;
		result = sel.elementClick("//a[@id='add']");
		result = sel.enterText("//input[@id='name']", "testComputer");
		result = sel.selectText("//select[@id='company']", "RCA");
		result = sel.elementClick("//input[@type='submit']");
		return result;
	}
	
	@AfterTest
	public boolean postTest(){
		return true;
	}

}
