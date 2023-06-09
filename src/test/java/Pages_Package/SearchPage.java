package Pages_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
WebDriver driver;

public SearchPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

@FindBy(id = "twotabsearchtextbox")
WebElement text;

@FindBy(id = "nav-search-submit-button")
WebElement button;

public void EnterText() {
	text.sendKeys("laptop");
}

public void Click() {
	button.click();
}
}
