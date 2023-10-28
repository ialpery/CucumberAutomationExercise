package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductsPage {

    public ProductsPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "(//*[text()=\"Add to cart\"])[1]")
    public WebElement firstProductAddtoCartButton;

    @FindBy(xpath = "(//*[text()=\"Add to cart\"])[3]")
    public WebElement secondProductAddtoCartButton;

    @FindBy(xpath = "//*[text()=\"Continue Shopping\"]")
    public WebElement continueShoppingButton;

    @FindBy(xpath = "//*[text()=\"View Cart\"]")
    public WebElement viewCartButton;



}
