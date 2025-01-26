package action;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.TestBase;
import locator.LoginLocator;



public class LoginAction extends TestBase {

	LoginLocator locator = new LoginLocator();

	public void Login(String UserName, String Password) throws IOException {

	try {
		driver.manage().window().maximize();
		driver.findElement(By.xpath(locator.username)).sendKeys(UserName);
		driver.findElement(By.xpath(locator.password)).sendKeys(Password);
		driver.findElement(By.xpath(locator.login)).click();
		
		//Assert.assertEquals(driver.getTitle(), "ScheduleGofer");

		
		  // Expected result
        String expectedMessage = "ScheduleGofer";
        String actualMessage = driver.getTitle();
       

        // Assert the result
        if (!actualMessage.equals(expectedMessage)) {
            System.out.println("Login failed. Expected message: " + expectedMessage + ", but got: " + actualMessage);
            
            File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
       	 //   FileUtils.copyFile(screenshotFile1, new File("screenshots + 01Belts.jpg"));
            
            captureScreenshot("login_failure");
        } else {
            System.out.println("Login successful!");
        }
    } catch (Exception e) {
        System.out.println("Test failed due to exception: " + e.getMessage());
        captureScreenshot("login_exception_failure");
    } finally {
        // Close the browser after the test
        driver.quit();
    }
}
		
		//Take  Screenshot
	//	File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 //   FileUtils.copyFile(screenshotFile1, new File("screenshots + 01Belts.jpg"));
				
	}




