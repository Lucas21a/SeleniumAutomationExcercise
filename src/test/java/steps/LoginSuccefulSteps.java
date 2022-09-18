package steps;

import org.junit.Assert;
import cucumber.api.java.en.*;
import pages.MainPage;
import pages.RegisterPage;

public class LoginSuccefulSteps {

    RegisterPage login = new RegisterPage();
    MainPage main = new MainPage();

    @Given("^el usuario esta en la pagina de login$")
    public void navigateToLoginPage() {
        main.navigateToAutomationExersice();
        main.goToLoginPage();
    }

    @When("^completa con sus datos$")
    public void completeForm() {
        // Verificar si 'Login to your account' es visible:
        Assert.assertTrue("El label no se muestra", login.statusLoginYourAccountLabel());

        login.loginAccount("lucas@lucas", "lucas");
    }

    @And("^hace click en login$")
    public void ClickRegister() {
        login.clickLogin();
    }

    @And("^vizualiza que esta logueado$")
    public void isLogged() {
        // Verificar que 'Logged in as..!' es visible
        Assert.assertTrue("El elemento 'Logged in as' no es mostrado", main.statusLoginLabel());
    }

    @Then("^elimina su cuenta logueada$")
    public void ClickDeleteLoggedAcoount() {
        main.deleteAccount();
    }

}
