package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.baseClass;
import io.cucumber.java.en.*;
import pompages.firstpage;
import pompages.secondpage;
import pompages.thirdpage;
import webutilities.utils;

public class firstScenario extends baseClass {
//	public WebDriver driver;
//	public WebDriver driver=new ChromeDriver();
	public firstpage fp;
	public utils u;
	public secondpage sp;
	public thirdpage tp;
	
	
	@Given("user launches the browser")
	public void user_launches_the_browser() {
//		driver=new ChromeDriver();
//		bc= new baseClass();
//	    bc.openApp();
	   System.out.println("launched browser successfully");
		max();
	}

	@Then("Enter the url as {string}")
	public void enter_the_url_as(String string) {
//		bc= new baseClass();
	    Url(string);
	}

	@When("check the title as {string}")
	public void check_the_title_as(String string) {
	   check(driver,string);
	}

	@Then("select departure as {string} and arrive to {string}")
	public void select_departure_as_and_arrive_to(String string, String string2) {
		 fp=new firstpage(driver);
	    WebElement ele = fp.getDepart();
	    u=new utils();
	    u.dropdown(ele,string);
	    WebElement ele1 = fp.getArrival();
	    u.dropdown(ele1,string2);
	}

	@Then("click on find flights")
	public void click_on_find_flights() {
//		firstpage fp=new firstpage(driver);
	    fp.find();
	}

	@Then("click on third option")
	public void click_on_third_option() {
		sp= new secondpage(driver);
	    sp.choose();
	}

	@Then("enter the valid details {string}")
	public void enter_the_valid_details(String string) {
		tp=new thirdpage(driver);
	    tp.name(string);
	}

	@Then("Scroll the page till purchase button")
	public void scroll_the_page_till_purchase_button() {
	    u=new utils();
	    WebElement ele=tp.getRem();
	    u.scroll(driver, ele);
	}

	@Then("click purchase flights")
	public void click_purchase_flights() {
	    tp.purchase();
	}

	@Then("check the page as {string}")
	public void check_the_page_as(String string) {
		check(driver,string); 
	}

	@Then("close the browser")
	public void close_the_browser() throws IOException {
		u.screenshot(driver);
	    closeApp();
	}
}
