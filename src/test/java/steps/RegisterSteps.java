package steps;

import cucumber.api.java.en.*;
import pages.MainPage;
import pages.RegisterFormPage;
import pages.RegisterPage;

public class RegisterSteps {

    RegisterPage registro = new RegisterPage();
    MainPage main = new MainPage();
    RegisterFormPage registerForm = new RegisterFormPage();

    @Given("^el usuario esta en la pagina de registro$")
    public void navigateToListPage() {
        main.navigateToAutomationExersice();
        main.goToLoginPage();
    }

    @When("^completa el formulario$")
    public void completeForm() {
        registro.registerNewUser("name", "emaxitl@asfg");
        registerForm.completeTopForm("autitorojo123", 22, 10, 10);
    }

    /*
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
