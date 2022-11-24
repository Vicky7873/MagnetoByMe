package step;

import java.io.IOException;

import Manger.MasterManager;
import Manger.PageObjectManager;
import Manger.WebdriverManger;
import io.cucumber.java.en.*;
import pageObjects.mobile_list_page;

public class TC_1_step {
	
	MasterManager mm;
	mobile_list_page mlp;
	
	public TC_1_step(MasterManager am) {
		mm=am;
		mlp=mm.GetThePageObjectManager().getTheMobileListPage();
	}
	
	
	
	@Given("open the url")
	public void open_the_url() {
	    WebdriverManger.setTheURL();
	}

	@Then("Verify the title of the home page")
	public void verify_the_title_of_the_home_page() {
	   mlp.GetTheTitleofThePage(); 
	}

	@Then("click on mobile menu")
	public void click_on_mobile_menu() {
	    mlp.clickOnMobileLInk();
	}

	@Then("Verify title of the page")
	public void verify_title_of_the_page() {
	    mlp.getTheTextOfMobileListPage();
	}

	@Then("In the list of all mobil select sortby dropDown as name")
	public void in_the_list_of_all_mobil_select_sortby_drop_down_as_name() throws Exception {
	    mlp.SelectTheDropDown();
	}

	@Then("Verify all products are sorted by name")
	public void verify_all_products_are_sorted_by_name() throws IOException {
	    mlp.VerifyAllProductsSortedByname();

}
}
