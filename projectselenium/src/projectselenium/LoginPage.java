package projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver,   wait);
     }
     
     public String txtMail = "identifierId"; //   id
     public String txtPassword = "password"; //   name
     public String btnNext = "CwaK9"; //   className
     public boolean verifyUsernameAndPassword(String username, String password) throws InterruptedException {
     
     writeText(By.id(txtMail),username);
     
     click(By.className(btnNext));
     
     Thread.sleep(500);
     
     if(driver.getCurrentUrl().contains("pwd")){
           
           writeText(By.name(txtPassword),password);
       
           
           Thread.sleep(600);
          
           return driver.getCurrentUrl().contains("signinoptions");
      }else{
          return false;
      }
     }
}
