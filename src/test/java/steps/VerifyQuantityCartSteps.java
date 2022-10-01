package steps;

import org.junit.Assert;
import cucumber.api.java.en.*;
import pages.CartPage;
import pages.MainPage;
import pages.ProductDetails;

public class VerifyQuantityCartSteps {

    MainPage main = new MainPage();
    ProductDetails producto = new ProductDetails();
    CartPage cart = new CartPage();

    @Given("^el usuario elige un producto al azar$")
    public void navigateToRegisterPage() {
        main.navigateToAutomationExersice();
        main.clickViewProduct();
    }

    @When("^incrementa la cantidad$")
    public void searchProduct() {
        producto.writeQuantity("4");
    }

    @And("clickea el boton de addCart$")
    public void verifyAllProducts() {
        producto.clickAddCart();
    }

    @And("se dirige al Cart$")
    public void vrifyAllProducts() {
        producto.clickViewCart();
    }

    @Then("chequea que sea la cantidad que el eligio$")
    public void verifyAlProducts() {
        Assert.assertEquals("4", cart.valueLabelQuantity());

    }

}
