package FORMY_PACK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled_disabled_Element {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://formy-project.herokuapp.com/enabled");
	    driver.manage().window().maximize();
	    
	    WebElement disabledfield = driver.findElement(By.id("disabledInput"));
	    disabledfield.click();
	    System.out.println(" This field is disabled");
	    
	    WebElement enabledField = driver.findElement(By.id("input"));
        enabledField.sendKeys("my name is nithya");
        System.out.println("This field is enabled!");
        Thread.sleep(3000);
        driver.close();
        
	    
	}

}
