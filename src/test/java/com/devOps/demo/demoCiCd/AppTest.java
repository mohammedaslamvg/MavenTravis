package com.devOps.demo.demoCiCd;



import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Unit test for simple App.
 */
public class AppTest {
  
	 @Test
	   public void justAnExample() throws InterruptedException {
	        System.out.println("Selenium Automation testing Starts here....");
	        Thread.sleep(2000);
	        System.out.println("Login to the application succesfully");
	        System.out.println("Selenium Automation testing Ends here....");
	        String obj1="Junit";
	        String obj2="Junit";
	        assertEquals(obj1,obj2);
//	        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//chromedriver.exe");
//	        WebDriver driver= new ChromeDriver();
//	        driver.get("https://www.google.com");
	        
	    }
}
