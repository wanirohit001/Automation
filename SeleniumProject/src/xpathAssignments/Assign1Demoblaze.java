package xpathAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1Demoblaze {
public static void main(String[] args) 
 {  //set path for chrome browser
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	//Launch the chrome browser
	WebDriver cdriver = new ChromeDriver();
    cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    cdriver.manage().window().maximize();
	//URL of Demoblaze
	cdriver.get("https://demoblaze.com/");
	//x-path for mobile prize
	WebElement price = cdriver.findElement(By.xpath("//div[h4[a[text()='Samsung galaxy s6']]]/h5"));
	//Print price
	System.out.println("prize="+price.getText());
	
	}

}
