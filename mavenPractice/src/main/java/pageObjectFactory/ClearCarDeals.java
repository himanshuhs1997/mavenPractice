package pageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClearCarDeals {

	WebDriver driver;
	@FindBy(id="searchOpt7")
	WebElement deals;
	@FindBy(id="rndT")
	WebElement onewaydeals;
	@FindBy(name="sourceCity")
	WebElement Scity8;
	@FindBy(name="destinationCity")
	WebElement Dcity8;
	@FindBy(name="travelDate")
	WebElement Sdate8;
	@FindBy(xpath="//*[@id=\'buttonDiv\']/button")
	WebElement Scab8;
	
	public ClearCarDeals(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	public void dealssearch() {
	  deals.click();
	}
	public void dealsoneway() {
		onewaydeals.click();
	}
	public void dealsSourcecity(String arg) {
		Scity8.sendKeys(arg);
	}
	public void dealsDesinationCity(String arg) {
		Dcity8.sendKeys(arg);
	}
	public void dealsStartDate(String arg) {
		Sdate8.sendKeys(arg);
	}
	public void dealsSearchCab() {
		Scab8.click();
	}
	public void Back8() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
}
