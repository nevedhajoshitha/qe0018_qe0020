package Object_Package;

import java.util.Iterator;
import java.util.Set;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Base_Package.Base_Class;
import Pages_Package.Cart;
import Pages_Package.SearchPage;

public class Main extends Base_Class {
public static void main(String[] args) throws InterruptedException {
	
	ExtentHtmlReporter report = new ExtentHtmlReporter("C:\\Users\\NEVEDHA\\eclipse2-workspace\\Batch18_20\\target\\ExtentReport.html");
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(report);
	
	ExtentTest test = extent.createTest("First test","This is the first extent report of qe018 and qe020");
		
	Open("https://www.amazon.in");
	test.log(Status.INFO, "the page is launched");
	SearchPage s =new SearchPage(driver);
	s.EnterText();
	s.Click();
	Thread.sleep(2000);
	
	Cart c = new Cart(driver);
	c.Clickitem();
	test.log(Status.INFO, "item is added to the cart");
	//handle window
	Set<String> str = driver.getWindowHandles();
	Iterator<String> it = str.iterator();
	String main = it.next();
	String child = it.next();
	driver.switchTo().window(child);
	
	c.Add();
	
	test.log(Status.INFO, "the job is done");
	Thread.sleep(2000);
	Close();
	test.log(Status.INFO, "the page is closed");
	
	extent.flush();
}
}
