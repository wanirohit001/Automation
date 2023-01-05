package commonUsedMethods;
import org.openqa.selenium.chrome.ChromeDriver;
public class seleniumex4 {
public static void main(String[] args) 
  {
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");	
    ChromeDriver cdrive = new ChromeDriver();
    cdrive.get("https://www.google.com/");
    String pageTitle= cdrive.getCurrentUrl();
    System.out.println("Page title validation ="+pageTitle.equals("google-Google Search"));
    System.out.println("Printing page url= "+cdrive.getCurrentUrl());
    System.out.println("Page title= "+pageTitle);
    System.out.println("length of page title ="+pageTitle.length());
    cdrive.close();
    }

}
