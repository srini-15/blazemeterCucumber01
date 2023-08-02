package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.baseClass;
import webutilities.utils;


public class firstpage {
	
	
//	public baseClass bc;
	
	@FindBy(name="fromPort")
	private WebElement depart;
	
	@FindBy(name="toPort")
	private WebElement arrival;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement find;
	
	public firstpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getDepart() {
		return depart;
	}

	public WebElement getArrival() {
		return arrival;
	}
	
	public void find() {
		find.click();
	}
	
}
