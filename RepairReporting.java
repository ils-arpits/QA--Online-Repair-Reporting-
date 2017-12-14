package repair;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class RepairReporting {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/arpit/Downloads/chromedriver_win32/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://repair.smarttenant.co.uk/");
		//driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("Admin123#");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-root/admin-login/div/div[2]/div/form/div[3]/div/button")).click();
		Thread.sleep(2000);
		
		
		
	    driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.linkText("Profile")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("phone")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("phone")).sendKeys("9425976504");
		Thread.sleep(1000);
		driver.findElement(By.id("alternatephone")).clear();
		driver.findElement(By.id("alternatephone")).sendKeys("9098063340");
		Thread.sleep(1000);
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("London St John Wood Rd, London NW8 8QN UK");
		Thread.sleep(1000);
		driver.findElement(By.id("postcode")).clear();
		driver.findElement(By.id("postcode")).sendKeys("EC1A 1AA");
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.id("changepassword")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Admin123#");
		Thread.sleep(2000);
		
		
		
		
		
		
		JavascriptExecutor jsee = (JavascriptExecutor)driver;
		jsee.executeScript("window.scrollBy(0,250)", "");
		
		driver.findElement(By.id("checkbox")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
     	Thread.sleep(5000);
     	
		JavascriptExecutor up = (JavascriptExecutor)driver;
		up.executeScript("window.scrollBy(500,0)", "");
		
		driver.findElement(By.xpath(".//*[@id='wrapper']/top-bar/nav/div/a")).click();
		
		driver.findElement(By.xpath(".//*[@id='wrapper']/top-bar/nav/side-bar/div/ul/li[2]/a")).click();

		driver.findElement(By.xpath(".//*[@id='customer']/li/a")).click();
		
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[7]/a")).click();
		//driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[5]/td[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("phone")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("phone")).sendKeys("9425976504");
		Thread.sleep(2000);
		driver.findElement(By.name("alternatephone")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("alternatephone")).sendKeys("9425976504");
		Thread.sleep(1000);
		driver.findElement(By.id("address")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("address")).sendKeys("Used Mailinator for here");
		Thread.sleep(1000);
		JavascriptExecutor dwn = (JavascriptExecutor)driver;
		dwn.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
     	Thread.sleep(3000);
     	
		JavascriptExecutor upp = (JavascriptExecutor)driver;
		upp.executeScript("window.scrollBy(500,0)", "");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='wrapper']/top-bar/nav/div/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='wrapper']/top-bar/nav/side-bar/div/ul/li[3]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='agent']/li[1]/a")).click();
		driver.findElement(By.id("agentname")).sendKeys("e");// need to change everytime
		Thread.sleep(2000);
		driver.findElement(By.id("agentusername")).sendKeys("e");// need to change everytime
		Thread.sleep(2000);
		driver.findElement(By.id("agentemail")).sendKeys("e@mailinator.com");// need to change everytime
		Thread.sleep(2000);
		driver.findElement(By.id("agentphone")).sendKeys("236504236504");
		Thread.sleep(2000);
		driver.findElement(By.id("address")).sendKeys("automation testing agent role");
		Thread.sleep(2000);
		driver.findElement(By.id("postcode")).sendKeys("EC1A 1AA");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Agent123#");// 
		Thread.sleep(2000);
		driver.findElement(By.id("confirmpassword")).sendKeys("Agent123#");// 
		Thread.sleep(2000);
		JavascriptExecutor ups = (JavascriptExecutor)driver;
		ups.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.id("submit")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
     	Thread.sleep(5000);
     	
		
		Thread.sleep(5000);
		
        driver.findElement(By.xpath(".//*[@id='wrapper']/top-bar/nav/side-bar/div/ul/li[4]/a")).click();
		
		driver.findElement(By.xpath(".//*[@id='setup']/li[1]/a")).click();
		
	    Thread.sleep(2000); 
	    
	    
	    Select drop4 = new Select(driver.findElement(By.xpath(".//*[@id='selectedagent']")));
		drop4.selectByIndex(1);
     	Select drop = new Select(driver.findElement(By.id("preferredlanguage3")));
		drop.selectByIndex(0);
		Thread.sleep(2000); 
     	Select drop1 = new Select(driver.findElement(By.id("preferredlanguage2")));
		drop1.selectByIndex(1);
		Thread.sleep(2000); 
     	//Select drop3 = new Select(driver.findElement(By.id("preferredlanguage3")));
		//drop3.selectByIndex(2);
		Thread.sleep(2000); 
     	Select opt = new Select(driver.findElement(By.id("emailnotification")));
		opt.selectByIndex(1);
		Thread.sleep(1000);
		JavascriptExecutor dwn2 = (JavascriptExecutor)driver;
		dwn2.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(1000);
		JavascriptExecutor dwn1 = (JavascriptExecutor)driver;
		dwn1.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
     	Thread.sleep(3000);
     	driver.findElement(By.xpath(".//*[@id='wrapper']/top-bar/nav/div/a")).click();
     	
     	
     	
		
		}

}
