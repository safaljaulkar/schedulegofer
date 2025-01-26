package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver; // driver reference
	public static Properties prop = new Properties();
	public static FileReader fr1;
	public String UserName = "admin@schedulegofer.com";
	public String Password = "ZVeT48-e9Z^hx~k4";
//	ExtentReports extent;

//	@BeforeTest
//
//	public void ExtentRepost() {
//
//		String ReportPath = System.getProperty("user.dir") + "\\reports\\index.html"; // dynamic path of project
//
//		ExtentSparkReporter report = new ExtentSparkReporter(ReportPath);
//
//		report.config().setReportName("WebShopTestReport");
//		report.config().setReportName("WebShopTestReportTitle");
//
//		ExtentReports extent = new ExtentReports();
//		extent.attachReporter(report); // use to attach all configuration
//		extent.setSystemInfo("Operating System", "Windows11");
//		extent.setSystemInfo("Tested By", "Safal Jaulkar");
//
//	}

	//@Test // annoted method run before test
	
	
	
	@BeforeTest
	public void setup() throws IOException {

		//ExtentTest logintest = extent.createTest("VerifyLoginTest");

		if (driver == null) {
			FileReader fr1 = new FileReader(System.getProperty("user.dir") +"\\src\\main\\resources\\configfile\\config.properties");
			prop.load(fr1); // load the properties reader, object
		}

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup(); // base
			driver = new ChromeDriver(); // base
			driver.get(prop.getProperty("testurl")); // properties

		} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.chromedriver().setup(); // base
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("testurl"));

		}
	}
	
	@AfterTest
	public void teardown() { // use to close
		// driver.close();
		//extent.flush(); // Ending of the report
		System.out.println("Done");

		
		
	}
		
}
