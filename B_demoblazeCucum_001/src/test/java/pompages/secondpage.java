package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class secondpage {

	@FindBy(xpath="(//input[@type='submit'])[3]")
	private WebElement choose;
	
	public secondpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void choose() {
		choose.click();
	}
}
