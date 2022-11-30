package step;

import java.io.IOException;

import Manger.MasterManager;
import io.cucumber.java.en.Then;
import pageObjects.ComparePage;

public class TC_4_step {
	MasterManager mm;
	ComparePage cp;
	public TC_4_step(MasterManager am) {
		mm=am;
		cp=mm.GetThePageObjectManager().getTheComparePAge();
	}
	
	@Then("In mobile products list click on add to compare for two mobiles")
	public void in_mobile_products_list_click_on_add_to_compare_for_two_mobiles() {
	    cp.clickOn_AddToCart_Iphone();
	    cp.clickOn_AddTocartOf_SonyXperia();
	}

	@Then("click on compare button")
	public void click_on_compare_button() {
	    cp.clickOnCompareButton();
	}

	@Then("Verify the popup window and check that the products are reflected in it")
	public void verify_the_popup_window_and_check_that_the_products_are_reflected_in_it() throws IOException {
	    cp.SwitchTowindow();
	    cp.getThetitleOfThePge();
	}

	@Then("close the Popup windows")
	public void close_the_popup_windows() {
		//cp.AsserrtTheNAmeFromdptocp();
	    cp.closeTheWindow();
	}

}
