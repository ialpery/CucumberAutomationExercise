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

}
