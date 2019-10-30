package projectselenium;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import projectselenium.HomePage;
import projectselenium.LoginPage;

public class LoginTest extends BaseTest {

	@Test
    public void valid_UsernameAndPassword()throws InterruptedException {
       
        HomePage home = new   HomePage(driver,wait);
        LoginPage login = new   LoginPage(driver,wait);
        
        home.click(By.id(home.btnMenuLogIn));
       
        assertEquals(
        login.verifyUsernameAndPassword("saliha_pehlivan@gmail.com",
                                         "successPasword"),true);
    }
    @Test
    public void invalid_UsernameAndPassword() throws InterruptedException {
       
        HomePage home = new   HomePage(driver,wait);
        LoginPage login = new LoginPage(driver,wait);
        
        home.click(By.id(home.btnMenuLogIn));
        
        assertEquals(  
         login.verifyUsernameAndPassword("saliha_pehlivan@gmail.com",
                                          "failPassword"),false);
    }
    @Test
    public void   empty_UsernameAndPassword()throws   InterruptedException {
        
        HomePage home = new   HomePage(driver,wait);
        LoginPage login = new   LoginPage(driver,wait);
       
        home.click(By.id(home.btnMenuLogIn));
        
        assertEquals(login.verifyUsernameAndPassword("",""),
                                                        false);
    }
}
