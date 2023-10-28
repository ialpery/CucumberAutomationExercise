package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CartPage {

    public CartPage(){
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy (xpath = "//*[text()=\"Subscription\"]")
    public WebElement subscriptionText ;

    @FindBy (id = "susbscribe_email")
    public WebElement subscribeEmail ;

    @FindBy (id = "subscribe")
    public WebElement subscribeButton ;

    @FindBy (id = "success-subscribe")
    public WebElement successSubscribeMessage ;

    @FindBy(id = "product-1")
    public WebElement firstProduct;

    @FindBy(id = "product-2")
    public WebElement secondProduct;

    @FindBy(xpath = "(//td[@class=\"cart_price\"])[1]")
    public WebElement firstProductPrice;

    @FindBy(xpath = "(//td[@class=\"cart_price\"])[2]")
    public WebElement secondProductPrice;

    @FindBy(xpath = "(//td[@class=\"cart_quantity\"])[1]")
    public WebElement firstProductQuantity;

    @FindBy(xpath = "(//td[@class=\"cart_quantity\"])[2]")
    public WebElement secondProductQuantity;

    @FindBy(xpath = "(//td[@class=\"cart_total\"])[1]")
    public WebElement firstProductTotalPrice;

    @FindBy(xpath = "(//td[@class=\"cart_total\"])[2]")
    public WebElement secondProductTotalPrice;




}
