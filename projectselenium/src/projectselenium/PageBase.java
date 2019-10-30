package projectselenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class PageBase {
	
	  public WebDriver driver;
	     public WebDriverWait wait;
	     
	     public PageBase (WebDriver driver, WebDriverWait wait){
	         this.driver = driver;
	         this.wait = wait;
	     }
	     
	     public void click (By Sepetim) {
	         driver.findElement(Sepetim).click();
	     }
	     
	     public void writeText (By email, String text) {
	         driver.findElement(email).clear();
	         driver.findElement(email).sendKeys("saliha_pehlivan@gmail.com");
	     }
	     
	     public void writePass (By password, String text) {
	         driver.findElement(password).clear();
	         driver.findElement(password).sendKeys("salpeh1234");
	     }
	     
	     public String readText (By elementLocation) {
	         return driver.findElement(elementLocation).getText();
	     }
	     
	     public List<WebElement> getElements(By elementLocation){
	         return driver.findElements(elementLocation);
	     }
	     
	     public WebElement getElement(By elementLocation){
	         return driver.findElement(elementLocation);
	     }
	}


