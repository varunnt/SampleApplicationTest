package testSuite;

import org.testng.annotations.Test;

import seleniumFunction.SeleniumWrapper;

public class SearchAndDelete {
  @Test
  public void test() {
	  SeleniumWrapper selWrap = SeleniumWrapper.getInstance();
	  selWrap.sel.enterText("//input[@id='searchbox']", "abcd");
	  selWrap.sel.elementClick("//input[@id='searchsubmit']");
	  selWrap.sel.elementClick("//table[@class='computers zebra-striped']//tr//td[1]/a");
	  selWrap.sel.elementClick("//input[@type='submit' and @value='Delete this computer']");
  
  }
}
