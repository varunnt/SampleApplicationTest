package seleniumFunction;

import org.openqa.selenium.WebDriver;

public class SeleniumWrapper {
	
	private static SeleniumWrapper single_instance = null;
    private WebDriver driver;
    public SeleniumFunction sel;
    private SeleniumWrapper(WebDriver driver)
    {
        this.driver = driver;
        this.sel = new SeleniumFunction(this.driver);
    }
    public static SeleniumWrapper setInstance(WebDriver driver)
    {
        if (single_instance == null)
            single_instance = new SeleniumWrapper(driver);
 
        return single_instance;
    }
    public static SeleniumWrapper getInstance()
    { 
        return single_instance;
    }

}
