package pageObjectModel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IntegrationAddRoom {

	WebDriver driver;
	By addroom = By.partialLinkText("Add");
	By Slocation = By.name("ddllocation");
	By Category= By.name("ddlcat");
	By SubCategory = By.name("ddlsubcat");
	By roomdescription = By.name("txtdesc");
	By chooseFile = By.name("file");
	By roomprice = By.name("txtamount");
	By roomFacilty = By.name("txtfacility");
	By insert = By.name("btnsubmit");
	By viewroom = By.partialLinkText("View Room");
	By booking = By.linkText("Booking");
	By logout = By.linkText("Logout");
	
	public IntegrationAddRoom(WebDriver driver) {
		this.driver=driver;
	}
	public void refresh() {
		driver.navigate().refresh();
	}
	
	public void EnterAddroom() {
		driver.findElement(addroom).click();
	}
	public void EnterSLocation() {
		Select dd1= new Select(driver.findElement(Slocation));
		dd1.selectByVisibleText("Bajrang Nagar");
	}
	public void Entercategory() {
		Select dd2= new Select(driver.findElement(Category));
		dd2.selectByVisibleText("Flat");
	}
	public void Entersubcategory() {
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(SubCategory));
		Select dd3= new Select(driver.findElement(SubCategory));
		dd3.selectByVisibleText("3 BHK");
	}
	public void EnterRoomDes(String arg) {
		driver.findElement(roomdescription).sendKeys(arg);
	}
	public void EnterChoosefile(String arg) {
		driver.findElement(chooseFile).sendKeys(arg);
	}
	public void EnterRoomprice(String arg) {
		driver.findElement(roomprice).sendKeys(arg);
	}
	public void EnterRoomfacility(String arg) {
		driver.findElement(roomFacilty).sendKeys(arg);
	}
	public void EnterInsert() {
		driver.findElement(insert).click();
	}
	public void EnterViewRoom() {
		driver.findElement(viewroom).click();
		List<WebElement> ele1 = driver.findElements(By.xpath("/html/body/div[2]/div/div[2]/center/table/tbody/tr/td[1]"));
		System.out.println("total view book row"+ele1.size());
    }
	public void EnterBooking() {
		driver.findElement(booking).click();
		List<WebElement> Ele= driver.findElements(By.xpath("//html/body/div[2]/div/div[2]/center/table/tbody/tr/td[1]"));
		System.out.println("total row of booking before "+Ele.size());
	}
	public void Enterlogout() {
		driver.findElement(logout).click();
	}
}
