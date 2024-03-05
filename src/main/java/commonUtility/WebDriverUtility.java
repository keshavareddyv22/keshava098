package commonUtility;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author Channakeshava
 *
 */
public class WebDriverUtility {
	
	public void waitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void waitforElementToLoad(WebDriver driver,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void maximizeScreen(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public void switchToFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	public void switchToFrame(WebDriver driver,String nameORid) {
		driver.switchTo().frame(nameORid);
	}
	public void switchToFrame(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
	public void switchToParentFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}
	public void moveToElement(WebDriver driver,WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element);
	}
	public void moveToElement(WebDriver driver,WebElement element,int x, int y) {
		Actions action = new Actions(driver);
		action.moveToElement(element,x,y);
	}
	public void moveToElement(WebDriver driver,int x, int y) {
		Actions action = new Actions(driver);
		action.moveByOffset(x, y);
	}
	public void doubleClick(WebDriver driver,WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element);
	}
	public void rightClick(WebDriver driver,WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element);
	}	
}
