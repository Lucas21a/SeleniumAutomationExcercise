package pages;

public class RegisterPage extends BasePage {

    // xPath de input de nombre en el sector de Registro
    private String nameInput = "//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]";
    // xPath de input de email en el sector de Registro
    private String emailInput = "//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]";
    // xPath boton de SingUp en el sector de Registro
    private String singUp = "//button[contains(text(),'Signup')]";
    // XPath de label
    String labelRegister = "//h2[contains(text(),'New User Signup!')]";

    public RegisterPage() {
        super(driver);
    }

    // Rellenar campo Name en "New User SingUp"
    public void writeName(String name) {
        write(nameInput, name);
    }

    // Rellenar campo Email en "New User SingUp"
    public void writeEmail(String email) {
        write(emailInput, email);
    }

    // Click en el boton Singup
    public void clickSingUp() {
        clickElement(singUp);
    }

    //
    public void registerNewUser(String name, String email) {
        writeName(name);
        writeEmail(email);
        clickSingUp();
    }

    public boolean statusNewUserSingUp() {
        return elementIsDisplayed(labelRegister);
    }

}