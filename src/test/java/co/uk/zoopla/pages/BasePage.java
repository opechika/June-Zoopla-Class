package co.uk.zoopla.pages;

import co.uk.zoopla.commons.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends DriverManager
{
    public String BASE_URL = "https://www.zoopla.co.uk/";
    public Select select;


    public void launchURL()
    {
        driver.navigate().to(BASE_URL);
    }

    public void selectByText(WebElement element, String text)
    {
        select = new Select(element);
        select.selectByVisibleText(text);
        Assert.assertTrue(select.getFirstSelectedOption().getText().equals(text));
        //System.out.println(select.getFirstSelectedOption().getText());
    }

    public void selectByValue(WebElement element, String value)
    {
        select = new Select(element);
        select.selectByValue(value);
    }

    public void selectByIndex(WebElement element, int index)
    {
        select = new Select(element);
        select.selectByIndex(index);
    }
}
