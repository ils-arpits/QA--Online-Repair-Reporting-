package onlineTenant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.Assert;
import org.testng.annotations.Test;

public class onlineTenant {

	    public WebDriver driver;
	    public String baseUrl = "http://repair.smarttenant.co.uk/page/agent10";

		
	  @Test
	  
	  public void a_test() throws InterruptedException 
	  
	  {
		  System.setProperty("webdriver.chrome.driver","C:/Users/arpit/Downloads/chromedriver_win32/chromedriver.exe");
			driver =  new ChromeDriver();  
		    System.out.println("launching Chrome browser"); 
		      driver.get(baseUrl);
		      //String expectedTitle = "Online Reporting Tool";
		      //String actualTitle = driver.getTitle();
		      //Assert.assertEquals(actualTitle, expectedTitle);
		      //driver.close();
		      Thread.sleep(2000);
		  }

@Test
	  
	  public void b_test() throws InterruptedException 
	  
	  {
		 driver.findElement(By.xpath(".//*[@id='2']")).click();
		 Thread.sleep(2000);
		  }


@Test

public void c_test() throws InterruptedException 

{
	 driver.findElement(By.xpath(".//*[@id='43']")).click();
	 Thread.sleep(2000);
	  }


@Test

public void d_test() throws InterruptedException 

{
	 driver.findElement(By.xpath(".//*[@id='47']")).click();
	 Thread.sleep(2000);
	  }


@Test

public void e_test() throws InterruptedException 

{
	 driver.findElement(By.id("issuedescription")).sendKeys("I am doing automation ");
	 driver.findElement(By.name("gostep2")).click();
	 Thread.sleep(2000);
	  }

@Test

public void f_test() throws InterruptedException 

{
	 
	 driver.findElement(By.name("gostep3")).click();
	 Thread.sleep(2000);
	  }


@Test

public void g_test() throws InterruptedException 

{
	 driver.findElement(By.name("postcode")).sendKeys("EC1A 1AA");
	 Thread.sleep(2000);
	 driver.findElement(By.id("address")).sendKeys("Indore");
	
	 Thread.sleep(2000);
	 driver.findElement(By.name("gostep4")).click();
	 
	  }

@Test

public void h_test() throws InterruptedException 

{
	 driver.findElement(By.id("fullname")).sendKeys("Arpit ");
	 Thread.sleep(2000);
	 driver.findElement(By.id("email")).sendKeys("tena@mailinator.com");
	
	 Thread.sleep(2000);
	 driver.findElement(By.id("contactnumber")).sendKeys("1234567890");
	 Thread.sleep(2000);
	 driver.findElement(By.name("gostep5")).click();
	 Thread.sleep(2000);

	}
@Test

public void i_test() throws InterruptedException 

{
	 driver.findElement(By.id("issueadditionalnotes")).sendKeys("I am testing it through automation ");
	 Thread.sleep(2000);
	 driver.findElement(By.id("confirmterm")).click();
	
	 Thread.sleep(2000);
	 
	 driver.findElement(By.id("confirmterm")).click();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
  	   Thread.sleep(2000);

}
}

