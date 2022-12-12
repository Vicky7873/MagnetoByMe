package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ComonMethods.ComapreBetweenTwoString;
import ComonMethods.DropDown;
import RandomUtils.randomClass;

public class BillingPage {
	
	private WebDriver driver;
	randomClass rc=new randomClass();
	DropDown dd=new DropDown();
	ComapreBetweenTwoString cp=new ComapreBetweenTwoString();
	public BillingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name=\"login[username]\"]")
	@CacheLookup
	WebElement input_loginId;
	
	@FindBy(xpath="//input[@name=\"login[password]\"]")
	@CacheLookup
	WebElement input_paswword;
	
	@FindBy(xpath="//button[@title=\"Login\"]")
	@CacheLookup
	WebElement btn_login;
	
	@FindBy(xpath="//div[@class=\"block-content\"]//a[contains(text(),'My Wishlist')]")
	@CacheLookup
	WebElement btn_MyWishlist;
	
	@FindBy(xpath="//div[@class='cart-cell']//button[@title='Add to Cart']")
	@CacheLookup
	WebElement btn_addToCart;
	
	@FindBy(xpath="//select[@name=\"country_id\"]")
	@CacheLookup
	WebElement dropDown_country;
	
	@FindBy(xpath="//select[@title=\"State/Province\"]")
	@CacheLookup
	WebElement dropDown_state;
	
	@FindBy(id="postcode")
	@CacheLookup
	WebElement input_postalCode;
	
	@FindBy(xpath="//button[@title=\"Estimate\"]")
	@CacheLookup
	WebElement btn_Estimate;
	
	@FindBy(xpath="//label[@for=\"s_method_flatrate_flatrate\"]/span[@class=\"price\"]")
	@CacheLookup
	WebElement gettxt_flatRAte;
	
	@FindBy(xpath="//input[@id=\"s_method_flatrate_flatrate\"]")
	@CacheLookup
	WebElement rdoBtn_fixedRate;
	
	@FindBy(xpath="//button[@title=\"Update Total\"]")
	@CacheLookup
	WebElement btn_updateTotal;
	
	@FindBy(xpath="//strong/span[@class=\"price\"]")
	WebElement getTxt_grandTotalPrice;
	
	@FindBy(xpath="//li[@class=\"method-checkout-cart-methods-onepage-bottom\"]//button[@title=\"Proceed to Checkout\"]")
	@CacheLookup
	WebElement btn_proceedToCheckWithOut;
	
	@FindBy(xpath="//input[@id=\"billing:street1\"]")
	@CacheLookup
	WebElement input_BillingAddress;
	
	@FindBy(xpath="//input[@id=\"billing:city\"]")
	@CacheLookup
	WebElement input_billingCity;
	
	@FindBy(xpath="//select [@id=\"billing:region_id\"]")
	@CacheLookup
	WebElement dropdown_BillingState;
	
	@FindBy(xpath="//input[@id=\"billing:postcode\"]")
	@CacheLookup
	WebElement input_BillingzipCode;
	
	@FindBy(xpath="//select[@name=\"billing[country_id]\"]")
	@CacheLookup
	WebElement dropdown_billingCountry;
	
	@FindBy(xpath = "//input[@name=\"billing[telephone]\"]")
	@CacheLookup
	WebElement input_billingTelephone;
	
	@FindBy(xpath="//div[@id=\"billing-buttons-container\"]//button[@title=\"Continue\"]")
	@CacheLookup
	WebElement btn_billingContinueButton;
	
	@FindBy(xpath="//button[@onclick=\"shippingMethod.save()\" and @type=\"button\"]")
	@CacheLookup
	WebElement btn_continueShippingMethod;
	
	@FindBy(xpath="//input[@id=\"p_method_checkmo\"]")
	@CacheLookup
	WebElement rdo_Checkcash;
	
	@FindBy(xpath="//button[@onclick=\"payment.save()\"]")
	@CacheLookup
	WebElement cbtn_continue_Payment;
	
	@FindBy(xpath="//button[@onclick=\"review.save();\"]")
	@CacheLookup
	WebElement btn_PlaceOrder;
	
	@FindBy(xpath="//div[@class=\"col-main\"]//p[1]")
	@CacheLookup
	WebElement getTxt_OrderNumber;
	
	public void enterUserName() {
		input_loginId.sendKeys(rc.emailID);
	}
	
	public void enterPassword() {
		input_paswword.sendKeys(rc.password);
	}
	
	public void clickOnLoginButton() {
		btn_login.click();
	}
	
	public void clickOnMyWishListLink() {
		btn_MyWishlist.click();
	}
	
	public void clickOnAddToCartLink() {
		btn_addToCart.click();
	}
	
	public void enterTheShippingDetails() throws Exception {
		dd.SelectByVisbleText(dropDown_country, "United States");
		dd.SelectByVisbleText(dropDown_state, "New York");
		input_postalCode.sendKeys("12345");
	}
	
	public void clickOnEstimate() {
		btn_Estimate.click();
	}
	
	public void VerifyTheSippingCostIsgenerated() {
		String flat_Rate=gettxt_flatRAte.getText();
		String expected="$5.00";
		cp.compareTheExpectedAndAual(flat_Rate, expected);
	}
	String BeforeUpdate;
	public void SelectShippingCostAndUpdate() {
		BeforeUpdate=getTxt_grandTotalPrice.getText();
		System.out.println(BeforeUpdate);
		rdoBtn_fixedRate.click();
		btn_updateTotal.click();
	}
	
	public void verifyShippingcostAddedtoTotal() {
		String AfterUpdate=getTxt_grandTotalPrice.getText();
		System.out.println(AfterUpdate);
		String remove_BeforeUpdate=BeforeUpdate.replace("$", "");
		float beforeUpdate=Float.parseFloat(remove_BeforeUpdate);
		System.out.println(remove_BeforeUpdate);
		String remove_AfterUpdate=AfterUpdate.replace("$", "");
		System.out.println(remove_AfterUpdate);
		float afterUpdate=Float.parseFloat(remove_AfterUpdate);
		int finalBefore=(int) beforeUpdate;
		int finalAfter=(int) afterUpdate;
		
		if(finalBefore<finalAfter) {
			System.out.println("Bill is added to the grandTotal");
		}
		else {
			System.out.println("Bill is not added to the grandTotal");
		}
	}
	
	public void clickOnCheckToProceed() {
		btn_proceedToCheckWithOut.click();
	}
	
	public void enterBillingInformation() throws Exception {
		input_BillingAddress.sendKeys("abxy");
		input_billingCity.sendKeys("New York");
		dd.SelectByVisbleText(dropdown_BillingState, "New York");
		input_BillingzipCode.sendKeys("12345");
		dd.SelectByVisbleText(dropdown_billingCountry, "United States");
		input_billingTelephone.sendKeys("123456789");
		btn_billingContinueButton.click();
	}
	
	public void clickOnContinueOnShippingMethod() {
		btn_continueShippingMethod.click();
	}
	
	public void clickOnCheckOrCashAndContinue() {
		rdo_Checkcash.click();
		cbtn_continue_Payment.click();
	}
	
	public void clickOnPlaceOrder() {
		btn_PlaceOrder.click();
	}
	
	public void VerifyTheOrederNumber() {
		String orderNumbr=getTxt_OrderNumber.getText();
		System.out.println(orderNumbr);
	}
	
}
