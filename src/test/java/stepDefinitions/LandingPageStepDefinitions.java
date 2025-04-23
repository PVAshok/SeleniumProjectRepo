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
import pageObjects.PageObjectManager;
import utils.variable;

public class LandingPageStepDefinitions {
public WebDriver driver;
public String offersproductname;
variable instance;
public PageObjectManager pageObjectManager;
Landingpage landingpage;


public LandingPageStepDefinitions(variable instance)
{
	this.instance = instance;
	this.landingpage = instance.pageObjectManager.getlandingpage();
}
	@Given("User is on Greencart Landing Page")
	public void user_is_on_greencart_landing_page() {
		Assert.assertTrue(landingpage.getpagetitle().contains("GreenKart"));
		
	}
	@When("^user with shortname (.+) and extracted actual name of product$")
	public void user_with_shortname_and_extracted_actual_name_of_product(String shortname) throws InterruptedException {
		
		landingpage.searchItem(shortname);
		Thread.sleep(4000);
		instance.landingproductname = landingpage.getProductName().split("-")[0].trim();
		System.out.println(instance.landingproductname + " is extracted from homepage" );
	}
	
	@When("Added {string} items of selected product to cart")
	public void added_items_of_selected_product_to_cart(String quantity) {
		
		landingpage.incrementquantity(Integer.parseInt(quantity));
		landingpage.addtocart();
		
}
}
