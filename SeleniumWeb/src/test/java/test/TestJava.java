package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;



public class TestJava
{
	
      public  WebDriver driver;
    
      @Before
	  public void setup()
      {
	        
    	  System.setProperty("webdriver.gecko.driver","C:\\Users\\haluk\\eclipse-workspace\\SeleniumWeb\\geckodriver.exe");
	      driver = new FirefoxDriver();
	      String url = "https://www.gittigidiyor.com/";
	      driver.get(url);
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   }
	  
      @Test
	  public void TestPage()
      {
    	  	
    	  	WebElement button1 = driver.findElement(By.name("profile"));
	        button1.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        driver.get("https://www.gittigidiyor.com/uye-girisi");
	        
	        

	        WebElement username = driver.findElement(By.name("kullanici"));
	        username.sendKeys("kullaniciAdim123");

	        WebElement password = driver.findElement(By.id("L-PasswordField"));        
	        password.sendKeys("asdsfsjdksd123");
	        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	        driver.findElement(By.id("gg-login-enter")).click();
	    }
	   
      @After
	    public void exit()
      	{
	        	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	        	driver.quit();
	    }
}


