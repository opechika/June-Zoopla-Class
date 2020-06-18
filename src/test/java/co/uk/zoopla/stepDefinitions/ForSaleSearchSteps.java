package co.uk.zoopla.stepDefinitions;

import co.uk.zoopla.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class ForSaleSearchSteps extends BasePage {

    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    SearchResultPage searchResultPage = PageFactory.initElements(driver, SearchResultPage.class);
    ProductDetailPage productDetailPage = PageFactory.initElements(driver, ProductDetailPage.class);
    ErrorPage errorPage = PageFactory.initElements(driver, ErrorPage.class);

    @Given("I navigate to Zoopla homepage")
    public void i_navigate_to_Zoopla_homepage() {
        //launchURL();
        homePage.launchURL();
        homePage.clickOnCookieButton();
    }

    @When("I enter {string} into the search field")
    public void i_enter_into_the_search_field(String location) {
        homePage.enterLocationValue(location);
    }

    @When("I select {string} from Min price")
    public void i_select_from_Min_price(String miniPrice) {
        homePage.selectMinimumPrice(miniPrice);
    }

    @When("I select {string} from Max price")
    public void i_select_from_Max_price(String maxPrice) {
        homePage.selectMaximumPrice(maxPrice);

    }

    @When("I select {string} from Property type")
    public void i_select_from_Property_type(String property) {
        homePage.selectPropertyType(property);
    }

    @When("I select {string} from Bedrooms")
    public void i_select_from_Bedrooms(String beds) {
        homePage.selectNumberOfBeds(beds);
    }

    @When("I click on Search button")
    public void i_click_on_Search_button() {
        searchResultPage = homePage.clickonSubmitButton();
    }

    @When("I click on Search button to expect error")
    public void i_click_on_Search_button_to_expect_error() {
        errorPage = homePage.clickonSubmitButtonForError();
    }

    @Then("the search for {string} is displayed")
    public void the_search_for_is_displayed(String location) {
        searchResultPage.isSearchResultPageDisplayed(location);
        searchResultPage.doesPageTitleContains(location);
    }

    @Then("I click on one of the search result")
    public void i_click_on_one_of_the_search_result() {
      //  productDetailPage = searchResultPage.clickOnTheFirstResult();
        productDetailPage = searchResultPage.clickOnAnyResult();
    }

    @Then("an error page is displayed")
    public void an_error_page_is_displayed() {

    }

}

