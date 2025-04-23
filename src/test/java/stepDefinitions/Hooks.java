package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.variable;

public class Hooks {
variable instance;
	public Hooks(variable instance)
	{
		this.instance = instance;
	}
	
	@After
	public void AfterScenario() throws IOException
	{
	    System.out.println("AfterScenario hook triggered");
		instance.driver.quit();
		
	}
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException
	{
		WebDriver driver = instance.driver;
		if(scenario.isFailed())     //if scenario failed take screenshot of step
		{
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] filecontent = FileUtils.readFileToByteArray(src);     //converting file to byte format
			scenario.attach(filecontent, "image/png", "image");          //attaching screenshot to extent report
		
		}
	}



}
