package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.CartPage;
import pages.MainPage;
import pages.ProductsPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationExerciseStepDefinitions {

    MainPage mainPage = new MainPage();
    CartPage cartPage = new CartPage();
    ProductsPage productsPage = new ProductsPage();

    @Given("User navigated to url")
    public void user_navigated_to_url() {

        Driver.getDriver().get(ConfigReader.getProperty("aeUrl"));

    }
    @When("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {

        var homeColor = mainPage.homeButton.getCssValue("color");
        Assert.assertEquals(homeColor, "rgba(255, 165, 0, 1)");




    }
    @When("Click cart button")
    public void click_button() {
        mainPage.cartButton.click();
    }
    @When("Scroll down to footer")
    public void scroll_down_to_footer() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    @When("Verify text SUBSCRIPTION")
    public void verify_text() {
        String actualSubscriptionText = cartPage.subscriptionText.getText();
        String expectedSubscriptionText = "SUBSCRIPTION";

        Assert.assertEquals(actualSubscriptionText, expectedSubscriptionText);
    }
    @When("Enter email address in input and click arrow button")
    public void enter_email_address_in_input_and_click_arrow_button() {
        cartPage.subscribeEmail.sendKeys(ConfigReader.getProperty("email"));
        cartPage.subscribeButton.click();
    }
    @When("Verify success message You have been successfully subscribed! is visible")
    public void verify_success_message_is_visible() {

        String actualSuccessSubscribeMessage = cartPage.successSubscribeMessage.getText();
        String expectedSuccessSubscribeMessage = "You have been successfully subscribed!";
        Assert.assertEquals(actualSuccessSubscribeMessage, expectedSuccessSubscribeMessage);

    }
    @Then("The page will closed")
    public void the_page_will_closed() {
        Driver.closeDriver();
    }

    @And("Wait {int} seconds")
    public void waitSeconds(int waitSeconds) {

        try {
            Thread.sleep(waitSeconds*100);
        } catch (InterruptedException e) {

        }
    }

    @And("Click Products button")
    public void clickProductsButton() {
        mainPage.productsButton.click();
    }

    @And("Hover over first product and click Add to cart")
    public void hoverOverFirstProductAndClickAddToCart() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", productsPage.firstProductAddtoCartButton);

        productsPage.firstProductAddtoCartButton.click();
    }

    @And("Click Continue Shopping button")
    public void clickContinueShoppingButton() {
        productsPage.continueShoppingButton.click();
    }

    @And("Hover over second product and click  Add to cart")
    public void hoverOverSecondProductAndClickAddToCart() {
        productsPage.secondProductAddtoCartButton.click();
    }

    @And("Click View Cart button")
    public void clickViewCartButton() {
        productsPage.viewCartButton.click();
    }

    @And("Verify both products are added to Cart")
    public void verifyBothProductsAreAddedToCart() {
        Assert.assertTrue(cartPage.firstProduct.isDisplayed());
        Assert.assertTrue(cartPage.secondProduct.isDisplayed());
    }

    @And("Verify their prices, quantity and total price")
    public void verifyTheirPricesQuantityAndTotalPrice() {
        Assert.assertTrue(cartPage.firstProductPrice.isDisplayed());
        Assert.assertTrue(cartPage.secondProductPrice.isDisplayed());
        Assert.assertEquals(cartPage.firstProductQuantity.getText(), "1");
        Assert.assertEquals(cartPage.secondProductQuantity.getText(), "1");
        Assert.assertEquals(cartPage.firstProductTotalPrice, cartPage.firstProductPrice);
        Assert.assertEquals(cartPage.secondProductTotalPrice, cartPage.secondProductPrice);
    }
}
