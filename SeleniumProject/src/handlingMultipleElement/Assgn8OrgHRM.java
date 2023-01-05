package handlingMultipleElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgn8OrgHRM {
public static void main(String[] args) 
 {  // Path of Chrome driver
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	//Launching of chrome driver
	ChromeDriver cdriver = new ChromeDriver();
	//Implicit wait
	cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//Maximize window
	cdriver.manage().window().maximize();
	//URL of Webpage
	cdriver.get("https://opensource-demo.orangehrmlive.com");
	//for username
	cdriver.findElement(By.cssSelector("div.oxd-form-row>div>div>input")).sendKeys("Admin");
	//password
	cdriver.findElement(By.cssSelector("div.oxd-form-row>div>div>input.oxd-input")).sendKeys("admin123");
		
	}

}
