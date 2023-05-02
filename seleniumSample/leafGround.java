package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class leafGround {
	public static void main(String[] args) {
	   ChromeDriver driver=new ChromeDriver();
	   driver.get("https://www.leafground.com/input.xhtml");
	   //Maximize the browser
	   driver.manage().window().maximize();
	   driver.findElement(By.id("j_idt88:name")).sendKeys("Nandhini");
	   
	   
	   
    
	   
}   

}