package commonUsedMethods;
import org.openqa.selenium.chrome.ChromeDriver;
public class seleniumex3 {
public static void main(String[] args) 
 {  //Set the path for Chrome/firefox browser launching.
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	//Launching the Chrome/Firefox browser
	ChromeDriver cdrive = new ChromeDriver();
	cdrive.get("https://kite.zerodha.com/");
	String pageTitle = cdrive.getTitle();	
	System.out.println("page Title is = "+pageTitle);
	System.out.println("page Title validation= "+pageTitle.equals(" Kite - Zerodha's fast and elegant flagship trading platform"));
	System.out.println("page length is = "+pageTitle.length());
	//for printing URL
	System.out.println("page url is = "+cdrive.getCurrentUrl());
	
	String sourcecode= cdrive.getPageSource();
	System.out.println("length of source code= "+sourcecode.length());
	System.out.println("page source code= "+sourcecode);
	
	}
}
