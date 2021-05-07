package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestJava2{

    public WebDriver driver;
    
    @Before
    public void setup(){
        	System.setProperty("webdriver.gecko.driver","C:\\Users\\haluk\\eclipse-workspace\\SeleniumWeb\\geckodriver.exe");

        	driver = new FirefoxDriver();
        	String url = "https://www.gittigidiyor.com/";
        	driver.get(url);
        	driver.manage().window().maximize();
        	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
    }
    @Test
    public void Search(){
    		WebElement searchWord = driver.findElement(By.name("k"));
    		searchWord.click();
    		searchWord.sendKeys("Bilgisayar");
    		driver.findElement(By.className("qjixn8-0")).click();
    		driver.get("https://www.gittigidiyor.com/arama/?k=Bilgisayar&sf=2");
    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    		
    		driver.get("https://www.gittigidiyor.com/bilgisayar-tablet/lenovo-v55t-amd-ryzen-5-3400g-8gb-ram-256-ssd-2gb-gt-730-freedos-masaustu-bilgisayar-11cc001ltx001_pdp_645851285");
    		
    		WebElement xyz = driver.findElement(By.className("IncNumber"));
    		xyz.click();
    		xyz.clear();
    		xyz.sendKeys("2");
    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    		
    		WebElement abc = driver.findElement(By.id("add-to-basket"));
    		abc.click();
    		abc.clear();
    		abc.sendKeys("1");
    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    		

      }
        
    
    @After
    public void exit(){
        	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        	driver.quit();
    }
}