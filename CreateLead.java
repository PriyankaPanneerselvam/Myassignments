package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get ("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TESTLEAF");	
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Priyanka");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Panneerselvam");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("testleaf@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
	     
	     
	     
	     
			
		
		
	}

}
