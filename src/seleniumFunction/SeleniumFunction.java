package seleniumFunction;

public interface SeleniumFunction {
	public boolean elementClick(String xpath);
	public boolean enterText(String xpath, String value);
	public boolean selectText(String xpath, String value);
}
