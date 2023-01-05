package handlingMultipleElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3Facebook {
public static void main(String[] args) 
 {
	//set path for chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//launching of chrome browser 
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//URL of cricinfo
		cdriver.get("https://www.facebook.com/");
		//window maximize
		cdriver.manage().window().maximize();
		//click on create new account button
		cdriver.findElement(By.linkText("Create New Account")).click();
		
		

	}

}
