package seleniumFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumFunction{
	private WebDriver driver;
	private WebDriverWait wait;
	public SeleniumFunction(WebDriver driver){
		this.driver = driver;
		this.wait = new WebDriverWait(driver,10);
		
	}
	
	
	public boolean enterText(String xpath, String value){
		boolean result = false;
		try{
			WebElement elem = this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			elem.sendKeys("abcd");	
			result = true;
		}catch(Exception e){

		}
		return result;

	}
	
	public boolean elementClick(String xpath){
		boolean result = false;
		
		try{
			WebElement elem = this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			elem.click();	
			result = true;
		}catch(Exception e){

		}
		return result;

	}
	
	public boolean selectText(String xpath, String value){
		boolean result = false;
		
		try{
			WebElement elem = this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			Select select = new Select(elem);
			select.selectByVisibleText(value);	
			result = true;
		}catch(Exception e){

		}
		return result;
	}


}