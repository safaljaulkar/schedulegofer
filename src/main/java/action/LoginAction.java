package action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.TestBase;
import locator.LoginLocator;

public class LoginAction extends TestBase {

	LoginLocator locator = new LoginLocator();

	public void Login(String UserName, String Password) throws IOException {

		driver.manage().window().maximize();
		driver.findElement(By.xpath(locator.username)).sendKeys(UserName);
		driver.findElement(By.xpath(locator.password)).sendKeys(Password);
		driver.findElement(By.xpath(locator.login)).click();

		
		
		//Take  Screenshot
		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile1, new File("screenshots\\screenshotlogin.jpg"));
			
		
		
	}

}
