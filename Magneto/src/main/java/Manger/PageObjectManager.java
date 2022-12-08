package Manger;

import org.openqa.selenium.WebDriver;

import pageObjects.ComparePage;
import pageObjects.DetailPage;
import pageObjects.RegisterPage;
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
	
	DetailPage dp;
	public DetailPage getTheDetailsPage() {
		return (dp==null)?new DetailPage(driver):dp;
	}
	
	ComparePage cp;
	public ComparePage getTheComparePAge() {
		return(cp==null)?new ComparePage(driver):cp;
	}
	
	RegisterPage rp;
	public RegisterPage getTheRegistrePage() {
		return (rp==null)?new RegisterPage(driver):rp;
	}

}
