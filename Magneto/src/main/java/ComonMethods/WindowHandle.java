package ComonMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowHandle {
	
	private WebDriver driver;
	public WindowHandle(WebDriver driver) {
		this.driver=driver;
	}
	String mainWindow;
	String child;
	public void getToMainWindow() {
		mainWindow=driver.getWindowHandle();
	}
	
	public void SwitchToChildWindow() {
		Set<String> childWindows=driver.getWindowHandles();
		for(String child:childWindows) {
			driver.switchTo().window(child);
		}
	}
	
	public void SwitchToMainWindow() {
		driver.switchTo().window(mainWindow);
	}
	
	public void maximaizeTheWindow() {
		driver.manage().window().maximize();
	}
	

}
