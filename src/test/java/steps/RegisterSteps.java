package steps;

import cucumber.api.java.en.*;
import pages.MainPage;
import pages.RegisterPage;

public class RegisterSteps {

    RegisterPage registro = new RegisterPage();
    MainPage main = new MainPage();

    @Given("^el usuario esta en la pagina de registro$")
    public void navigateToListPage() {
        main.navigateToAutomationExersice();
        main.goToLoginPage();
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
