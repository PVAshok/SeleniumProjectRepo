package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkoutpage {
	
	public WebDriver driver;
	
	public Checkoutpage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By cart = By.cssSelector("img[alt='Cart']");
	By checkout = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By promobtn = By.cssSelector(".promoBtn");
	By placeorder = By.xpath("//button[contains(text(),'Place Order')]");
	
	public void checkoutitems()
	{
		driver.findElement(cart).click();
		driver.findElement(checkout).click();
	}
	public boolean verifyprmbtn()
	{
		return driver.findElement(promobtn).isDisplayed();
	}
	public boolean verifyplcord()
	{
		return driver.findElement(placeorder).isDisplayed();
	}
	
	

}
