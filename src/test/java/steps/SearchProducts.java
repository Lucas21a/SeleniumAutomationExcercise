package steps;

import org.junit.Assert;
import cucumber.api.java.en.*;
import pages.MainPage;
import pages.ProductsPage;

public class SearchProducts {

    MainPage main = new MainPage();
    ProductsPage products = new ProductsPage();

    @Given("^el usuario se dirige a la pestaña productos$")
    public void navigateToRegisterPage() {
        main.navigateToAutomationExersice();
        main.clickProducts();
    }

    @When("^busca un producto deseado$")
    public void searchProduct() {
        // Verifica si ALL PRODUCTS es visible
        Assert.assertTrue("All products no es visible", products.statusAllProductsLabel());

        products.writeSearchProducts("Top");
        products.clickSearchProduct();

    }

    @Then("^visualiza el resultado de la busqueda$")
    public void verifyAllProducts() {
        // Verifica si SEARCHED PRODUCTS es visible
        Assert.assertTrue("SEARCHED PRODUCTS no es visible", products.statusSearchedProducts());
    }

}
