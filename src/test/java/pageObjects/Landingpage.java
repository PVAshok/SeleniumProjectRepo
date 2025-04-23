package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Landingpage {
	
	public WebDriver driver;
	
	public Landingpage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By search = By.xpath("//input[@type='search']");
	By ProductName = By.cssSelector("h4.product-name");
	By topdeals = By.linkText("Top Deals");
	By increment = By.cssSelector("a.increment");
	By addcart = By.cssSelector(".product-action button");
	
	public void searchItem(String name)
	{
		driver.findElement(search).sendKeys(name);
		
	}
	public void getSearchText()
	{
		driver.findElement(search).getText();
	}
	public void incrementquantity(int quantity)
	{
		int i = quantity-1;
		while(i>0)
		{
			driver.findElement(increment).click();
			i--;
		}
			
	}
	
	public void addtocart()
	{
		driver.findElement(addcart).click();
	}
	public String getProductName()
	{
		return driver.findElement(ProductName).getText();
	}
	public void selecttopDealspage()
	{
		driver.findElement(topdeals).click();
	}
	public String getpagetitle()
	{
		return driver.getTitle();
		
	}
	public void additems()
	{
		
	}

}
