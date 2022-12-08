package ComonMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethod {
	
	private WebDriver driver;
	public WaitMethod(WebDriver driver) {
		this.driver=driver;
		wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	}
	
	WebDriverWait wait;
	public String waitForVisibilityOfElementandGetTheTxt(WebElement element) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		return wait.until(ExpectedConditions.elementToBeClickable(element)).getText();
	}
	
	public void waitForTheElementIsToclickable(WebElement ele) {
		wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
	}

}
