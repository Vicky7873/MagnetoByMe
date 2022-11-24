package Manger;

import org.openqa.selenium.WebDriver;

import pageObjects.mobile_list_page;

public class PageObjectManager {
	
	private WebDriver driver;
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	mobile_list_page mlp;
	public mobile_list_page getTheMobileListPage() {
		return (mlp==null)?new mobile_list_page(driver):mlp;
	}

}
