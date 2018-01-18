package ua.TestTask;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import ua.PageObjects.MainPage;
import ua.PageObjects.SearchResultsPage;

public class BaseTestClass {

	WebDriver webDriver;
	MainPage mainPage;
	SearchResultsPage searchResultsPage;

	@DataProvider(name="professions")
	public Object[][] testData(){
		String[][] professions = new String[3][1];
		professions[0][0] = "¬рач";
		professions[1][0] = "учитель";
		professions[2][0] = "Ёнолог";	
		return professions;
	} 

	@BeforeClass (alwaysRun = true)
	public void initializeTest() {
		// for Chrome
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
		webDriver = new ChromeDriver();
		mainPage = new MainPage(webDriver);
		searchResultsPage = new SearchResultsPage(webDriver);
		webDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	} 

	@AfterClass (alwaysRun = true)
	public void freeResources() {
		webDriver.close();
	}

	@BeforeMethod (alwaysRun = true)
	public void goMainPage() {
		webDriver.get("https://rabota.nur.kz/");
		webDriver.manage().window().maximize();	
	}
}
