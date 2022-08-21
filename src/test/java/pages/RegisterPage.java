package pages;

public class RegisterPage extends BasePage {

    // xPath de boton de login en header
    private String buttonLogin = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]";
    // xPath de label de nombre en el sector de Registro
    private String nameLabel = "//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]";
    // xPath de label de email en el sector de Registro
    private String emailLabel = "//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]";
    // xPath boton de SingUp en el sector de Registro
    private String singUp = "//button[contains(text(),'Signup')]";

    public RegisterPage() {
        super(driver);
    }

    public void navigateToAutomationExersice() {
        navigateTo("https://www.automationexercise.com/");
    }

    public void goToLoginPage() {
        clickElement(buttonLogin);
    }

    public void writeName(String name) {
        write(nameLabel, name);
    }

    public void writeEmail(String email) {
        write(emailLabel, email);
    }

    public void clickSingUp() {
        clickElement(singUp);
    }

}