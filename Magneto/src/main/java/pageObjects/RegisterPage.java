package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ComonMethods.ScreenShot;
import ComonMethods.WaitMethod;

public class RegisterPage {
	
	private WebDriver driver;
	ScreenShot ss;
	WaitMethod wait;
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		ss=new ScreenShot(driver);
		wait=new WaitMethod(driver);
	}
	
	@FindBy(xpath="//div[@class=\"footer\"]//a[contains(text(),\"My Account\")]")
	@CacheLookup
	WebElement link_myAccount;
	
	@FindBy(xpath="//a[@title=\"Create an Account\"]")
	@CacheLookup
	WebElement btn_createAnAccount;
	
	@FindBy(xpath="//input[@id=\"firstname\"]")
	@CacheLookup
	WebElement input_FirstName;
	
	@FindBy(xpath="//input[@id=\"lastname\"]")
	@CacheLookup
	WebElement input_lastName;
	
	@FindBy(xpath="//input[@id=\"email_address\"]")
	@CacheLookup
	WebElement input_emailId;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	@CacheLookup
	WebElement input_password;
	
	@FindBy(xpath="//input[@id=\"confirmation\"]")
	@CacheLookup
	WebElement input_confirmPassowrd;
	
	@FindBy(xpath="//button[@title=\"Register\"]")
	@CacheLookup
	WebElement btn_register;
	
	@FindBy(xpath="//a[contains(text(),\"TV\")]")
	@CacheLookup
	WebElement btn_TV;
	
	@FindBy(xpath="//li[1]//div[1]//div[3]//ul[1]//li[1]//a[1]")
	@CacheLookup
	WebElement link_addToWishlist;
	
	@FindBy(xpath="//button[@title=\"Share Wishlist\"]")
	WebElement btn_shareWishList;
	
	@FindBy(xpath="//textarea[@name=\"emails\"]")
	@CacheLookup
	WebElement text_emails;
	
	@FindBy(xpath="//li[@class=\"success-msg\"]")
	@CacheLookup
	WebElement getTxt_shredWishList;
	
	public void clickOnMyAccount() {
		link_myAccount.click();
	}
	
	public void clickOnCreateAnAccount() {
		btn_createAnAccount.click();
	}
	
	public void EnterTheCredentials(String fn,String ln,String mail,String psw,String cnfpsw) {
		input_FirstName.sendKeys(fn);
		input_lastName.sendKeys(ln);
		input_emailId.sendKeys(mail);
		input_password.sendKeys(psw);
		input_confirmPassowrd.sendKeys(cnfpsw);
	}
	
	public void clickOnRegisterButton() {
		btn_register.click();
	}
	
	public void clickOnTV() {
		btn_TV.click();
	}
	
	public void clickOnAddToWishlist() {
		link_addToWishlist.click();
	}
	
	public void clickOnShareWishList() {
		//btn_shareWishList.click();
		wait.waitForTheElementIsToclickable(btn_shareWishList);
	}
	
	public void enterTheEmailIDForSharing() {
		text_emails.sendKeys("vicky.pallai900@gmail.com");
	}
	
	public void PrintTheTitleOfTheShareWishLIst() {
		System.out.println(getTxt_shredWishList.getText());
	}
	
	public void TakeTheScreenshot() throws IOException {
		ss.takeTheScreenshot();
	}
	
	public void waitForTheSharewishList() {
		if(btn_shareWishList.isDisplayed()) {
			btn_shareWishList.click();
			System.out.println("Button is dispalyed");
		}
		else {
			wait.waitForTheElementIsToclickable(btn_shareWishList);
		}
	}

}
