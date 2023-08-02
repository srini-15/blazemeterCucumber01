package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class thirdpage {
	@FindBy(name="inputName")
	private WebElement name;
	
	@FindBy(name="rememberMe")
	private WebElement rem;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement purchase;
	
	public thirdpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void name(String nam) {
		name.sendKeys(nam);
	}
	public WebElement getRem() {
		return rem;
	}
	public void purchase() {
		purchase.click();
	}
	
}
