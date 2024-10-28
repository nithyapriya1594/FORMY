package FORMY_PACK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FILE_UPLOAD {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://formy-project.herokuapp.com/fileupload");
	    driver.manage().window().maximize();
	    
	   WebElement fileupload = driver.findElement(By.id("file-upload-field"));
	   fileupload.sendKeys("D:\\camera photoss\\2020-05-10-11-07-08-361.jpg");
	   Thread.sleep(3000);

	   WebElement reset = driver.findElement(By.xpath("/html/body/div/form/div/div/span[2]/button"));
	   reset.click();
	    
	   System.out.println("File upload and field reset successfully.");
	   driver.close();
	   
	   
	    
	    
	}

}
