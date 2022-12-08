package step;

import java.io.IOException;

import Manger.MasterManager;
import RandomUtils.randomClass;
import io.cucumber.java.en.*;
import pageObjects.RegisterPage;

public class TC_5_step {
	MasterManager mm;
	RegisterPage rp;
	randomClass rc=new randomClass();
	public TC_5_step(MasterManager am) {
		mm=am;
		rp=mm.GetThePageObjectManager().getTheRegistrePage();
	}
	
	
	@Then("click on my acoount link")
	public void click_on_my_acoount_link() {
	  rp.clickOnMyAccount();  
	    
	}

	@Then("Click create Account link and fill new user information {string},{string},{string},{string},{string}")
	public void click_create_account_link_and_fill_new_user_information(String fn, String ln, String email, String psw, String cnfpsw) {
	    rp.clickOnCreateAnAccount();
		rp.EnterTheCredentials(fn+rc.SetTheRandomInt(), 
	    		ln+rc.SetTheRandomInt(), 
	    		email+rc.SetTheRandomEmail(), 
	    		psw, 
	    		cnfpsw);
	    
	}

	@Then("Click Register")
	public void click_register() {
	    rp.clickOnRegisterButton();
	}

	@Then("Verify the Registration is done")
	public void verify_the_registration_is_done() throws IOException {
	    rp.TakeTheScreenshot(); 
	}

	@When("Go to tv menu")
	public void go_to_tv_menu() {
	    rp.clickOnTV();
	}

	@Then("add product in your wishlist")
	public void add_product_in_your_wishlist() {
	    rp.clickOnAddToWishlist();
	}

	@Then("click Share wishlist")
	public void click_share_wishlist() {
	    rp.clickOnShareWishList();
	}

	@Then("in nextPage enter email and a message and click share wishlist")
	public void in_next_page_enter_email_and_a_message_and_click_share_wishlist() {
	    rp.enterTheEmailIDForSharing();
	}

	@Then("check wislist is shared")
	public void check_wislist_is_shared() {
		rp.waitForTheSharewishList();
		rp.PrintTheTitleOfTheShareWishLIst();
	}

}
