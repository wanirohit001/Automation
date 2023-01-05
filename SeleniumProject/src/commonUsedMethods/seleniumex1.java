package commonUsedMethods;
import org.openqa.selenium.chrome.ChromeDriver;
public class seleniumex1 {
public static void main(String[] args) 
 {  //Set the path for Chrome/Firefox browser
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	//Launching Chrome/Firefox browser
	ChromeDriver cdrive = new ChromeDriver();
	//URL of application
	cdrive.get("https://demo.actitime.com/");
	String pageTitle = cdrive.getTitle();	
	System.out.println("page Title is = "+pageTitle);
	System.out.println("page Title validation= "+pageTitle.equals("actiTIME"));
	System.out.println("page length is = "+pageTitle.length());
	
	System.out.println("page url is = "+cdrive.getCurrentUrl());
	
	String sourcecode = cdrive.getPageSource();
	System.out.println("page source code is ="+sourcecode);
	System.out.println("length of source code = "+sourcecode.length());
	
    }

}
