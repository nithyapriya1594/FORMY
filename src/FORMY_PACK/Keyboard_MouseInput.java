package FORMY_PACK;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_MouseInput {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://formy-project.herokuapp.com/keypress?");
	    driver.manage().window().maximize();
	    
	    WebElement inputField = driver.findElement(By.id("name"));
        inputField.sendKeys("Hello, nithya!");
        inputField.sendKeys(Keys.ENTER);
        System.out.println("this field was entered with keyboard");
        
        
        WebElement button = driver.findElement(By.id("button"));
        button.click();
       
        Actions actions = new Actions(driver);
        actions.moveToElement(button).build().perform();
        System.out.println(" This filed was clicked with mouse");
        
        
        
        
	}

}
