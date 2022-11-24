package Manger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MasterManager {
	
	private WebdriverManger webdriverManger;
	private PageObjectManager pom;
	
	public MasterManager() {
		webdriverManger=new WebdriverManger();
		pom=new PageObjectManager(webdriverManger.setTheDriver());
	}
	
	public WebdriverManger getTheWebDriverManager() {
		return webdriverManger;
	}
	
	public PageObjectManager GetThePageObjectManager() {
		return pom;
	}

}
