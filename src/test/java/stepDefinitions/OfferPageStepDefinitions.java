package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Landingpage;
import pageObjects.Offerpage;
import pageObjects.PageObjectManager;
import utils.variable;

public class OfferPageStepDefinitions {
public WebDriver driver;
public String offersproductname;
variable instance;
PageObjectManager pageObjectManager;

public OfferPageStepDefinitions(variable instance)
{
	this.instance = instance;
}
	@Then("^user searched for (.+) shortname in offers page$")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist(String shortname) throws InterruptedException {
		
		switchToOffersPage();
		Offerpage offerpage = instance.pageObjectManager.getofferpage();
		offerpage.searchItem(shortname);
		Thread.sleep(2000);
		offersproductname = offerpage.getproductname();
		System.out.println(offersproductname + " is extracted from homepage" );
	}
	
	public void switchToOffersPage()
	{
		Landingpage landingpage = instance.pageObjectManager.getlandingpage();
		landingpage.selecttopDealspage();
		instance.genericutils.SwitchtoChild();
		
	}
	@And("validate product name in offers page matches with landing page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {
		
	   Assert.assertEquals(instance.landingproductname, offersproductname);
	}


}
