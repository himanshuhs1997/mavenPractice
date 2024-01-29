package pageObjectModel;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class EroomrentRegPage {

	WebDriver driver;
	By FullName = By.name("txtfname");
	By MobileNumber = By.name("txtmobile1");
	By Password = By.name("txtPassword");
	By ConfirmPassword = By.name("txtConfirmPassword");
	By Emailid = By.name("txtEmail");
	By Submit = By.name("btnsubmit");
	public EroomrentRegPage(WebDriver driver) {
		this.driver = driver;
		}
		public void enterfullName(String arg1) {
		driver.findElement(FullName).sendKeys(arg1);
		}
		public void entermobileNumber(String arg1) {
		driver.findElement(MobileNumber).sendKeys(arg1);
		}
		public void enterpasswrod(String arg1) {
		driver.findElement(Password).sendKeys(arg1);
		}
		public void enterconfirmPasswrod(String arg1) {
		driver.findElement(ConfirmPassword).sendKeys(arg1);
		}
		public void enteremailid(String arg1) {
		driver.findElement(Emailid).sendKeys(arg1);
		}
		public void entersubmit() {
		driver.findElement(Submit).click();
		}
		public void alert() {
			driver.switchTo().alert().accept();
		}

}
