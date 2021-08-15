package week2day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookReg {

			public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			 ChromeDriver driver=new ChromeDriver();
			driver.get("https://en-gb.facebook.com/");
			 driver.manage().window().maximize();
			 /*String title=driver.getTitle();
			 System.out.println(title);*/
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 WebElement webUser=driver.findElementByLinkText("Create New Account");
				webUser.click();	 
				
			 driver.findElementByName("firstname").sendKeys("Bouvanesswary");
			  driver.findElementByName("lastname").sendKeys("S"); 
			 driver.findElementByName("reg_email__").sendKeys("Bouvanesswary@gmail.com");
			 driver.findElementById("password_step_input").sendKeys("Password@123");
			 
			 WebElement Dateofbirth=driver.findElementById("day");
			 Select date=new Select(Dateofbirth);
			 date.selectByValue("14");
			 
			 WebElement monthof=driver.findElementById("month");
			 Select month1=new Select(monthof);
			 month1.selectByValue("11");
			 
			 WebElement faceuser=driver.findElementById("year");
			 Select year1=new Select(faceuser);
			 year1.selectByValue("1988");
			 
			 WebElement radio = driver.findElementById("u_m_4_Wt");
			    radio.click();
			  
	}

}
