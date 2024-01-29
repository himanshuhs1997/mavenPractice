package pageObjectFactory;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IntegrationAddRoom {

	WebDriver driver;
	@FindBy(partialLinkText="Add")
	WebElement addroom;
	@FindBy(name="ddllocation")
	WebElement Slocation;
	@FindBy(name="ddlcat")
	WebElement Category;
	@FindBy(name="ddlsubcat")
	WebElement SubCategory;
	@FindBy(name="txtdesc")
	WebElement roomdescription;
	@FindBy(name="file")
	WebElement chooseFile;
	@FindBy(name="txtamount")
	WebElement roomprice;
	@FindBy(name="txtfacility")
	WebElement roomFacilty;
	@FindBy(name="btnsubmit")
	WebElement insert;
	@FindBy(partialLinkText="View Room")
	WebElement viewroom;
	@FindBy(linkText="Booking")
	WebElement booking;
	@FindBy(linkText="Logout")
	WebElement logout;
	
	public IntegrationAddRoom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void refresh() {
		driver.navigate().refresh();
	}
	
	public void EnterAddroom() {
		addroom.click();
	}
	public void EnterSLocation() {
		Select dd1= new Select(Slocation);
		dd1.selectByVisibleText("Bajrang Nagar");
	}
	public void Entercategory() {
		Select dd2= new Select(Category);
		dd2.selectByVisibleText("Flat");
	}
	public void Entersubcategory() {
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait1.until(ExpectedConditions.visibilityOfElementLocated((By) SubCategory));
		Select dd3= new Select(SubCategory);
		dd3.selectByVisibleText("3 BHK");
	}
	public void EnterRoomDes(String arg) {
		roomdescription.sendKeys(arg);
	}
	public void EnterChoosefile(String arg) {
		chooseFile.sendKeys(arg);
	}
	public void EnterRoomprice(String arg) {
		roomprice.sendKeys(arg);
	}
	public void EnterRoomfacility(String arg) {
		roomFacilty.sendKeys(arg);
	}
	public void EnterInsert() {
		insert.click();
	}
	public void EnterViewRoom() {
		viewroom.click();
		List<WebElement> ele1 = driver.findElements(By.xpath("/html/body/div[2]/div/div[2]/center/table/tbody/tr/td[1]"));
		System.out.println("total view book row"+ele1.size());
    }
	public void EnterBooking() {
		booking.click();
		List<WebElement> Ele= driver.findElements(By.xpath("//html/body/div[2]/div/div[2]/center/table/tbody/tr/td[1]"));
		System.out.println("total row of booking before "+Ele.size());
	}
	public void Enterlogout() {
		logout.click();
	}

}
