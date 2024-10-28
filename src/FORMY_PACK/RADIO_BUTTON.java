package FORMY_PACK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RADIO_BUTTON {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://formy-project.herokuapp.com/radiobutton");
	    driver.manage().window().maximize();
	    
	    //WebElement radiobutton1 = driver.findElement(By.id("radio-button-1"));
	    //radiobutton1.click();
	    
	    WebElement radioButton2 = driver.findElement(By.cssSelector("body > div > div:nth-child(6) > input"));
        radioButton2.click();
	    
        //WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        //radioButton3.click();
        
        Thread.sleep(3000);
        driver.close();
        
	    
	    
	}

}
