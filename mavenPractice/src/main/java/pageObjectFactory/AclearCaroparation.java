package pageObjectFactory;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class AclearCaroparation {

    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.clearcarrental.com/");
      //  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test (priority=1)
    public void Searchcab() throws InterruptedException {
        ClearCarOutsation obj = new ClearCarOutsation(driver);
        obj.outsearch();
        obj.outoneway();
        obj.outSourcecity("indore");
        obj.outDesinationCity("bhopal");
        obj.outStartDate("14-sep-2023");
        obj.outStarttime("6:45 Pm");
        obj.outSearchCab();
        obj.Back();
        obj.outsearch1();
        obj.rtrip();
        obj.outSourcecity1("delhi");
        obj.outDesinationCity1("mumbai");
        obj.outStartDate1("14-sep-2023");
        obj.outEndDate("15-sep-2023");
        obj.outStarttime1("8:20 Am");
        obj.outSearchCab1();
        obj.Back1();
        obj.outsearch2();
        obj.mcity();;
        obj.outSourcecity2("mumbai");
        obj.outDesinationCity2("delhi");
        obj.removebutton();
        obj.add1morecity("bhopal");
        obj.outStartDate2("14-sep-2023");
        obj.outEndDate2("15-sep-2023");
        obj.outStarttime2("3:20 Am");
        obj.outSearchCab2();
        obj.Back2();
    }
    
    @Test(priority=2)
    public void searchcab2() throws InterruptedException {
    	ClearCarLocal obj1= new ClearCarLocal(driver);
    	obj1.localsearch();
    	obj1.localhalfDay();
    	obj1.localSourcecity("indore");
    	obj1.localStartDate("14-sep-2023");
    	obj1.localDateEnd("14-sep-2023");
    	obj1.localStarttime("05:20 Am");
    	obj1.localSearchCab();
    	obj1.Back3();
    	obj1.localsearch1();
    	obj1.localfullDay();
    	obj1.localSourcecity1("indore");
    	obj1.localStartDate1("14-sep-2023");
    	obj1.localDateEnd1("14-sep-2023");
    	obj1.localStarttime1("05:20 Am");
    	obj1.localSearchCab1();
    	obj1.Back4();
    }
    
    @Test(priority=3)
    public void serachcab3() throws InterruptedException {
    	ClearCarTransfer obj2= new ClearCarTransfer(driver);
    	obj2.Transfersearch();
    	obj2.transferRS();
    	obj2.TransferSourcecity("Agra");
    	obj2.Transferpickup("Agra Cantonment Railway Station");
    	obj2.Transferdropup("Kheria Airport (agr)");
    	obj2.TransferStartDate("14-sep-2023");
    	obj2.transferDateEnd("14-sep-2023");
    	obj2.transferStarttime("05:15 Pm");
    	obj2.transferSearchCab();
    	obj2.Back5();
    	obj2.Transfersearch1();
    	obj2.transferRS1();
    	obj2.TransferSourcecity1("Ahmedabad");
    	obj2.Transferpickup1("Sardar Vallabh Bhai Patel Airport (amd)");
    	obj2.Transferdropup1("Kalupur Railway Station (adi)");
    	obj2.TransferStartDate1("14-sep-2023");
    	obj2.transferDateEnd1("14-sep-2023");
    	obj2.transferStarttime1("05:15 Pm");
    	obj2.transferSearchCab1();
    	obj2.Back6();
    	obj2.Transfersearch2();
    	obj2.transferRS2();
    	obj2.TransferSourcecity2("Ajmer");
    	obj2.Transferpickup2("A Block Panchsheel Colony");
    	obj2.Transferdropup2("Junction Railway Station (aii)");
    	obj2.TransferStartDate2("14-sep-2023");
    	obj2.transferDateEnd2("14-sep-2023");
    	obj2.transferStarttime2("05:15 Pm");
    	obj2.transferSearchCab2();
    	obj2.Back7();
    }
    
    @Test(priority=4)
    public void searchcab4() {
    	ClearCarDeals obj3= new ClearCarDeals(driver);
    	obj3.dealssearch();
    	obj3.dealsoneway();
    	obj3.dealsSourcecity("indore");
    	obj3.dealsDesinationCity("bhopal");
    	obj3.dealsStartDate("14-sep-2023");
    	obj3.dealsSearchCab();
    }
}

