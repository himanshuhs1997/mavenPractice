package pageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClearCarOutsation {

	WebDriver driver;
	@FindBy(id="searchOpt1")
	WebElement outstation;
	@FindBy(id="oneW")
	WebElement oneway;
	@FindBy(name="sourceCity")
	WebElement Scity;
	@FindBy(name="destinationCity")
	WebElement Dcity;
	@FindBy(name="travelDate")
	WebElement Sdate;
	@FindBy(id="timePickExample")
	WebElement Stime;
	@FindBy(xpath="//*[@id=\'buttonDiv\']/button")
	WebElement Scab;
	
	@FindBy(id="searchOpt1")
	WebElement outstation1;
	@FindBy(id="rndT")
	WebElement roundtrip;
	@FindBy(name="sourceCity")
	WebElement Scity1;
	@FindBy(name="destinationCity")
	WebElement Dcity1;
	@FindBy(name="travelDate")
	WebElement Sdate1;
	@FindBy(name="travelDateEnd")
	WebElement Sdend1;
	@FindBy(id="timePickExample")
	WebElement Stime1;
	@FindBy(xpath="//*[@id=\'buttonDiv\']/button")
	WebElement Scab1;
	
	@FindBy(id="searchOpt1")
	WebElement outstation2;
	@FindBy(id="multiC")
	WebElement multicity;
	@FindBy(name="sourceCity")
	WebElement Scity2;
	@FindBy(name="destinationCity")
	WebElement Dcity2;
	@FindBy(className="AddRemoveBtn")
	WebElement Abutton;
	@FindBy(id="destinationCity5")
	WebElement Dcity2_1;
	@FindBy(xpath="//*[@id=\'datepicker\']")
	WebElement Sdate2;
	@FindBy(xpath="//*[@id=\'datepicker2\']")
	WebElement Sdend2;
	@FindBy(name="pTime")
	WebElement Stime2;
	@FindBy(xpath="//*[@id=\'buttonDiv\']/button")
	WebElement Scab2;
	
	public ClearCarOutsation(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	public void outsearch() {
	  outstation.click();
	}
	public void outoneway() {
		oneway.click();
	}
	public void outSourcecity(String arg) {
		Scity.sendKeys(arg);
	}
	public void outDesinationCity(String arg) {
		Dcity.sendKeys(arg);
	}
	public void outStartDate(String arg) {
		Sdate.sendKeys(arg);
	}
	public void outStarttime(String arg) {
		Stime.sendKeys(arg);
	}
	public void outSearchCab() {
		Scab.click();
	}
	public void Back() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
	public void outsearch1() {
		  outstation1.click();
		}
		public void rtrip() {
			roundtrip.click();
		}
		public void outSourcecity1(String arg) {
			Scity1.sendKeys(arg);
		}
		public void outDesinationCity1(String arg) {
			Dcity1.sendKeys(arg);
		}
		public void outStartDate1(String arg) {
			Sdate1.sendKeys(arg);
		}
		public void outEndDate(String arg) {
			Sdend1.sendKeys(arg);
		}
		public void outStarttime1(String arg) {
			Stime1.sendKeys(arg);
		}
		public void outSearchCab1() {
			Scab1.click();
		}
		public void Back1() throws InterruptedException {
			driver.navigate().back();
			driver.navigate().refresh();
			Thread.sleep(3000);
		}
		public void outsearch2() {
			  outstation2.click();
			}
			public void mcity() {
				multicity.click();
			}
			public void outSourcecity2(String arg) {
				Scity2.sendKeys(arg);
			}
			public void outDesinationCity2(String arg) {
				Dcity2.sendKeys(arg);
			}
			public void removebutton() {
				Abutton.click();
			}
			public void add1morecity(String arg) {
				Dcity2_1.sendKeys(arg);
			}
			public void outStartDate2(String arg) {
				Sdate2.sendKeys(arg);
			}
			public void outEndDate2(String arg) {
				Sdend2.sendKeys(arg);
			}
			public void outStarttime2(String arg) {
				Stime2.sendKeys(arg);
			}
			public void outSearchCab2() {
				Scab2.click();
			}
			public void Back2() throws InterruptedException {
				driver.navigate().back();
				driver.navigate().refresh();
				Thread.sleep(3000);
			}
	
}
