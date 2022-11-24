package ComonMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public void SelectByVisbleText(WebElement element,String name) throws Exception {
		Select ss=new Select(element);
		try {
			ss.selectByVisibleText(name);
		}
		catch(Exception e){
			throw new Exception("Element is not present "+element);
		}
		
	}

}
