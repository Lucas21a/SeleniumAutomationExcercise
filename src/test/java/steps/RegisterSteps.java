package steps;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

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

        // Verificar que 'New User Signup!' es visible
        Assert.assertTrue("El elemento se muestra", registro.statusNewUserSingUp());

        registro.registerNewUser("matias", "asmnbvdg@gmcl.com");

        // Verificar que 'ENTER ACCOUNT INFORMATION' es visible
        Assert.assertTrue("El elemento 'ENTER ACCOUNT INFORMATION' no es mostrado",
                registerForm.statusEnterAccountInfomation());

        registerForm.completeTopForm("autitorojo123", 22, 10, 10);
        registerForm.completeBottomForm("Matias", "Bouchet", "Google", "La Pampa 362", "-", "California", "Los Angeles",
                "1234", "23517246");

    }

    @And("^hace click en registrarme$")
    public void ClickRegister() {
        registerForm.clickCreateAccount();
        // Verificar que 'Account Created!' es visible
        Assert.assertTrue("El elemento 'ACCOUNT CREATED!' no es mostrado", registerForm.statusAccountCreated());
        registerForm.clickContinue();
    }

    @Then("^elimina la cuenta$")
    public void ClickDelete() {
        // Verificar que 'Logged in as 'user'' es visible
        assertTrue("Logged in as 'user' no es visible", main.statusLoginLabel());
        main.deleteAccount();
    }

}
