package facebook;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import commonUtility.BaseClass;
import pom.CreateAccount;
import pom.HomePageOfFacebook;

public class SignUpFacebook extends BaseClass {
	
	@Test
	public void channaTest() throws EncryptedDocumentException, IOException {
		
		String firstName = EU.getDataFromExcel("Sheet1", 1, 0);
		String lastName = EU.getDataFromExcel("Sheet1", 1, 1);
		String phoneNumber = EU.getDataFromExcel("Sheet1", 1, 2);
		
		CreateAccount cr = new CreateAccount(driver);
		cr.clickOnCreateAccount();
		
		HomePageOfFacebook hp = new HomePageOfFacebook(driver);
		hp.signupIntoFacebook(firstName, lastName, phoneNumber);
	}
}
