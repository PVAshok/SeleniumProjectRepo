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
import pageObjects.Checkoutpage;
import pageObjects.Landingpage;
import pageObjects.PageObjectManager;
import utils.variable;

public class CheckoutPageStepDefinitions {
public WebDriver driver;
public String offersproductname;
public Checkoutpage checkoutpage;
variable instance;
public PageObjectManager pageObjectManager;


public CheckoutPageStepDefinitions(variable instance)
{
	this.instance = instance;
	this.checkoutpage = instance.pageObjectManager.getcheckoutpage(); 
	//placed this here because there are 2 methods and before running these constructor will be called , we can't place it in  2methods due to optimisation
}

@Then("verify user has ability to enter promo code and place the order")
public void verify_user_has_ability_to_enter_promo_code_and_place_the_order() {
	
	Assert.assertTrue(checkoutpage.verifyprmbtn());
	Assert.assertTrue(checkoutpage.verifyplcord());
	
}
@Then("^user proceeds to checkout and validate the (.+) items in checkout page$")
public void user_proceeds_to_checkout_and_validate_the_tom_items_in_checkout_page(String name) throws InterruptedException {
	
	checkoutpage.checkoutitems();
	System.out.println("Ashok");
}
}
