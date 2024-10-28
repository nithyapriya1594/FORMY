package FORMY_PACK;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DATEPICKER {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://formy-project.herokuapp.com/datepicker");
	    driver.manage().window().maximize();
	    
	    WebElement Datepicker = driver.findElement(By.id("datepicker"));
	    Datepicker.click();
	    Datepicker.sendKeys("10/25/2024");
	    Datepicker.sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    driver.close();
	    
	    
	    
	    
	    

	    
        
	    
	}

}
