package seleniumFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumFunctionXpath implements SeleniumFunction{
	private WebDriver driver;
	public SeleniumFunctionXpath(WebDriver driver){
		this.driver = driver;
		
	}
	
	
	public boolean enterText(String xpath, String value){
		boolean result = false;
		try{
			driver.findElement(By.xpath(xpath)).sendKeys(value);	
			result = true;
		}catch(Exception e){

		}
		return result;

	}
	
	public boolean elementClick(String xpath){
		boolean result = false;
		try{
			driver.findElement(By.xpath(xpath)).click();	
			result = true;
		}catch(Exception e){

		}
		return result;

	}


}
