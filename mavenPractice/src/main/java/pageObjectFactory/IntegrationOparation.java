package pageObjectFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjectModel.IntegraOfOwnerLogin;
import pageObjectModel.IntegrationAddRoom;
import pageObjectModel.IntegrationSearch;

public class IntegrationOparation {

	WebDriver driver;
	IntegrationOwnerlogin obj;
	IntegrationAddRoom obj1;
	IntegrationSearch obj2;
	
	@BeforeTest
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://eroomrent.in");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	@Test (priority =1)
	public void performAction() {
		obj = new IntegrationOwnerlogin(driver); 
			obj.actionperform();
			obj.EnterUserName("himanshusharma0805@gmail.com");
			obj.EnterPassword("Anshu@987");
			obj.Enterbutton();
	}
	@Test (priority=2)
	public void Bookroom() {
		obj1= new IntegrationAddRoom(driver);
		    obj1.refresh();
			obj1.EnterAddroom();
			obj1.EnterSLocation();
			obj1.Entercategory();
			obj1.Entersubcategory();
			obj1.EnterRoomDes("2 bhk flat available");
			obj1.EnterChoosefile("D://MY PLAN//3D View 3.jpg");
			obj1.EnterRoomprice("8963");
			obj1.EnterRoomfacility("fully furnised");
			obj1.EnterInsert();
			obj1.EnterViewRoom();
			obj1.EnterBooking();
			obj1.Enterlogout();
	}
	@Test (priority=3)
	public void searchroom() {
		obj2 = new IntegrationSearch(driver);
		obj2.f();
		obj2.SelectSearch();
		obj2.SelectCategory();
		obj2.SelectSubCategory();
		obj2.ClickButton();
	}

}
