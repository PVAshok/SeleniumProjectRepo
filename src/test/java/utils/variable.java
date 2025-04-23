package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class variable {

	public WebDriver driver;
	public String landingproductname;
	public PageObjectManager pageObjectManager;
	public TestBase testbase;
	public GenericUtils genericutils;
	
	public variable() throws IOException
	{
		testbase = new TestBase();
		driver = testbase.WebdriverManager();
		pageObjectManager = new PageObjectManager(driver);
		genericutils = new GenericUtils(driver);
	}
}
