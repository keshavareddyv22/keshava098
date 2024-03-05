package commonUtility;

import java.io.IOException;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public ExcelUtility EU = new ExcelUtility();
	public JavaUtility JU = new JavaUtility();
	public FileUtility FU = new FileUtility();
	public WebDriverUtility WU = new WebDriverUtility();
	
	public WebDriver driver=null; 
	@BeforeSuite
	public void BeforeSuiteTest() {
		System.out.println("Running the Before suite Test");
	}
	
	@BeforeTest
	public void BeforeTestTest() {
		System.out.println("Running the Before Test Test");
	}
	@BeforeClass
	public void BeforeClassTest() throws IOException {
		
		String BROWSER = FU.readDataFromFile("Browser");
		if(BROWSER.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(BROWSER.equals("fireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		WU.waitForPageToLoad(driver);
		WU.maximizeScreen(driver);
	}
	@BeforeMethod
	public void BeforeMethodTest() throws IOException {
		String URL = FU.readDataFromFile("Url");
		driver.get(URL);
	}
	@AfterMethod
	public void AfterMethodTest() {
		
	}@AfterClass
	public void AfterClassTest() {
		driver.quit();
	}
	@AfterSuite
	public void AfterSuiteTest() {
		System.out.println("Running the Before suite Test");
	}

}
