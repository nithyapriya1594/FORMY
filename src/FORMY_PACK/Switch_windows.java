package FORMY_PACK;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Switch_windows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://formy-project.herokuapp.com/switch-window");
	    driver.manage().window().maximize();
	    
//	    WebElement open_new_tab = driver.findElement(By.id("new-tab-button"));
//	    open_new_tab.click();
//	    Thread.sleep(4000);

	    WebElement open_alert = driver.findElement(By.id("alert-button"));
	    open_alert.click();
	    
	    Alert alert1 = driver.switchTo().alert();
	    String This_is_a_test_alert= driver.switchTo().alert().getText();
	    System.out.println(This_is_a_test_alert);
	     Thread.sleep(2000);
	    alert1.accept();
	     
	    Thread.sleep(3000);
	    driver.close();
	    
	    
	    
	}

}
