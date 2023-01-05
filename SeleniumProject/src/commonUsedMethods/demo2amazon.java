package commonUsedMethods;

import org.openqa.selenium.chrome.ChromeDriver;
public class demo2amazon {
public static void main(String[] args) 
 {
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	  ChromeDriver cdriver = new ChromeDriver(); 
	  cdriver.get("https://www.amazon.in/");
	  String pageTitle = cdriver.getTitle();
	  System.out.println("Print page Title ="+pageTitle);
	  System.out.println("page Title validation is ="+pageTitle.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches..."));
	  System.out.println("Print page URL ="+cdriver.getCurrentUrl());
	  System.out.println("page URL validation is= "+cdriver.equals(cdriver));
	  
	  String sourcecode = cdriver.getPageSource();
	  System.out.println("page source code length is ="+sourcecode.length());

	}

}
