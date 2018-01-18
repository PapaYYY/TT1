package ua.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {
	//xPath section
	private final String xPathOfTheResultsSection = "//div[@class=\"b-vacancies-search\"]";

	private Wait<WebDriver> wait;
	private WebDriver webDriver;

	public Helper(WebDriver webDriver) {
		this.webDriver=webDriver;
	}

	public void checkThatResultsPageIsLoaded() {
		wait = new WebDriverWait(webDriver, 5, 1000);
		wait.until(ExpectedConditions.visibilityOf(webDriver.findElement(By.xpath(xPathOfTheResultsSection))));
	}
}
