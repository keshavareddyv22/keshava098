package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageOfFacebook {
	
	@FindBy(name = "firstname")
	private WebElement firstNameTextField;
	
	@FindBy(name = "lastname")
	private WebElement lastNameTextField;
	
	@FindBy(name = "reg_email__")
	private WebElement phoneNameTextField;
	
	public HomePageOfFacebook(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}
	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}
	public WebElement getPhoneNameTextField() {
		return phoneNameTextField;
	}
	
	public void signupIntoFacebook(String firstName,String lastName,String phoneNumber) {
		firstNameTextField.sendKeys(firstName);
		lastNameTextField.sendKeys(lastName);
		phoneNameTextField.sendKeys(phoneNumber);
	}
	

}
