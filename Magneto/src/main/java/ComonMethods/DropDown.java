package ComonMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	Select ss;
	public void SelectByVisbleText(WebElement element,String name) throws Exception {
		ss=new Select(element);
		try {
			ss.selectByVisibleText(name);
		}
		catch(Exception e){
			throw new Exception("Element is not present "+element);
		}
		
	}
	
	public void SelectByValue(WebElement element, String value) {
		ss=new Select(element);
		ss.selectByValue(value);
	}
	
	public void SelectByIndex(WebElement element, int index) {
		ss=new Select(element);
		ss.selectByIndex(index);
}
}
