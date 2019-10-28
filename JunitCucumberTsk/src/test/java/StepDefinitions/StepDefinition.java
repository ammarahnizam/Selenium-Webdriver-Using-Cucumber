package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition {
	
	public static WebDriver driver;
	public static String baseURL= "https://acme-qa.everreal.co/app/public/apply/d986458c-4423-4441-be64-77774109864b/applications/step2";
	
	@Given("^Open Browser$")
	public void open_Browser() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ammarah_nizam/eclipse-workspace/qahand/CucumAsn/JunitCucumberTsk/Webdrivers/chromedriver 2");
		driver =new ChromeDriver(); 
	   
	}

	@When("^Enter the url \"([^\"]*)\"$")
	public void enter_the_url(String arg1) throws Throwable {
	    driver.manage().window().maximize();
        driver.get(baseURL); 
        System.out.println("Rental Application Demo Page has been opened");
		
	   
	}
	
	
	
	

  @Then("^View Page Title$")
  public void view_Page_Title() throws Throwable 
    {
	   String PageTitle= driver.getTitle();
		Assert.assertEquals("Demo", PageTitle);
		System.out.println("PAGE TITLE is===>"   + PageTitle);	
        driver.quit();
     }
  
  
  @Then("^View URL$")
  public void view_URL() throws Throwable 
  {
		
        String PageURL= driver.getCurrentUrl();
		Assert.assertEquals(baseURL, PageURL);
		System.out.println("PAGE URL is===>"   + PageURL);
		driver.quit();
  }

  

@Then("^View tab$")
public void view_tab() throws Throwable {
   
	boolean b=	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div[1]/div/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/button[1]/span[1]/span/span/span")).isEnabled();

	if(b==true) {
     System.out.println("Element is highlighted");
	}
	
	else
	{
		System.out.println("Element is not highlighted");
	}
	
	driver.quit();

  
  
  

}




@Then("^View Error Validation Messages$")
public void view_Error_Validation_Messages() throws Throwable 

{

	
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div[1]/div/div/div/div[2]/div/div/div[2]/form/div[2]/button/span[1]/span")).click();

	String Valmsg1= driver.findElement(By.xpath("//*[@id=\"noOfAdultsMovingIn-error-text\"]/span")).getText();
	if(Valmsg1.equals("This field is required."))
	{
		System.out.println("The error validation message for 'No of Adults' field is===>"    +Valmsg1);
	}

	else
		
	{
		System.out.println("First Validation message is incorrect");
		
	}


	String Valmsg2= driver.findElement(By.xpath("//*[@id=\"noOfChildrenMovingIn-error-text\"]/span")).getText();

	if(Valmsg2.equals("This field is required."))
	{
		System.out.println("The error validation message for 'No of Children' field is===>"    +Valmsg2);
	}

	else
		
	{
		System.out.println("Second Validation message is incorrect");
		
	}




	String Valmsg3= driver.findElement(By.xpath("//*[@id=\"noOfPeopleOnContract-error-text\"]/span")).getText();
	if(Valmsg3.equals("This field is required."))
	{
		System.out.println("The error validation message for 'No of Adults' field is===>"    +Valmsg3);
	}

	else
		
	{
		System.out.println("Third Validation message is incorrect");
		
	}

	
	driver.quit();
}


@Then("^Check Logo$")
public void check_Logo() throws Throwable 

{
	WebElement elm= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[2]/a/span/div/img"));
    elm.click();
   String url = driver.getCurrentUrl();
	
	System.out.println("Captured URL is===>" +url);
	
	
	if (url.contains("everreal.co"))
		
	{
		System.out.println("Its a correct link");
		

	}

	
	else
		
	{
		System.out.println("Its an incorrect link");
	}
	
	driver.quit();
}
}











