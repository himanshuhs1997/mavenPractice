package pageObjectModel;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IntegrationSearch {

	WebDriver driver;
	By Select = By.name("ddlcat");
	By category = By.id("subcat");
	By subCategory = By.name("ddllocation");
	By searchproperty = By.className("btn-one");
	
	public IntegrationSearch(WebDriver Driver) {
		this.driver=driver;
	}
	
	public void f() {
		System.out.println("123");
		driver.navigate().refresh();
	}
	public void SelectSearch() {
		Select s = new Select(driver.findElement(Select));
		s.selectByVisibleText("Flat");
	}
	public void SelectCategory() {
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("subcat")));
		Select s1 = new Select(driver.findElement(category));
		s1.selectByVisibleText("3 BHK");
	}
	public void SelectSubCategory() {
		Select s2 = new Select(driver.findElement(subCategory));
		s2.selectByVisibleText("Bajrang Nagar");
	}
	public void ClickButton() {
		driver.findElement(searchproperty).click();
	}
	
}
