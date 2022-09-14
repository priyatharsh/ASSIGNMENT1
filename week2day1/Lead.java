package week2day1;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lead {

		public static void main(String[] args) {
			
		WebDriverManager.chromedriver().setup();
	     ChromeDriver driver =new ChromeDriver();	
	    
	     driver.get("http://leaftaps.com/opentaps/control/main");
         driver.manage().window().maximize();
         driver.findElement(By.id("username")).sendKeys("DemoCSR");
         driver.findElement(By.id("password")).sendKeys("crmsfa");
         driver.findElement(By.className("decorativeSubmit")).click();
         
         String text =driver.findElement(By.tagName("h2")).getText();
         System.out.println(text);
         
         String title=driver.getTitle();
         System.out.println(title);
         
         driver.findElement(By.linkText("CRM/SFA")).click();
         driver.findElement(By.linkText("Leads")).click();
         driver.findElement(By.linkText("Create Lead")).click();
         
         driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
         driver.findElement(By.id("createLeadForm_firstName")).sendKeys("priya");
         driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kumar");
         driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing Department");
         driver.findElement(By.id("createLeadForm_description")).sendKeys("Test leaf are to build both Manual and Automation Tester");
         driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("priyatharshinikumar3@gmail.com");
         
         driver.findElement(By.className("smallSubmit")).click();
         
        
        
         String title2=driver.getTitle();
         System.out.println(title2);
         
         
         
          
		}

		private static void clear() {
			// TODO Auto-generated method stub
			
		}
		

}
