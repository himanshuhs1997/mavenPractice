package pageObjectFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EroomrentLogin {

	WebDriver driver;
	@FindBy(name="txtEmail")
	WebElement username;
	@FindBy(name="txtPassword")
	WebElement password;
	@FindBy(name="btnsubmit")
	WebElement btn;
	public EroomrentLogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void enterurl() {
		driver.get("https://eroomrent.in/ownerlogin.php");
	}
	public void enterUsername(String arg) {
		username.sendKeys(arg);
	}
	public void enterPassword(String arg) {
		password.sendKeys(arg);
	}
	public void enterBtn() {
		btn.click();
	}

}
