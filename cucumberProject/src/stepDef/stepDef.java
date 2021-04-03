package stepDef;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.loginPage;


public class stepDef {
	
	
	WebDriver driver; 
	loginPage lp; 
	
	@Given("^a$")
	public void a() throws Throwable {
	  
		System.out.println("This is a");
	}

	@When("^b$")
	public void b() throws Throwable {
	   
		System.out.println("This is b");
	}

	@When("^c$")
	public void c() throws Throwable {
	    
		System.out.println("This is c");
	}

	@Then("^d$")
	public void d() throws Throwable {
	    
		System.out.println("This is d");
	}
	
	@Then("^e$")
	public void e() throws Throwable {
		System.out.println("This is e");
	}

	// .... this is the web feature step  
	
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Agile1Tech\\Desktop\\Feb-2021-WS\\libraries\\chromedriver.exe");
		driver = new ChromeDriver();
		
		lp = new loginPage(driver);
		
		driver.get("https://www.saucedemo.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();
				
	     Thread.sleep(1000);
	    
	}
	
	
	@Before
	
	public void setup() {
		
		
	}
	
	@After
	
	public void teardown() {
		
		driver.quit();
		
	}

	@When("^user enters right username$")
	public void user_enters_right_username() throws Throwable {
	    
		//driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		
		lp.getUserId().sendKeys("standard_user");
		
	}

	@When("^user enters right password$")
	public void user_enters_right_password() throws Throwable {
	   
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		
		String actualUrl = driver.getCurrentUrl(); 
		
		Assert.assertEquals("https://www.saucedemo.com/inventory.html", actualUrl);
	}
	
	
	@When("^user clicks the login button$")
	public void user_clicks_the_login_button() throws Throwable {
	  
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	}

	
	
	// -----------------------------------------
	
	
	@When("^user enters wrong username$")
	public void user_enters_wrong_username() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("locked_out_user");
	}

	@When("^user enters worng password$")
	public void user_enters_worng_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	}

	@Then("^user should not be able to login$")
	public void user_should_not_be_able_to_login() throws Throwable {
		String actualUrl = driver.getCurrentUrl(); 
		
		Assert.assertEquals("https://www.saucedemo.com/", actualUrl);
	}

	
	
// login element test  
	
	@When("^user see the login text box$")
	public void user_see_the_login_text_box() throws Throwable {
	    
	}

	@Then("^user should be able to type user name$")
	public void user_should_be_able_to_type_user_name() throws Throwable {
	    
	}

	@When("^user see the password text box$")
	public void user_see_the_password_text_box() throws Throwable {
	   
	}

	@Then("^user should be able to type password$")
	public void user_should_be_able_to_type_password() throws Throwable {
	 
	}

	@When("^user see the login button$")
	public void user_see_the_login_button() throws Throwable {
	    
	}

	@Then("^user should be able to click on login$")
	public void user_should_be_able_to_click_on_login() throws Throwable {
	    
	}


	
	@Given("^user is on the home page$")
	public void user_is_on_the_home_page() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Agile1Tech\\Desktop\\Feb-2021-WS\\libraries\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();
				
	     Thread.sleep(1000);
	}
	
// -------------steps for data driven 
	
	
	@When("^user enters \"([^\"]*)\" in the userid text box$")
	public void user_enters_in_the_userid_text_box(String arg1) throws Throwable {
	    
		lp.getUserId().sendKeys(arg1);
	}

	@When("^user enters \"([^\"]*)\" in the password text box$")
	public void user_enters_in_the_password_text_box(String arg1) throws Throwable {
	    
		lp.getPassword().sendKeys(arg1);
	}

	@Then("^user should navigate to the expected \"([^\"]*)\"$")
	public void user_should_navigate_to_the_expected(String arg1) throws Throwable {
	  
       String actualUrl = driver.getCurrentUrl(); 
		
		Assert.assertEquals(arg1, actualUrl);
		
	}
	
	
	@Given("^user is on the yahoo sign up page$")
	public void user_is_on_the_yahoo_sign_up_page() throws Throwable {
	  
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Agile1Tech\\Desktop\\Feb-2021-WS\\libraries\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/account/create");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();
				
	     Thread.sleep(1000);
		
	}

	@When("^user enters firstname \"([^\"]*)\" for yahoo sign up page$")
	public void user_enters_firstname_for_yahoo_sign_up_page(String firstname) throws Throwable {
	    
		driver.findElement(By.xpath("//*[@id=\"usernamereg-firstName\"]")).sendKeys(firstname);
	}

	@When("^user enters lastname \"([^\"]*)\" for yahoo sign up page$")
	public void user_enters_lastname_for_yahoo_sign_up_page(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"usernamereg-lastName\"]")).sendKeys(arg1);
	   
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
