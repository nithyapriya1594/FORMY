package FORMY_PACK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MODAL {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://formy-project.herokuapp.com/modal");
	    driver.manage().window().maximize();
	      
	    WebElement openModalButton = driver.findElement(By.id("modal-button"));
        openModalButton.click();
        
       WebElement CloseModalButton = driver.findElement(By.id("close-button"));
       CloseModalButton.click();
          
        //WebElement ok = driver.findElement(By.id("ok-button"));
        //ok.click();
       
        Thread.sleep(3000);
        
        driver.close();
        
      

        
        
        
	}

}
