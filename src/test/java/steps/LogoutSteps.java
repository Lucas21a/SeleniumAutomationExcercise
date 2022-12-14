package steps;

import org.junit.Assert;
import cucumber.api.java.en.*;
import pages.MainPage;
import pages.RegisterPage;

public class LogoutSteps {

    RegisterPage login = new RegisterPage();
    MainPage main = new MainPage();

    @Given("^el usuario navega a la pagina de login$")
    public void navigateToLoginPage() {
        main.navigateToAutomationExersice();
        main.goToLoginPage();
    }

    @When("^ingresa los datos de su cuenta$")
    public void completeForm() {
        // Verificar si 'Login to your account' es visible:
        Assert.assertTrue("El label no se muestra", login.statusLoginYourAccountLabel());
        login.loginAccount("lucas@lucas", "lucas");
    }

    @And("^clickea el boton de login$")
    public void ClickRegister() {
        login.clickLogin();
    }

    @Then("^desloguea la cuenta$")
    public void ClickLogout() {
        // Verificar que 'Logged in as..!' es visible
        Assert.assertTrue("El elemento 'Logged in as' no es mostrado", main.statusLoginLabel());

        main.clickLogout();
        // Verificar si la pagina actual es https://www.automationexercise.com/login
        Assert.assertEquals("https://www.automationexercise.com/login", login.urlLogin());
    }
}
