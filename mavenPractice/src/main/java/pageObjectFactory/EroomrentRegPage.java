package pageObjectFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EroomrentRegPage {

	WebDriver driver;
	@FindBy(name="txtfname")
	WebElement FullName;
	@FindBy(name="txtmobile1")
	WebElement MobileNumber;
	@FindBy(name="txtPassword")
	WebElement Password;
	@FindBy(name="txtConfirmPassword")
	WebElement ConfirmPassword;
	@FindBy(name="txtEmail")
	WebElement Emailid;
	@FindBy(name="btnsubmit")
	WebElement Submit;
	public EroomrentRegPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
		public void enterfullName(String arg1) {
		FullName.sendKeys(arg1);
		}
		public void entermobileNumber(String arg1) {
		MobileNumber.sendKeys(arg1);
		}
		public void enterpasswrod(String arg1) {
		Password.sendKeys(arg1);
		}
		public void enterconfirmPasswrod(String arg1) {
		ConfirmPassword.sendKeys(arg1);
		}
		public void enteremailid(String arg1) {
		Emailid.sendKeys(arg1);
		}
		public void entersubmit() {
		Submit.click();
		}
		public void alert() {
			driver.switchTo().alert().accept();
		}

}
