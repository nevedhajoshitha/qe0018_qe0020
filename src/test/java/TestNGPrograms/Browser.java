package TestNGPrograms;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base_Package.Base_Class;

public class Browser extends Base_Class{
@BeforeMethod
public void OpenBrowser() {
	Open("https://www.google.com");
}

@AfterMethod
public void CloseBrowser() {
	Close();
}

@DataProvider(name = "sampleData")
public Object[][] data(){
	return new Object[][] {{"Selenium"} };
}

@Test(dataProvider = "sampleData")

public void Search(String str) throws InterruptedException {
	SoftAssert sa = new SoftAssert();
	String s = driver.getTitle();
	String t = "Good";
	sa.assertEquals(s, t);
	//Assert.assertEquals(s, t,"the titles are not matching");
	driver.findElement(By.name("q")).sendKeys(str);
	Thread.sleep(2000);
	driver.findElement(By.name("btnK")).click();
	Thread.sleep(2000);
	sa.assertAll();
}
}
