package pageObjectFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjectModel.BrowserStackHomePage;
import pageObjectModel.BrowserStackSignupPage;

public class Manageoparation {

	WebDriver driver;
	broserStackHomePage obj;
	browserStackSignupPage obj1;
	@BeforeTest
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.browserstack.com/");
	}

	@Test(priority = 1)
	public void navigate_to_homepage_click_on_getstarted() {
	obj = new broserStackHomePage(driver);
	obj.vHeader();
	obj.clickgetStarted();
	}

	@Test(priority = 2)
	public void enter_userDetails() {
	obj1 = new browserStackSignupPage(driver);
	obj1.vHeader();
	obj1.enterFullName("ram");
	obj1.enterBusinessEmail("ram123@gmail.com");
	obj1.enterPasswrod("Ram@321");
	obj1.enterCheckbox();
	obj1.enterButton();
	}

}
