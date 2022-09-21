package steps;

import org.junit.Assert;
import cucumber.api.java.en.*;
import pages.ContactUsPage;
import pages.MainPage;

public class ContactUsSteps {

    MainPage main = new MainPage();
    ContactUsPage contact = new ContactUsPage();

    @Given("^el usuario se dirige a la pestaña Contact Us$")
    public void navigateToLoginPage() {
        main.navigateToAutomationExersice();
        main.clickContactUs();
    }

    @When("^completa el formulario de contacto$")
    public void completeFormContact() {
        // Verificar si 'GET IN TOUCH' es visible
        Assert.assertTrue("'Get in Touch' no es visible", contact.statusGetInTouch());

        contact.completeForm("name", "email@email", "subject", "message");
        contact.uploadFileInput("C:\\Users\\Lucas Fredes Ibarra\\Desktop\\PRUEBA AUTOMATION.txt");
    }

    @And("^clickea el boton submit de contacto$")
    public void clickSubmit() {
        contact.clickSubmit();
        contact.aceptAlert();

        // Verificar si 'SUCCESS' es visible
        Assert.assertTrue("Success no es visible", contact.statusSuccessLabel());
    }

    @And("^regresa a MainPage desde contacto$")
    public void backMainPage() {
        contact.clickHomeButton();
        String actual = main.getCurrentUrl();
        // Veerificar si actualmente estamos en Main Page
        Assert.assertEquals("https://www.automationexercise.com/", actual);
    }

}
