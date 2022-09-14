package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     ChromeDriver driver = new ChromeDriver();
     
     driver.get("http://leaftaps.com/opentaps/control/main");
     driver.findElement(By.id("username")).sendKeys("DemoCSR");
     driver.findElement(By.id("password")).sendKeys("crmsfa");
     driver.manage().window().maximize();
     driver.findElement(By.className("decorativeSubmit")).click();
     
     String text = driver.findElement(By.tagName("h2")).getText();
     System.out.println(text);
     
     driver.findElement(By.linkText("CRM/SFA")).click();
     driver.findElement(By.linkText("Leads")).click();
     driver.findElement(By.linkText("Create Lead")).click();     
     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TESTLEAF");
     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("PRIYATHARSHINI");
     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("KUMAR");
     driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QUALITY ANALYST");
     driver.findElement(By.id("createLeadForm_description")).sendKeys("QUALITY ANALYST ROLE IS TO WRITE TEST SCRIPT" );
     driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("priyakumar@gmail.com");
     
     driver.findElement(By.className("smallSubmit")).click();
     
     String title2=driver.getTitle();
     System.out.println(title2);
     
     driver.findElement(By.linkText("Duplicate Lead")).click();
     
     driver.findElement(By.id("createLeadForm_companyName")).clear();
     driver.findElement(By.id("createLeadForm_firstName")).clear();
     driver.findElement(By.id("createLeadForm_lastName")).clear();
     driver.findElement(By.id("createLeadForm_departmentName")).clear();
     driver.findElement(By.id("createLeadForm_description")).clear();
     driver.findElement(By.id("createLeadForm_primaryEmail")).clear();
    
     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SAI");
     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("AKAN");
     driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("HR Department");
     driver.findElement(By.id("createLeadForm_description")).sendKeys("HR RECRUITMENT TEAM");
     driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("saiakan@gmail.com");
     
     driver.findElement(By.className("smallSubmit")).click();
     
     String title3=driver.getTitle();
     System.out.println(title3);
     
     
     
     
     
     
     
     
     
	}

}
