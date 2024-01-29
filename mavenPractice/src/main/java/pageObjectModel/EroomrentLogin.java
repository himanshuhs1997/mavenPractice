package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EroomrentLogin {

	WebDriver driver;
	By username= By.name("txtEmail");
	By password = By.name("txtPassword");
	By btn = By.name("btnsubmit");
	
	public EroomrentLogin(WebDriver driver) {
		this.driver=driver;
	}
	public void enterurl() {
		driver.get("https://eroomrent.in/ownerlogin.php");
	}
	public void enterUsername(String arg) {
		driver.findElement(username).sendKeys(arg);
	}
	public void enterPassword(String arg) {
		driver.findElement(password).sendKeys(arg);
	}
	public void enterBtn() {
		driver.findElement(btn).click();
	}

}
