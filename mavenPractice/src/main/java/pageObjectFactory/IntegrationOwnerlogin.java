package pageObjectFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IntegrationOwnerlogin {

	WebDriver driver;
	@FindBy(name="txtEmail")
	WebElement userName;
	@FindBy(name="txtPassword")
	WebElement password;
	@FindBy(name="btnsubmit")
	WebElement Button;
		
	public IntegrationOwnerlogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void actionperform() {
		Actions o = new Actions(driver);
		WebElement ele = driver.findElement(By.linkText("Owner-G"));
		o.moveToElement(ele).build().perform();
		driver.findElement(By.partialLinkText("Login")).click();
	}
	public void EnterUserName(String arg) {
		userName.sendKeys(arg);
	}
	public void EnterPassword(String arg) {
		password.sendKeys(arg);
	}
	public void Enterbutton() {
		Button.click();
	}
}
