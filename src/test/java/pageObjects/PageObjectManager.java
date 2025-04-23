package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	

	public Landingpage landingpage;
	public Offerpage offerpage;
	public Checkoutpage checkoutpage;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public Landingpage getlandingpage()
	{
		landingpage = new Landingpage(driver);
		return landingpage;
	}
	public Offerpage getofferpage()
	{
		offerpage = new Offerpage(driver);
		return offerpage;
	}
	public Checkoutpage getcheckoutpage()
	{
		checkoutpage = new Checkoutpage(driver);
		return checkoutpage;
	}
}
