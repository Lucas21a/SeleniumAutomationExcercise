package pages;

public class MainPage extends BasePage {

    // xPath de boton de login en header
    private String buttonLogin = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]";
    private String buttonDelete = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]";
    private String loginLabel = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]/a[1]";
    private String logoutButton = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]";

    public MainPage() {
        super(driver);
    }

    public void navigateToAutomationExersice() {
        navigateTo("https://www.automationexercise.com/");
    }

    // Clickeo elemento "SingUp/Login"
    public void goToLoginPage() {
        clickElement(buttonLogin);
    }

    // Clickeo elemento "Delete Account"
    public void deleteAccount() {
        clickElement(buttonDelete);
    }

    // Devuelve un boolean si el label "Logged in as .." es mostrado
    public boolean statusLoginLabel() {
        return elementIsDisplayed(loginLabel);
    }

    // Click en el boton logout
    public void clickLogout() {
        clickElement(logoutButton);
    }

}
