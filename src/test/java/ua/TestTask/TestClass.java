package ua.TestTask;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends BaseTestClass {
	
	//Testing search in Astana
	@Test (groups = {"search_in_cities", "search"}, dataProvider="professions")
	public void checkingSearshForVacancyInAstanaTest(String prof) {
		mainPage.performSearch(prof);
		mainPage.setCity("Астана");
		mainPage.submitSearch();
		Assert.assertTrue(searchResultsPage.getNumberOfCorrectSearchResults()>10);
	}
	
	//Testing search in all cities
	@Test  (groups = {"search_overall", "search"}, dataProvider="professions")
	public void checkingSearchForVacancyInAllCitiesTest(String prof) {
		mainPage.performSearch(prof);
		mainPage.submitSearch();
		Assert.assertTrue(searchResultsPage.getNumberOfCorrectSearchResults()>10);
	}
	
}
