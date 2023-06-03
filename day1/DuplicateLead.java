package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kalai");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vani");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Example");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CompSci");
		driver.findElement(By.className("inputBox")).sendKeys("Description of yiur choice");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kalaimca297@gmail.com");
		WebElement source=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select source1=new Select(source);
		source1.selectByIndex(1);
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("The Title is :"+driver.getTitle());
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement dd=driver.findElement(By.id("createLeadForm_companyName"));
		dd.clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeafNew");
		WebElement ddd=driver.findElement(By.id("createLeadForm_firstName"));
		ddd.clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("KalaivaniSree");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("The Title is :"+driver.getTitle());
		}

}
