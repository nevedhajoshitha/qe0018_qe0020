package Pages_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	WebDriver driver;

	public Cart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Lenovo IdeaPad Slim 3 Intel Core i5 12th Gen 15.6\" (39.62cm) FHD Thin & Light Laptop')]")
	WebElement item;
	
	@FindBy(id = "add-to-cart-button")
	WebElement cartbutton;
	
	public void Clickitem() {
		item.click();
	}
	
	public void Add() {
		cartbutton.click();
	}

}
