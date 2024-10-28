package FORMY_PACK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CHECKBOXES {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://formy-project.herokuapp.com/checkbox");
	    driver.manage().window().maximize();

	    WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
	    checkbox1.click();
	    
	    WebElement Checkbox2 = driver.findElement(By.id("checkbox-2"));
	    Checkbox2.click();
	    
	    WebElement Checkbox3 = driver.findElement(By.id("checkbox-3"));
	    Checkbox3.click();
	    Thread.sleep(3000);
	    driver.close();
	    
	}

}
