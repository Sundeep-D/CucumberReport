package CaseStudy06.CaseStudy06;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class casestudy2 {

	public static WebDriver driver;
	
	@Given("Launch the Webbrowser and load TestMe Url")
	public void launch_the_Webbrowser_and_load_TestMe_Url() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Desktop\\S U N D E E P\\SOFTWARES\\sellinium\\chromedriver_win32\\chromedriver.exe");
	  		  driver=new ChromeDriver();
               driver.get("http://192.168.40.4:8083/TestMeApp1");
		  	  
	   
	}

	@Then("Click on SignIn")
	public void click_on_SignIn() {
	   
		driver.findElement(By.xpath(".//a[contains(text(),\"SignIn\")]")).click();
	}

	@Then("Enter the data")
	public void enter_the_data(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> list=dataTable.asMaps(String.class,String.class);
		
		driver.findElement(By.name("userName")).sendKeys(list.get(0).get("username"));
		driver.findElement(By.name("password")).sendKeys(list.get(0).get("Password"));
	   
	}

	@Then("Click on Login button")
	public void click_on_Login_button() {
		
		driver.findElement(By.name("Login")).click();
	    
	}

}
