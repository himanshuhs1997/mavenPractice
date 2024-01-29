package pageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClearCarLocal {

	WebDriver driver;
	@FindBy(id="searchOpt2")
	WebElement local;
	@FindBy(id="oneW")
	WebElement halfday;
	@FindBy(id="sourceCity4")
	WebElement Scity3;
	@FindBy(name="travelDate")
	WebElement Sdate3;
	@FindBy(name="travelDateEnd")
	WebElement Senddate3;
	@FindBy(id="timePickExample")
	WebElement Stime3;
	@FindBy(xpath="//*[@id=\'buttonDiv\']/button")
	WebElement Scab3;
	

	@FindBy(id="searchOpt2")
	WebElement localfull;
	@FindBy(id="rndT")
	WebElement fullday;
	@FindBy(id="sourceCity4")
	WebElement Scity4;
	@FindBy(name="travelDate")
	WebElement Sdate4;
	@FindBy(name="travelDateEnd")
	WebElement Senddate4;
	@FindBy(id="timePickExample")
	WebElement Stime4;
	@FindBy(xpath="//*[@id=\'buttonDiv\']/button")
	WebElement Scab4;
	
	public ClearCarLocal(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	public void localsearch() {
	  local.click();
	}
	public void localhalfDay() {
		halfday.click();
	}
	public void localSourcecity(String arg) {
		Scity3.sendKeys(arg);
	}
	public void localStartDate(String arg) {
		Sdate3.sendKeys(arg);
	}
	public void localDateEnd(String arg) {
		Senddate3.sendKeys(arg);
	}
	public void localStarttime(String arg) {
		Stime3.sendKeys(arg);
	}
	public void localSearchCab() {
		Scab3.click();
	}
	public void Back3() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
	
	public void localsearch1() {
		  localfull.click();
		}
		public void localfullDay() {
			fullday.click();
		}
		public void localSourcecity1(String arg) {
			Scity4.sendKeys(arg);
		}
		public void localStartDate1(String arg) {
			Sdate4.sendKeys(arg);
		}
		public void localDateEnd1(String arg) {
			Senddate4.sendKeys(arg);
		}
		public void localStarttime1(String arg) {
			Stime4.sendKeys(arg);
		}
		public void localSearchCab1() {
			Scab4.click();
		}
		public void Back4() throws InterruptedException {
			driver.navigate().back();
			driver.navigate().refresh();
			Thread.sleep(3000);
		}
}
