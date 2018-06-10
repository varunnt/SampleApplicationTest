package testSuite;

import org.testng.annotations.Test;

import seleniumFunction.SeleniumWrapper;

public class AddComputer {
  @Test
  public void test() {
	  
	  SeleniumWrapper selWrap = SeleniumWrapper.getInstance();
	  selWrap.sel.elementClick("//a[@id='add']");
	  selWrap.sel.enterText("//input[@id='name']", "abcd");
	  selWrap.sel.selectText("//select[@id='company']", "Apple Inc.");
	  selWrap.sel.elementClick("//input[@type='submit']");
	  
  }
}
