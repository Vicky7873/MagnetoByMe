package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ComonMethods.DropDown;
import ComonMethods.ScreenShot;

public class mobile_list_page {
	
	private WebDriver driver;
	DropDown dd=new DropDown();
	ScreenShot ss; 
	public mobile_list_page(WebDriver driver) {
		PageFactory.initElements(driver,this);
		ss=new ScreenShot(driver);
	}
	
	
	@FindBy(xpath="//div[@class=\"page-title\"]")
	@CacheLookup
	WebElement getTxt_Title;
	
	@FindBy(xpath="//*[@class=\"level0 nav-1 first\"]//*[@class=\"level0 \"]")
	@CacheLookup
	WebElement link_Mobile;
	
	@FindBy(xpath="//*[@class=\"page-title category-title\"]")
	@CacheLookup
	WebElement getText_MobilePageTitle;
	
	@FindBy(xpath="(//select[@title='Sort By'])[1]")
	@CacheLookup
	WebElement dropDown_SortBy;
	
	@FindBy(xpath="//a[@title='Sony Xperia']")
	@CacheLookup
	WebElement link_txt_sonyXperia;
	
	@FindBy(xpath="//span[@id='product-price-1']")
	@CacheLookup
	WebElement getTxt_SonyXperiaPrice;
	
	@FindBy(xpath="//span[@id='product-price-1']//span")
	@CacheLookup
	WebElement getTxt_detailPgaePriceofSonyxperia;
	
	@FindBy(xpath="//li[3]//div[1]//div[3]//button[1]")
	@CacheLookup
	WebElement btn_add_to_cart_SonyExperia;
	
	
	
	public void GetTheTitleofThePage() {
		String Title=getTxt_Title.getText();
		System.out.println(Title);
	}
	
	public void clickOnMobileLInk() {
		link_Mobile.click();
	}
	
	public void getTheTextOfMobileListPage() {
		String title=getText_MobilePageTitle.getText();
		System.out.println(title);
	}
	
	public void SelectTheDropDown() throws Exception {
		dd.SelectByVisbleText(dropDown_SortBy, "Name");
	}
	
	public void VerifyAllProductsSortedByname() throws IOException {
		ss.takeTheScreenshot();
	}
	
	public void getTheTxtOfSonyXperia() {
		String txt=link_txt_sonyXperia.getText();
		System.out.println(txt);
		
	}
	
	public String getTePriceOfSonyXperia() {
		return getTxt_SonyXperiaPrice.getText();
	}
	
	public void clickOnsonyXperia() {
		link_txt_sonyXperia.click();
	}
	
	public String getThepriceInDetilpageOfSonyXperia() {
		return getTxt_detailPgaePriceofSonyxperia.getText();
	}
	
	public void clickOnAddToCart() {
		btn_add_to_cart_SonyExperia.click();
	}

}
