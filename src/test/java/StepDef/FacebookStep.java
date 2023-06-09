package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookStep {
WebDriver driver;

	@Given("The facebook page is open")
	public void the_facebook_page_is_open() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.fb.com");
	}

	@When("^User enters (.*) and (.*)$")
	public void user_enters_username_and_password(String s, String t) throws InterruptedException {
	   driver.findElement(By.id("email")).sendKeys(s);
	   driver.findElement(By.id("pass")).sendKeys(t);
	   Thread.sleep(2000);
	}

	@When("Click on login button")
	public void click_on_login_button() throws InterruptedException {
	    driver.findElement(By.name("login")).click();
	    Thread.sleep(2000);
	}

	@Then("Close the browser")
	public void close_the_browser() {
	    driver.close();
	}

}
