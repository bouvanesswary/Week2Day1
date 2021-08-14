package week2day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		 driver.manage().window().maximize();
		 /*String title=driver.getTitle();
		 System.out.println(title);*/
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebElement webUser=driver.findElementByName("UserFirstName");
			webUser.sendKeys("Bouvanesswary");	 
		 driver.findElementByName("UserLastName").sendKeys("S");
		  driver.findElementByName("UserEmail").sendKeys("Bouvanesswary@gmail.com"); 
		 driver.findElementByName("CompanyName").sendKeys("HCL");
		 driver.findElementByName("UserPhone").sendKeys("9840420842");

		 WebElement dd1=driver.findElementByName("UserTitle");
		 Select jobtitle=new Select(dd1);
		 jobtitle.selectByValue("Sales_Manager_AP");
		 
		 WebElement dd2=driver.findElementByName("CompanyEmployees");
		 Select EmpCount=new Select(dd2);
		 EmpCount.selectByValue("75");
		 
		 WebElement dd3=driver.findElementByName("CompanyCountry");
		 Select Country=new Select(dd3);
		 Country.selectByValue("IN");
		 
		 
		 
	 
		  
		   
		 		 
	}

}
