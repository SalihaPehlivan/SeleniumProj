package projectselenium;

import static org.junit.Assert.*;
import org.junit.Test;
import projectselenium.HomePage;

public class HomeTest extends BaseTest {

	@Test
    public void valid_checkMenuLinks() throws InterruptedException{
      
        HomePage home = new HomePage(driver,wait);
        
        assertEquals(home.checkMenuLinks(home.btnMenuApps),
                "https://www.n11.com/");

                  
     }
	
     @Test
     public void invalid_checkMenuLinks() throws InterruptedException {
       
        HomePage home = new HomePage(driver,wait);
       
        assertNotEquals(home.checkMenuLinks(home.btnMenuApps),
                "https://www.n11.com/mobilya"); 

        assertNotEquals(home.checkMenuLinks(home.btnMenuLogIn),
                            "testLink.com");

        assertNotEquals(home.checkMenuLinks(home.btnMenuMaps),
                                      "test");
      }
}
