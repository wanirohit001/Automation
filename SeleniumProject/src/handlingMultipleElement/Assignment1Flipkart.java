package handlingMultipleElement;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1Flipkart {
public static void main(String[] args) 
  { //set path for chrome driver
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");//set the path
	//Launching the Chrome browser.
	ChromeDriver cdriver = new ChromeDriver();
	cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//URL of flipkart
	cdriver.get("https://www.flipkart.com/");
	cdriver.manage().window().maximize();
	
	List<WebElement> suggestList = cdriver.findElements(By.cssSelector("#container>div>div._331-kn._2tvxW>div>div>div"));
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
