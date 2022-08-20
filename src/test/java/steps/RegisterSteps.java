package steps;

import cucumber.api.java.en.*;
import pages.RegisterPage;

public class RegisterSteps {

    RegisterPage registro = new RegisterPage();

    @Given("^estoy en la pagina de registro$")
    public void navigateToListPage() {

    }

    @When("^yo completo el formulario$")
    public void archTheList(String state) {
    }

    @And("^hago click en registrarme$")
    public void searchTheList(String state) {

    }

    @Then("^muestra que la cuenta fue creada$")
    public void theCityIsThere(String city) {

    }
}
