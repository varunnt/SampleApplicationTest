package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import seleniumFunction.*;

public class SearchAndStore implements GenericTestCase{
	private SeleniumFunction sel;
	
	public SearchAndStore(WebDriver driver){
		this.sel = new SeleniumFunctionXpath(driver);
	}
	
	
	@BeforeTest
	public boolean preTest(){
		
		return true;
	}
	@Test
	public boolean test(){
		boolean result;
		result = sel.enterText("xpath", "ace");
		return result;
	}
	
	@AfterTest
	public boolean postTest(){
		return true;
	}
}
