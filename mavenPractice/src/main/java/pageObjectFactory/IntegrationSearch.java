package pageObjectFactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IntegrationSearch {

	WebDriver driver;
	@FindBy(name="ddlcat")
	WebElement Search;
	@FindBy(id="subcat")
	WebElement category;
	@FindBy(name="ddllocation")
	WebElement subCategory;
	@FindBy(className="btn-one")
	WebElement searchproperty;
	
	public IntegrationSearch(WebDriver Driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void f() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	public void SelectSearch() {
		Select s = new Select(Search);
		s.selectByVisibleText("Flat");
	}
	public void SelectCategory() {
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait1.until(ExpectedConditions.visibilityOfElementLocated((By) category));
		Select s1 = new Select(category);
		s1.selectByVisibleText("3 BHK");
	}
	public void SelectSubCategory() {
		Select s2 = new Select(subCategory);
		s2.selectByVisibleText("Bajrang Nagar");
	}
	public void ClickButton() {
	 searchproperty.click();
	}

}
