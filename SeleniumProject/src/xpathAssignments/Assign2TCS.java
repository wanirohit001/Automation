package xpathAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2TCS {
public static void main(String[] args) 
{   //path for chrome browser
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
    //Launching of chrome driver
	WebDriver cdriver = new ChromeDriver();
	//implicit wait
	cdriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Maximize window
	cdriver.manage().window().maximize();
    //URL of NSE.India
	cdriver.get("https://www.nseindia.com/");
    //Volume of any stock
	WebElement volume = cdriver.findElement(By.xpath("//tr[td[a[text()='TCS']]]/td[4]"));
	//Print the volume of TCS stock
	System.out.println("value ="+volume.getText());
	
	}

}
