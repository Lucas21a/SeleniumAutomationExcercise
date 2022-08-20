package pages;

public class RegisterPage extends BasePage {

    private String buttonLogin = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]";

    public RegisterPage() {
        super(driver);
    }

    public void navigateToAutomationExersice() {
        navigateTo("https://www.automationexercise.com/");
    }

}