package commonUsedMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3opensource {
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
	driver.findElement(By.className("text")).sendKeys("Rohit");
	driver.findElement(By.className("form-control")).sendKeys("Wani");
	
	WebElement Password =driver.findElement(By.id("firstpassword"));
	Password.sendKeys("admin123");
	WebElement username =driver.findElement(By.id("secondpassword"));
	username.sendKeys("admin123");
	driver.findElement(By.id("submitbtn")).click();
	
	}

}
