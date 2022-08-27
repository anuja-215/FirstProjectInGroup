package testng;



import static org.testng.Assert.fail;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pom.AdminPageOpen;
import pom.HomePage;
import pom.LoginPage;
import pom.LogoutPage;



public class TestClass extends POJOclass{
	
	WebDriver driver;
	HomePage page2;
	LoginPage page1;
	LogoutPage page3;
	AdminPageOpen page4;
	
//	WebDriverWait wait; // globally declare wait
	@BeforeTest
	public void beforetest() //open browser
	{
		driver=OpenBrowser();
	}
	@BeforeClass
	public void beforeclass()
	{
    page1=new LoginPage(driver);
    page2=new HomePage(driver);
    page3=new LogoutPage(driver);
    page4=new AdminPageOpen(driver);
	 
	//wait=new WebDriverWait(driver,Duration.ofSeconds(10)); //add explicite wait
	}
	@BeforeMethod
	public void beforemethod()
	{
		page1.sendUsername();
		page1.sendPassword();
		page1.clickLoginbButton();
		
	}
	
	@Test(priority=1)
	public void ValidationOfHomePage() throws InterruptedException
	{ 
	 // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Admin']"))); 
	   page2.AdminPage();
	  // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Time']")));
	   page2.TimePage();
	   //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Recruitment']")));
	    page2.RecruitmentPage();
	   // page3.WelcomeButton();
	   // page3.LogoutButton();
	}
	@Test(priority=2)
	public void ValidationOfAdminPage()
	{
		page4.AdminPage();
		page4.InputInfo();
		//Assert.fail();
		
	}
	
	
@AfterMethod
	public void aftermethod() throws InterruptedException
	{
		page3.WelcomeButton();
		Thread.sleep(3000);
		
		page3.LogoutButton();
		Thread.sleep(3000);
	}
	@AfterClass
	public void afterclass()
	{
		page1=null;
		page2=null;
		page3=null;
		
	}
	@AfterTest
	public void aftertest()
	{
		driver.quit();
		driver=null;
		System.gc(); //garbage collector memery clear
	}
}
