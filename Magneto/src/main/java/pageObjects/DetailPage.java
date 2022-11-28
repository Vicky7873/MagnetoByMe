package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ComonMethods.ComapreBetweenTwoString;

public class DetailPage {
	
	private WebDriver driver;
	ComapreBetweenTwoString cms=new ComapreBetweenTwoString();
	public DetailPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@title=\"Qty\"]")
	@CacheLookup
	WebElement textBox_Quantity;
	
	@FindBy(xpath="//button[@title=\"Update\"]")
	@CacheLookup
	WebElement btn_update;
	
	@FindBy(xpath="//li[@class=\"error-msg\"]")
	@CacheLookup
	WebElement getTxt_errorMsg;
	
	@FindBy(xpath="//button[@id=\"empty_cart_button\"]")
	@CacheLookup
	WebElement btn_emptyCart;
	
	@FindBy(xpath="//div[@class=\"page-title\"]")
	@CacheLookup
	WebElement title_shoppingCart;
	
	public void enterTheQuantity(String int1) {
		textBox_Quantity.click();
		textBox_Quantity.clear();
		textBox_Quantity.sendKeys(int1);
	}
	
	public void clickOnUpdateButton() {
		btn_update.click();
	}
	
	public String getTheErrorMsg() {
		return getTxt_errorMsg.getText();
	}
	
	public void validateTheErrorMsg() {
		String actual=getTheErrorMsg();
		System.out.println(actual);
		String expected="Some of the products cannot be ordered in requested quantity.";
		cms.compareTheExpectedAndAual(expected, actual);
	}
	
	public void clickonEmptyCart() {
		btn_emptyCart.click();
	}
	
	public String GetTheTxtOfShoppingCart() {
		return title_shoppingCart.getText();
	}
	
	public void ValidateTheTitle() {
		String actual=GetTheTxtOfShoppingCart();
		String expected="Shopping Cart is Empty";
		cms.compareTheExpectedAndAual(expected, actual);
	}

}
