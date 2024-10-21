package com.digisoft.actitime.SeleniumAutomation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TasksPage {
	WebDriver driver = null;

	@Given("user is launch the browser")
	public void user_is_launch_the_browser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@When("user enter the webpage current url")
	public void user_enter_the_webpage_current_url() throws Exception {
		driver.get("\"C:\\Program Files (x86)\\actiTIME\"");
		Thread.sleep(2000);
	}

	@When("user is enter username and password")
	public void user_is_enter_username_and_password() {

	}

	@When("click on login button")
	public void click_on_login_button() {

	}

	@Then("user should be navigate to home page")
	public void user_should_be_navigate_to_home_page() {

	}

	@When("user click on search bar and enter e-mail check")
	public void user_click_on_search_bar_and_enter_e_mail_check() {

	}

	@When("user is click on e-mail check open pop-up page")
	public void user_is_click_on_e_mail_check_open_pop_up_page() {
	}

	@When("user is click on cancel pop-up page")
	public void user_is_click_on_cancel_pop_up_page() {
	}

	@When("user click on Add recent task")
	public void user_click_on_add_recent_task() {
	}

	@Then("user will be display the dropdown of add recent task")
	public void user_will_be_display_the_dropdown_of_add_recent_task() {
	}

	@When("user click on task button")
	public void user_click_on_task_button() {
	}

	@When("user click on customer module")
	public void user_click_on_customer_module() {
	}

	@When("user is click on new button")
	public void user_is_click_on_new_button() {
	}

	@When("user is click on new project module")
	public void user_is_click_on_new_project_module() {
	}

	@When("user click on search bar and enter the value")
	public void user_click_on_search_bar_and_enter_the_value() {
	}

	@When("user click on status button")
	public void user_click_on_status_button() {
	}

	@Then("browser is closed")
	public void browser_is_closed() {
	}

}
