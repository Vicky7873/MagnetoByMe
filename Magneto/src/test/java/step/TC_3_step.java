package step;

import Manger.MasterManager;
import io.cucumber.java.en.Then;
import pageObjects.DetailPage;
import pageObjects.mobile_list_page;

public class TC_3_step {
	
	MasterManager mm;
	DetailPage dp;
	mobile_list_page mlp;
	public TC_3_step(MasterManager am) {
		mm=am;
		mlp=mm.GetThePageObjectManager().getTheMobileListPage();
		dp=mm.GetThePageObjectManager().getTheDetailsPage();
	}
	
	
	@Then("in the list of all mobiles click on add to cart for sony Xperia mobile")
	public void in_the_list_of_all_mobiles_click_on_add_to_cart_for_sony_xperia_mobile() {
	    mlp.clickOnAddToCart();
	}

	@Then("Change the quantity value to {string} and click update button")
	public void change_the_quantity_value_to_and_click_update_button(String string) {
	    dp.enterTheQuantity(string);
	    dp.clickOnUpdateButton();
	}

	@Then("verify the error message")
	public void verify_the_error_message() {
	    dp.validateTheErrorMsg();
	}

	@Then("click on empty cart link in the footer of list of all mobiles")
	public void click_on_empty_cart_link_in_the_footer_of_list_of_all_mobiles() {
	    dp.clickonEmptyCart();
	}

	@Then("verify cart is empty")
	public void verify_cart_is_empty() {
	    dp.ValidateTheTitle();
	}

}
