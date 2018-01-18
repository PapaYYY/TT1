package ua.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
	//xPath Section
	private final String xPathForSearchField = "//*[@id=\"query_top_search_form\"]";
	private final String xPathForSearchButton = "//*[@id=\"search_form_content_form\"]/descendant::button";
	private final String xPathForCityField = "//*[@placeholder=\"Все города\"]";

	private WebDriver driver;

	public MainPage(WebDriver driver) {
		this.driver = driver;	
	}

	public void performSearch(String searchText) {		
		driver.findElement(By.xpath(xPathForSearchField)).sendKeys(searchText);				
	}

	public void setCity(String city) {
		driver.findElement(By.xpath(xPathForCityField)).sendKeys(city);		
	}

	public void submitSearch() {
		driver.findElement(By.xpath(xPathForSearchButton)).click();	
	}
}
