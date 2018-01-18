package ua.PageObjects;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage {
	//xPath Section
	private final String xPathForRusultBlocks = "//div[@class=\"b-vacancies-search\"]/div[@class=\"b-one-vacancy \" or @class=\"b-one-vacancy b-one-vacancy--hot\"]";

	private WebDriver driver;

	public SearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}

	public int getNumberOfCorrectSearchResults() {
		int size=0;
		if(driver.findElements(By.className("b-empty-result")).isEmpty()) {
			size =  ((ArrayList<WebElement>) driver.findElements(By.xpath(xPathForRusultBlocks))).size();			
		}
		return size;
	}			
}
