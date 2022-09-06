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
        registro.registerNewUser("matias", "mati@gmail.com");
        registerForm.completeTopForm("autitorojo123", 22, 10, 10);
        registerForm.completeBottomForm("Matias", "Bouchet", "Google", "La Pampa 362", "California", "Los Angeles",
                "1234", "2351246");
    }

    @And("^hace click en registrarme$")
    public void ClickRegister(String state) {
        registerForm.clickCreateAccount();
        registerForm.clickContinue();
    }

    @Then("^elimina la cuenta$")
    public void ClickDelete(String city) {
        main.deleteAccount();
    }

}
