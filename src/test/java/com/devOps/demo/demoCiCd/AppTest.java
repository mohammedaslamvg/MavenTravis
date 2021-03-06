package com.devOps.demo.demoCiCd;



import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


/**
 * Unit test for simple App.
 */
public class AppTest {
  
	 @Test
	   public void justAnExample() throws InterruptedException {
	        System.out.println("Selenium Automation testing Starts here....");
	        Thread.sleep(2000);
	        
	        System.out.println("Selenium Automation testing Ends here....");
	        String obj1="Junit";
	        String obj2="Junit";
	        assertEquals(obj1,obj2);
	        final ChromeOptions chromeOptions = new ChromeOptions();
	        //chromeOptions.setBinary("/path/to/google-chrome-stable");
		chromeOptions.setBinary("/usr/bin/google-chrome-stable");
	        chromeOptions.addArguments("--headless");
	        chromeOptions.addArguments("--disable-gpu");
	        chromeOptions.addArguments("--no-sandbox");

	        final DesiredCapabilities dc = new DesiredCapabilities();
	        dc.setJavascriptEnabled(true);
	        dc.setCapability(
	            ChromeOptions.CAPABILITY, chromeOptions
	        );

	        WebDriver driver = new ChromeDriver(dc);
//	        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//chromedriver.exe");
//	        WebDriver driver= new ChromeDriver();
	        driver.get("https://in.musafir.com/");
	        Thread.sleep(5000);
	        System.out.println("Login to the application succesfully");
	        driver.findElement(By.name("Origin")).sendKeys("Kochi");
	        System.out.println("Entered Value in to the application succesfully");
	        
	       
	        
	        
	    }
}
