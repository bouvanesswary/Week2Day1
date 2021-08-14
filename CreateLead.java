package week2day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		 driver.manage().window().maximize();
		 String title=driver.getTitle();
		 System.out.println(title);
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 //locateUsername and Password
		WebElement webUser=driver.findElementById("username");
		webUser.sendKeys("demosalesmanager");
		 //driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
				
		driver.findElementById("createLeadForm_companyName").sendKeys("HCL");
		driver.findElementById("createLeadForm_firstName").sendKeys("Bouvanesswary");
		driver.findElementById("createLeadForm_lastName").sendKeys("S");
		driver.findElementByName("firstNameLocal").sendKeys("Bouvana");
		driver.findElementByName("lastNameLocal").sendKeys("Sandi");
		driver.findElementByName("personalTitle").sendKeys("Mrs");
		driver.findElementByName("generalProfTitle").sendKeys("Software Tester");
		driver.findElementByName("birthDate").sendKeys("08/14/21");
		//driver.findElementByName("departmentName").sendKeys("Bouvanesswary");
		//driver.findElementByName("companyName").sendKeys("Bouvanesswary");
		//driver.findElementByName("companyName").sendKeys("Bouvanesswary");
		
		
		WebElement drop1=driver.findElementByName("dataSourceId");
		Select source=new Select(drop1);
		source.selectByVisibleText("Cold Call");
		
		WebElement drop2=driver.findElementByName("marketingCampaignId");
		Select marketing=new Select(drop2);
		marketing.selectByVisibleText("Affiliate Sites");
		
		WebElement drop3=driver.findElementByName("industryEnumId");
		Select Indus1=new Select(drop3);
		Indus1.selectByVisibleText("Aerospace");
		
		WebElement drop4=driver.findElementByName("currencyUomId");
		Select currency=new Select(drop4);
		currency.selectByValue("USD");
		
		WebElement drop5=driver.findElementByName("ownershipEnumId");
		Select Ownership=new Select(drop5);
		Ownership.selectByVisibleText("Partnership");
		
		WebElement drop6=driver.findElementByName("generalStateProvinceGeoId");
		Select province=new Select(drop6);
		province.selectByValue("AZ");
		
		WebElement drop7=driver.findElementByName("generalCountryGeoId");
		Select country=new Select(drop7);
		country.selectByValue("USA");
		
		int sizeIndus1 = Indus1.getOptions().size();
		System.out.println("Size of the Industry dropdown is " +sizeIndus1);
		
		
	}

}
