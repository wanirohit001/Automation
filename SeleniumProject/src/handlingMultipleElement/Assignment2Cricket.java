package handlingMultipleElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2Cricket {
public static void main(String[] args) 
 {   //set path for chrome driver
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	//launching of chrome browser by generic method
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//URL of cricinfo
	driver.get("https://www.espncricinfo.com/");
	
	List<WebElement> suggestList = driver.findElements(By.cssSelector("div.ds-relative>nav>div>div>div>div>div>div>a"));
	//WebElement Total count
		int suggCount=suggestList.size();
		System.out.println(suggCount);
		//To access one by one list element
		for(int i=0;i<suggCount;i++) 
		{
			System.out.println(suggestList.get(i).getText());
		}

	}

}
