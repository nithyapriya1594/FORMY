package FORMY_PACK;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BUTTONS {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver-win64\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
	        driver.get("https://formy-project.herokuapp.com/buttons");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        WebElement primarybutton = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[1]"));
	        primarybutton.click();
	        System.out.println("Clicked Primary Button");
	        
	        WebElement Sucessbutton = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[2]"));
	        Sucessbutton.click();
	        System.out.println("Clicked Sucess Button");
	        
	        WebElement Infobutton = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[3]"));
	        Infobutton.click();
	        System.out.println("Clicked Info Button");
	        
	        WebElement Warning = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[4]"));
	        Warning.click();
	        System.out.println("Clicked Warning Button");
	        
	        WebElement Danger = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[5]"));
	        Danger.click();
	        System.out.println("Clicked danger Button");
	        
	         WebElement Link = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[6]"));
            Link.click();
            System.out.println("Clicked Link");
            
            WebElement leftsplit = driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[1]"));
            leftsplit.click();
            System.out.println("Clicked left split button");
            
            WebElement Middlesplit = driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[2]"));
            Middlesplit.click();
            System.out.println("Clicked middle split button");
            
            WebElement Rightsplit = driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[3]"));
            Rightsplit.click();
            System.out.println("Clicked right split button");
            
            WebElement one = driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/button[1]"));
            one.click();
            System.out.println("clicked 1");
            
            WebElement two = driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/button[2]"));
            two.click();
            System.out.println("clicked 2");
            
            WebElement Dropdown = driver.findElement(By.xpath("//*[@id=\"btnGroupDrop1\"]"));
            Dropdown.click();
            System.out.println("clicked dropdown");
            
           WebElement Dropdown1 = driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/div/div/a[1]"));
            Dropdown1.click();
           System.out.println("Selected dropdown1 link");
          
           @SuppressWarnings("unused")
		WebElement Dropdownlink2 = driver.findElement(By.cssSelector("body > div > form > div:nth-child(3) > div > div > div > div > div > a:nth-child(2)"));
           Dropdown.click();
           System.out.println("Selected dropdown 2 link");
           Thread.sleep(3000);
           driver.close();
            
         

	}

}
