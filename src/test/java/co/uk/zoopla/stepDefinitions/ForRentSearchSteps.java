package co.uk.zoopla.stepDefinitions;

import co.uk.zoopla.pages.BasePage;
import co.uk.zoopla.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class ForRentSearchSteps extends BasePage {

    HomePage homePage = PageFactory.initElements(driver, HomePage.class);

    @Given("I click on for rent tab")
    public void i_click_on_for_rent_tab() {
        homePage.moveToRent();
    }

    @When("I select {string} from rental Min price")
    public void i_select_from_Min_price(String miniPrice) {
        homePage.selectRentalMinPrice(miniPrice);
    }

    @When("I select {string} from rental Max price")
    public void i_select_from_Max_price(String maxPrice) {
        homePage.selectRentalMaxPrice(maxPrice);

    }
}
