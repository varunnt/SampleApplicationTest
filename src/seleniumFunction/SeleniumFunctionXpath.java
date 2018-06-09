package seleniumFunction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumFunctionXpath implements SeleniumFunction{
	private WebDriver driver;
	public SeleniumFunctionXpath(WebDriver driver){
		this.driver = driver;
		this.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
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
	
	public boolean selectText(String xpath, String value){
		boolean result = false;
		
		try{
			Select select = new Select(driver.findElement(By.xpath(xpath)));
			select.selectByVisibleText(value);	
			result = true;
		}catch(Exception e){

		}
		return result;
	}


}
