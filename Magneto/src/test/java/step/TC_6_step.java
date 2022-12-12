package step;

import Manger.MasterManager;
import io.cucumber.java.en.*;
import pageObjects.BillingPage;

public class TC_6_step {
	
	MasterManager mm;
	BillingPage bp;
	public TC_6_step(MasterManager am) {
		mm=am;
		bp=mm.GetThePageObjectManager().getTheBillingPage();
	}
	
	@Then("Login application using previously created credentials")
	public void login_application_using_previously_created_credentials() {
	   bp.enterUserName();
	   bp.enterPassword();
	   bp.clickOnLoginButton(); 
	}

	@Then("Click on My WishList")
	public void click_on_my_wish_list() {
	    bp.clickOnMyWishListLink();
	}

	@Then("In next page click Add to cart link")
	public void in_next_page_click_add_to_cart_link() {
	    bp.clickOnAddToCartLink();   
	}

	@Then("click proceed t checkout")
	public void click_proceed_t_checkout() {
	    System.out.println("This step not exist");
	}

	@Then("Enter shipping information")
	public void enter_shipping_information() throws Exception {
	    bp.enterTheShippingDetails();
	}

	@Then("click on Estimate")
	public void click_on_estimate() {
	    bp.clickOnEstimate(); 
	}

	@Then("Verify then shipping cost is generated")
	public void verify_then_shipping_cost_is_generated() {
	    bp.VerifyTheSippingCostIsgenerated();
	}

	@Then("Select shipping cost updated total")
	public void select_shipping_cost_updated_total() {
	    bp.SelectShippingCostAndUpdate();
	}

	@Then("verify shipping cost is added to total")
	public void verify_shipping_cost_is_added_to_total() {
	    bp.verifyShippingcostAddedtoTotal();
	}

	@Then("click proceed to checkout")
	public void click_proceed_to_checkout() {
	    bp.clickOnCheckToProceed();
	}

	@Then("enter billing information")
	public void enter_billing_information() throws Exception {
	    bp.enterBillingInformation();	    
	}

	@Then("in shipping method click continue")
	public void in_shipping_method_click_continue() {
	    bp.clickOnContinueOnShippingMethod();	    
	}

	@Then("in payment information select Check\\/money order radio button click continue")
	public void in_payment_information_select_check_money_order_radio_button_click_continue() {
	    bp.clickOnCheckOrCashAndContinue();	    
	}

	@Then("click place order button")
	public void click_place_order_button() {
	    bp.clickOnPlaceOrder();
	}

	@Then("verify order is generated note the order number")
	public void verify_order_is_generated_note_the_order_number() {
	    bp.VerifyTheOrederNumber();
	}

}
