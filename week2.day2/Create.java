package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Create {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	     
	     driver.findElement(By.id("password")).sendKeys("crmsfa");
	     
	     driver.findElement(By.className("decorativeSubmit")).click();
	     
	     String title = driver.getTitle();
	     System.out.println(title);
	     
	     driver.findElement(By.linkText("CRM/SFA")).click();
	     
	     driver.findElement(By.linkText("Leads")).click();
	     
	     driver.findElement(By.linkText("Create Lead")).click();
	     
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priyanka");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Panneerselvam");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567890");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testleaf@gmail.com");
		
		driver.findElement(By.name("submitButton")).click();
		
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		System.out.println(text);
	     
	     
	   
	     
	     
		
		

	}

}
