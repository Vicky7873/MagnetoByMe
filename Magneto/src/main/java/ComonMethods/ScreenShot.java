package ComonMethods;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	private WebDriver driver;
	public ScreenShot(WebDriver driver) {
		this.driver=driver;
	}
	
	public void takeTheScreenshot() throws IOException {
		TakesScreenshot sr=(TakesScreenshot)driver;
		File Source=sr.getScreenshotAs(OutputType.FILE);
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		Date date=new Date();
		String actualDate=sdf.format(date);
		
		File target=new File(System.getProperty("user.dir")+"/ScreenShot/"+actualDate+" Bhiki.png");
		FileUtils.copyFile(Source, target);
	}

}
