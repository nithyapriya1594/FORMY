package FORMY_PACK;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PAGE_SCROLL {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://formy-project.herokuapp.com/scroll");
        driver.manage().window().maximize();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement nameField = driver.findElement(By.id("name"));
        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView(true);", nameField);
        nameField.sendKeys("Nithyapriya M.N.");
        
        WebElement dateField = driver.findElement(By.id("date"));
        dateField.sendKeys("05/15/1994");
        Thread.sleep(2000);
        driver.close();
        
	}

}
