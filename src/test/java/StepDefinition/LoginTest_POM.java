package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class LoginTest_POM {
	WebDriver driver; 
	LoginPage loginObj;  

	
	@Given("user open chrome browser")
	public void user_open_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		loginObj = new LoginPage(driver);
	}

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		driver.get("https://example.testproject.io/web/");
	}

	@When("user enters a valid (.*) and (.*)$")
	public void user_enters_a_valid_username_and_password(String username, String password) {
		loginObj.enterUsername(username);
		loginObj.enterPassword(password);
	}

	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
		loginObj.clickLogin();
	}

	@Then("user is able to login and navigates to homepage")
	public void user_is_able_to_login_and_navigates_to_homepage() {

	}
	
}
