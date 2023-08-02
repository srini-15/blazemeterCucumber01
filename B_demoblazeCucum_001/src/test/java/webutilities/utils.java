package webutilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.CopyUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class utils {

	public void dropdown(WebElement ele, String a) {
		Select s= new Select(ele);
		s.selectByVisibleText(a);
	}
	
	public void scroll(WebDriver dri,WebElement ele) {
		JavascriptExecutor js= (JavascriptExecutor) dri;
		int x= ele.getLocation().getX();
		int y= ele.getLocation().getY();
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	public void screenshot(WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest= new File(".//photoclip"+"final.png");
		FileUtils.copyFile(src, dest);
	}
}
