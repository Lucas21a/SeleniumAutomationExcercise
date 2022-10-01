package pages;

public class MainPage extends BasePage {

    // xPath de boton Login en header
    private String buttonLogin = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]";
    // xPath de boton Delete en header
    private String buttonDelete = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]";
    // xPath de Label 'Logged in as ..' en header
    private String loginLabel = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]/a[1]";
    // xPath de boton Logout en header
    private String logoutButton = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]";
    // Xpath de boton Products en header
    private String buttonProduct = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]";
    // xPath de boton Contact Us
    private String buttonContactUs = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[8]/a[1]";
    // xPath de boton view Product del producto 1
    private String buttonViewProduct = "//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]";

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

    public void clickProducts() {
        clickElement(buttonProduct);
    }

    public void clickContactUs() {
        clickElement(buttonContactUs);
    }

    public void clickViewProduct() {
        clickElement(buttonViewProduct);
    }

}
