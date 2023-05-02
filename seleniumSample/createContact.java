package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class createContact {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
	driver.manage().window().maximize();
	
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
Thread.sleep(5000);
driver.findElement(By.className("decorativeSubmit")).click();
	//click on CRM
driver.findElement(By.partialLinkText("CRM")).click();
//click on contact Tab
driver.findElement(By.linkText("Contacts")).click();
//click on create contact
driver.findElement(By.partialLinkText("Create Contact")).click();
//TypeFirst name 
driver.findElement(By.id("firstNameField")).sendKeys("Nandhini");
//TypeLastName
driver.findElement(By.id("lastNameField")).sendKeys("Elangovan");
//Click create contact Button
driver.findElement(By.name("submitButton")).click();
//print first Name and browser title
String firstName=driver.findElement(By.id("viewContact_fullName_sp")).getText();
System.out.println(firstName);
System.out.println(driver.getTitle());
driver.close();


	
}


	
	
	
	
	
	
}


/*/Assignment:3 Create Contacts
1.Open the browser
2.Load the URL:http://leaftaps.com/opentaps/control/login
3.Maximize the browser
4.Enter UserName
5.Enter Password
6.Click Login
7.Click CRM/SFA
8.Click Contacts Tab
9.Click Create Contact
10.Type First Name
11.Type Last Name
12.Click Create Contact Button
13.Print the first name and browser title 
14.Close the browser*/





















