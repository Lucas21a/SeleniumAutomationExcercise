package pages;

public class RegisterPage extends BasePage {

    // xPath de input de nombre en el sector de Registro
    private String nameRInput = "//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]";
    // xPath de input de email en el sector de Registro
    private String emailRInput = "//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]";
    // xPath boton de SingUp en el sector de Registro
    private String singUp = "//button[contains(text(),'Signup')]";
    // XPath de label
    private String labelRegister = "//h2[contains(text(),'New User Signup!')]";
    // Xpath de input de Email de Login
    private String emailLInput = "//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]";
    // Xpath de input de Password de Login
    private String passwordLInput = "//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[3]";
    // Xpath de boton de Login
    private String loginButton = "//button[contains(text(),'Login')]";

    private String loginYourAccountLabel = "//h2[contains(text(),'Login to your account')]";

    private String emailPassErrorLabel = "//p[contains(text(),'Your email or password is incorrect!')]";

    public RegisterPage() {
        super(driver);
    }

    // Rellenar campo Name en "New User SingUp"
    public void writeName(String name) {
        write(nameRInput, name);
    }

    // Rellenar campo Email en "New User SingUp"
    public void writeEmail(String email) {
        write(emailRInput, email);
    }

    // Click en el boton Singup
    public void clickSingUp() {
        clickElement(singUp);
    }

    public void registerNewUser(String name, String email) {
        writeName(name);
        writeEmail(email);
        clickSingUp();
    }

    public boolean statusNewUserSingUp() {
        return elementIsDisplayed(labelRegister);
    }

    // Rellenar campo Email en "Login to your account"
    public void writeMailLogin(String mail) {
        write(emailLInput, mail);
    }

    // Rellenar campo Password en "Login to your account"
    public void writePassLogin(String password) {
        write(passwordLInput, password);
    }

    // Click en boton Login "Login to your account"
    public void clickLogin() {
        clickElement(loginButton);
    }

    public void loginAccount(String mail, String pass) {
        writeMailLogin(mail);
        writePassLogin(pass);
    }

    public boolean statusLoginYourAccountLabel() {
        return elementIsDisplayed(loginYourAccountLabel);
    }

    public boolean statusEmailPassErrorLabel() {
        return elementIsDisplayed(emailPassErrorLabel);
    }

}