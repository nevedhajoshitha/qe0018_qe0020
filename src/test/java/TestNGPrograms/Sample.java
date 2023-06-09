package TestNGPrograms;

import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Sample {
	@BeforeSuite
	public void bs() {
		System.out.println("Before suite");
	}
	
	@AfterSuite
	public void as() {
		System.out.println("After suite");
	}
	
	@BeforeClass
	public void bc() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public void ac() {
		System.out.println("After class");
	}
	
	@BeforeTest
	public void bt() {
		System.out.println("Before test");
	}
	
	@AfterTest
	public void at() {
		System.out.println("After test");
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("After Method");
	}
	
	@Test(priority =2, groups = {"groupA"})
	public void TC1() {
		System.out.println("First test");
		Reporter.log("This is step 1");
	}
	
	@Test(groups = {"groupB"}, invocationCount = 4, dependsOnGroups = {"groupA"})
	public void TC2() {
		throw new SkipException("This is skipped");
		//System.out.println("Second test");
	}
	
	@Test(priority = -1, groups = {"groupA"})
	public void TC3() {
		System.out.println("Third test");
		Reporter.log("This is step 3");
	}
}
