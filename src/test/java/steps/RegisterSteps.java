package steps;

import cucumber.api.java.en.*;
import pages.RegisterPage;

public class RegisterSteps {

    RegisterPage registro = new RegisterPage();

    @Given("^el usuario esta en la pagina de registro$")
    public void navigateToListPage() {
        registro.navigateToAutomationExersice();
    }

    /*
     * @When("^completa el formulario$")
     * public void archTheList(String state) {
     * }
     * 
     * @And("^hace click en registrarme$")
     * public void searchTheList(String state) {
     * 
     * }
     * 
     * @Then("^muestra que la cuenta fue creada$")
     * public void theCityIsThere(String city) {
     * 
     * }
     */
}
