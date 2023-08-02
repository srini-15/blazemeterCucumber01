package baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import stepdefinitions.firstScenario;

public class baseClass {
	public WebDriver driver=new ChromeDriver();
//	public WebDriver driver;
//	firstScenario fs=new firstScenario();
	public void openApp() {
		driver= new ChromeDriver();
	}
	public void Url(String url) {
		driver.get(url);
	}
	public void max() {
		driver.manage().window().maximize();
	}
	public void impwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	public void check(WebDriver driver,String s) {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		if(driver.getTitle().equals(s)) {
			System.out.println("checked and it is pass");
		}
		else {
			System.out.println("fail");
		System.exit(0);
		}
		
	}
	
	public void closeApp() {
		driver.quit();
	}
}
