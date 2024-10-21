package com.digisoft.actitime.SeleniumAutomation.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtils extends GlobalVariables {
	/***
	 * @author Sharath_TP
	 * @param type - pass 0 or 1 argument, and the 1 argument is either
	 *             ff,chrome,edge only
	 * @return
	 */
	public WebDriver getDriver(String... type) {
		System.out.println("Creating a driver...");
		if (type.length == 0) {
			System.out.println("Since no option is given, creating chrome by default");
			driver = new ChromeDriver();
		} else {
			switch (type[0]) {
			case "ff":
				driver = new FirefoxDriver();
				break;

			case "chrome":
				driver = new ChromeDriver();
				break;

			case "edge":
				driver = new EdgeDriver();
				break;

			default:
				System.out.println("Please check the driver type");
				break;
			}
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		System.out.println("Driver object is created successfully!!!");
		return driver;
	}

	/***
	 * Retrieves a WebElement based on the provided type and value
	 * 
	 * @param type  - locator type (e.g., "id", "name", "xpath", etc.)
	 * @param value - the locator value
	 * @return WebElement found based on the locator
	 */

	public WebElement getElement(String type, String value) {
		switch (type.toLowerCase()) {
		case "id":
			return driver.findElement(By.id(value));

		case "name":
			return driver.findElement(By.name(value));

		case "xpath":
			return driver.findElement(By.xpath(value));

		case "css":
			return driver.findElement(By.cssSelector(value));

		case "linktext":
			return driver.findElement(By.linkText(value));

		case "partiallinktext":
			return driver.findElement(By.partialLinkText(value));

		case "classname":
			return driver.findElement(By.className(value));

		case "tagname":
			return driver.findElement(By.tagName(value));

		default:
			System.out.println("Invalid locator type provided");
			return null;
		}

	}

	// void --- type(String type, String value, String text)

	public void type(String type, String value, String text) {
		// WebElement element = getElement(type, value);
		WebElement element = getElement("id", "username");
		element.clear();
		// element.sendKeys(text);
		element.sendKeys("admin");

		WebElement e2 = getElement("name", "pwd");
		e2.clear();
		e2.sendKeys("manager");
	}

	// void --- click(String type, String value)

	public void click(String type, String value) {
		// WebElement element = getElement(type, value);
		WebElement e1 = getElement("xpath", "//div[@id='loginButton']");
		e1.click();
	}

	// String --- getElementText(String type, String value)

	public String getElementText(String type, String value) {
		// WebElement element = getElement(type, value);
		WebElement login = getElement("xpath", "//div[@id='loginButton']");
		String s = getElementText("xpath", "//div[@id='loginButton']");
		System.out.println("Login Button Text: " + login);
		return login.getText();
	}

	// String --- getElementAttribute(String type, String value, String attribute)

	
	public String getElementAttribute(String type, String value, String attribute) {
		// WebElement element = getElement(type, value);
		WebElement e3 = getElement("id", "username");
		WebElement e4 = getElement("name", "pwd");
		String s1 = getElementAttribute("id", "username", "placeholder");
		String s2 = getElementAttribute("name", "pwd", "placeholder");
		System.out.println("Username Field Placeholder: " + s1);
		System.out.println("Password Field Placeholder: " + s2);
		return e3.getAttribute(attribute);
	}

}
