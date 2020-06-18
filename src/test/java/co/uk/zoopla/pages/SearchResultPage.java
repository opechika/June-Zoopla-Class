package co.uk.zoopla.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class SearchResultPage extends BasePage {

    public SearchResultPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName = "h1")
    private WebElement pageTitle;
    @FindBy(css = ".listing-results-price.text-price")
    private List<WebElement> results;

    public void isSearchResultPageDisplayed(String location)
    {
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains(location));
    }

    public void doesPageTitleContains(String location)
    {
        String title = pageTitle.getText();
        Assert.assertTrue("The page title is " + title + " and the location is " + location,
                title.contains(location));
    }

    public ProductDetailPage clickOnTheFirstResult()
    {
        results.get(0).click();
        return new ProductDetailPage(driver);
    }

    public ProductDetailPage clickOnAnyResult()
    {
        int noOfElement = results.size();
        Random random = new Random();
        int ranNumber = random.nextInt(noOfElement - 1);

        results.get(ranNumber).click();
        return new ProductDetailPage(driver);
    }
}
