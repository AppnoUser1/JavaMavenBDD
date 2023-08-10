package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class GoogleHomePageTest {

	private WebDriver driver = null; 

	@Given("I launch google chrome browser")
	public void i_launch_google_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
	}

	@When("I open Google homepage")
	public void i_open_google_homepage() {
		driver.get("https://www.google.com/");
	}

	@Then("Google homepage is displayed")
	public void google_homepage_is_displayed() {
		String expectedPageTitle = "Google";
		String actualPageTitle = driver.getTitle();
		Assert.assertEquals(expectedPageTitle, actualPageTitle);
	}

	@Then("Google Search button is present")
	public void google_search_button_is_present() {
		String expectedResult = "Google Search";
		String actualResult = driver.findElement(By.name("btnK")).getAttribute("aria-label");
		Assert.assertEquals(expectedResult, actualResult);

	}	
	
	@Then("I type an integer in search field")
	public void i_type_an_integer_in_search_field() {
		WebElement search_field = driver.findElement(By.id("APjFqb"));
		search_field.sendKeys("12345");
}


}
