package seleniumSample;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
      
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
	driver.manage().window().maximize();
	
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
Thread.sleep(5000);
driver.findElement(By.className("decorativeSubmit")).click();
	//click on CRM/SFA
//we can create partiallinkText
driver.findElement(By.partialLinkText("CRM")).click();
//click Leads

driver.findElement(By.linkText("Leads")).click();
//click on create Lead
driver.findElement(By.linkText("Create Lead")).click();
//Enter company Name 
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
//Enter First Name Field using id Locator
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nandhini");
//Enter Last Name field Using id Locator
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Elangovan");
//Enter Department Name 
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Tester");
//Enter Description
driver.findElement(By.id("createLeadForm_description")).sendKeys("Design and Execute the Test plan");
//Enter E-Mail ID
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nandhelo@gmail.com");
//click on create Button
driver.findElement(By.name("submitButton")).click();

//Get the title of Resulting Page 
String title =driver.getTitle();
System.out.println("title"); 

driver.findElement(By.linkText("Duplicate Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).clear();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("software Solution");
driver.findElement(By.id("createLeadForm_firstName")).clear();
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("varunram");
driver.findElement(By.name("submitButton")).click();

System.out.println("title");
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

