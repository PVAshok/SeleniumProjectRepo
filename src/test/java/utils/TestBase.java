package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver WebdriverManager() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//test//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("QAUrl");
		String browser = prop.getProperty("browser");
		if(driver==null);
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				driver = new ChromeDriver();
			}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		
		}
		return driver;
	}
}
