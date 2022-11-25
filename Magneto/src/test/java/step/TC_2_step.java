package step;

import Manger.MasterManager;
import io.cucumber.java.en.Then;
import pageObjects.mobile_list_page;

public class TC_2_step {
	
	MasterManager mm;
	mobile_list_page mlp;
	public TC_2_step(MasterManager am) {
		mm=am;
		mlp=mm.GetThePageObjectManager().getTheMobileListPage();
	}
	String ListPagePriceOfSonyXperia;
	String DetailPagePriceOfSonyXperia;
	
	@Then("Read the cost of sony xperia")
	public void read_the_cost_of_sony_xperia() {
	    mlp.getTheTxtOfSonyXperia();
	    ListPagePriceOfSonyXperia=mlp.getTePriceOfSonyXperia();
	    System.out.println(ListPagePriceOfSonyXperia);
	}

	@Then("click on sony xperia")
	public void click_on_sony_xperia() {
	    mlp.clickOnsonyXperia();
	}

	@Then("Read the sony xperia mobile from detail page")
	public void read_the_sony_xperia_mobile_from_detail_page() {
	    DetailPagePriceOfSonyXperia=mlp.getThepriceInDetilpageOfSonyXperia();
	}

	@Then("compare the value of step {int} and step {int}")
	public void compare_the_value_of_step_and_step(Integer int1, Integer int2) {
	    if(ListPagePriceOfSonyXperia.equalsIgnoreCase(DetailPagePriceOfSonyXperia)) {
	    	System.out.println("The value is matched");
	    }
	    else {
	    	System.out.println("The value of "+ListPagePriceOfSonyXperia+" and "+DetailPagePriceOfSonyXperia+" is not matched");
	    }
	}

}
