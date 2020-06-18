package co.uk.zoopla.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "search-input-location")
    private WebElement searchField;
    @FindBy(css = ".ui-button-primary.ui-cookie-accept-all-medium-large")
    private WebElement acceptCookieButton;
    @FindBy(name = "price_min")
    private WebElement minPrice;
    @FindBy(name = "price_max")
    private WebElement maxPrice;
    @FindBy(id = "property_type")
    private WebElement propertyType;
    @FindBy(id = "beds_min")
    private WebElement noOfBeds;
    @FindBy(id = "search-submit")
    private WebElement submitButton;
//    @FindBy(css = "[href='/to-rent/']")
//    private WebElement forRentTab;
    @FindBy(css = "#search-tabs-to-rent")
    private WebElement forRentTab;
    @FindBy(id = "rent_price_min_per_month")
    private WebElement rentalMinPrice;
    @FindBy(id = "rent_price_max_per_month")
    private WebElement rentalMaxPrice;


    public void enterLocationValue(String location)
    {
        searchField.sendKeys(location);
        searchField.click();
    }

    public void clickOnCookieButton()
    {
        acceptCookieButton.click();
    }

    public void selectMinimumPrice(String minimumPrice)
    {
        selectByText(minPrice, minimumPrice);
    }

    public void selectMaximumPrice(String maximumPrice)
    {
        selectByText(maxPrice, maximumPrice);
    }

    public void selectPropertyType(String property)
    {
        selectByText(propertyType, property);
    }

    public void selectNumberOfBeds(String beds)
    {
        selectByText(noOfBeds, beds);
    }

    public SearchResultPage clickonSubmitButton()
    {
        submitButton.click();
        return new SearchResultPage(driver);
    }

    public ErrorPage clickonSubmitButtonForError()
    {
        submitButton.click();
        return new ErrorPage(driver);
    }

    public void moveToRent()
    {
        forRentTab.click();
    }

    public void selectRentalMinPrice(String rentMinPrice)
    {
        selectByText(rentalMinPrice, rentMinPrice);
    }

    public void selectRentalMaxPrice(String rentMaxPrice)
    {
        selectByText(rentalMaxPrice, rentMaxPrice);
    }


}
