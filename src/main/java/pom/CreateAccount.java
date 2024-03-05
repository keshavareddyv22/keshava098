package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {
	
	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement createNewAccount;
	
	public CreateAccount(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getCreateNewAccount() {
		return createNewAccount;
	}
	
	public void clickOnCreateAccount() {
		createNewAccount.click();
	}

}
