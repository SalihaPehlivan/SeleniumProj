package projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver,   wait);
     driver.get("https://www.n11.com/");
  }
	
  public String btnMenuApps = "gbwa"; //   id
  public String btnMenuMaps = "gb8"; //   id
  public String btnMenuLogIn = "gb_70"; //   id
  
  public String checkMenuLinks(String button){
     click(By.id(button));
     return driver.getCurrentUrl();
  }
  
}
