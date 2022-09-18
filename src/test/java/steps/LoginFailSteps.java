package steps;

import org.junit.Assert;
import cucumber.api.java.en.*;
import pages.MainPage;
import pages.RegisterFormPage;
import pages.RegisterPage;

public class LoginFailSteps {

    RegisterPage login = new RegisterPage();
    MainPage main = new MainPage();
    RegisterFormPage registerForm = new RegisterFormPage();

    @Given("^el usuario esta en la pagina de login.$")
    public void navigateToLoginPage() {
        main.navigateToAutomationExersice();
        main.goToLoginPage();
    }

    @When("^completa con sus datos erroneos$")
    public void completeFormLogin() {
        Assert.assertTrue("El label no se muestra", login.statusLoginYourAccountLabel());
        login.loginAccount("lucas@lucas", "lucasf");
    }

    @And("^hace click en login.$")
    public void clickLogin() {
        login.clickLogin();
    }

    @And("^vizualiza un mensaje de error$")
    public void errorLogin() {
        // Verificar que 'Logged in as..!' es visible
        Assert.assertTrue("El elemento 'Logged in as' no es mostrado", login.statusEmailPassErrorLabel());
    }

}
