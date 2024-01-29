package pageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClearCarTransfer {

	WebDriver driver;
	@FindBy(id="searchOpt3")
	WebElement transfer;
	@FindBy(id="oneW")
	WebElement RailwayStation;
	@FindBy(id="sourceCity4")
	WebElement Scity5;
	@FindBy(name="pickUpLocation")
	WebElement Pickup;
	@FindBy(id="dropLocation")
	WebElement dropup;
	@FindBy(name="travelDate")
	WebElement Sdate5;
	@FindBy(name="travelDateEnd")
	WebElement Senddate5;
	@FindBy(id="timePickExample")
	WebElement Stime5;
	@FindBy(xpath="//*[@id=\'buttonDiv\']/button")
	WebElement Scab5;
	
	@FindBy(id="searchOpt3")
	WebElement transfer1;
	@FindBy(id="rndT")
	WebElement airport;
	@FindBy(id="sourceCity4")
	WebElement Scity6;
	@FindBy(name="pickUpLocation")
	WebElement Pickup6;
	@FindBy(id="dropLocation")
	WebElement dropup6;
	@FindBy(name="travelDate")
	WebElement Sdate6;
	@FindBy(name="travelDateEnd")
	WebElement Senddate6;
	@FindBy(id="timePickExample")
	WebElement Stime6;
	@FindBy(xpath="//*[@id=\'buttonDiv\']/button")
	WebElement Scab6;
	
	@FindBy(id="searchOpt3")
	WebElement transfer2;
	@FindBy(id="multiC")
	WebElement Area_hotel;
	@FindBy(id="sourceCity4")
	WebElement Scity7;
	@FindBy(name="pickUpLocation")
	WebElement Pickup7;
	@FindBy(id="dropLocation")
	WebElement dropup7;
	@FindBy(name="travelDate")
	WebElement Sdate7;
	@FindBy(name="travelDateEnd")
	WebElement Senddate7;
	@FindBy(id="timePickExample")
	WebElement Stime7;
	@FindBy(xpath="//*[@id=\'buttonDiv\']/button")
	WebElement Scab7;
	
	public ClearCarTransfer(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	public void Transfersearch() {
	  transfer.click();
	}
	public void transferRS() {
		RailwayStation.click();
	}
	public void TransferSourcecity(String arg) {
		Scity5.sendKeys(arg);
	}
	public void Transferpickup(String arg) {
		Pickup.sendKeys(arg);
	}
	public void Transferdropup(String arg) {
		dropup.sendKeys(arg);
	}
	public void TransferStartDate(String arg) {
		Sdate5.sendKeys(arg);
	}
	public void transferDateEnd(String arg) {
		Senddate5.sendKeys(arg);
	}
	public void transferStarttime(String arg) {
		Stime5.sendKeys(arg);
	}
	public void transferSearchCab() {
		Scab5.click();
	}
	public void Back5() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(3000);
	}

	public void Transfersearch1() {
		  transfer1.click();
		}
		public void transferRS1() {
			airport.click();
		}
		public void TransferSourcecity1(String arg) {
			Scity6.sendKeys(arg);
		}
		public void Transferpickup1(String arg) {
			Pickup6.sendKeys(arg);
		}
		public void Transferdropup1(String arg) {
			dropup6.sendKeys(arg);
		}
		public void TransferStartDate1(String arg) {
			Sdate6.sendKeys(arg);
		}
		public void transferDateEnd1(String arg) {
			Senddate6.sendKeys(arg);
		}
		public void transferStarttime1(String arg) {
			Stime6.sendKeys(arg);
		}
		public void transferSearchCab1() {
			Scab6.click();
		}
		public void Back6() throws InterruptedException {
			driver.navigate().back();
			driver.navigate().refresh();
			Thread.sleep(3000);
		}
		
		public void Transfersearch2() {
			  transfer2.click();
			}
			public void transferRS2() {
				Area_hotel.click();
			}
			public void TransferSourcecity2(String arg) {
				Scity7.sendKeys(arg);
			}
			public void Transferpickup2(String arg) {
				Pickup7.sendKeys(arg);
			}
			public void Transferdropup2(String arg) {
				dropup7.sendKeys(arg);
			}
			public void TransferStartDate2(String arg) {
				Sdate7.sendKeys(arg);
			}
			public void transferDateEnd2(String arg) {
				Senddate7.sendKeys(arg);
			}
			public void transferStarttime2(String arg) {
				Stime7.sendKeys(arg);
			}
			public void transferSearchCab2() {
				Scab7.click();
			}
			public void Back7() throws InterruptedException {
				driver.navigate().back();
				driver.navigate().refresh();
				Thread.sleep(3000);
			}
}
