package pages;

public class RegisterFormPage extends BasePage {

    String genderButton = "//input[@id='id_gender1']";
    String passInput = "//input[@id='password']";
    String nameInput = "//input[@id='first_name']";
    String lastNameInput = "//input[@id='last_name']";
    String companyInput = "//input[@id='company']";
    String addressInput = "//input[@id='address1']";
    String stateInput = "//input[@id='state']";
    String cityInput = "//input[@id='city']";
    String zipCodeInput = "//input[@id='zipcode']";
    String mobileNumberInput = "//input[@id='mobile_number']";
    String createAccountButton = "//button[contains(text(),'Create Account')]";
    String dayInput = "//select[@id='days']";
    String monthInput = "//select[@id='months']";
    String yearInput = "//select[@id='years']";
    String newsletterCheck = "//input[@id='newsletter']";
    String offersCheck = "//input[@id='optin']";
    String continueButton = "//a[contains(text(),'Continue')]";

    public RegisterFormPage() {
        super(driver);
    }

    // Completa el input Password
    public void completePassInput(String pass) {
        write(passInput, pass);
    }

    // Selecciono el genero
    public void selectGender() {
        clickElement(genderButton);
    }

    // Completa el input Name
    public void completeNameInput(String name) {
        write(nameInput, name);
    }

    // Completa el input Last Name
    public void completeLastNameInput(String Lname) {
        write(lastNameInput, Lname);
    }

    // Completa el input Company
    public void completeCompanyInput(String company) {
        write(companyInput, company);
    }

    // Completa el input Address
    public void completeAddressInput(String address) {
        write(addressInput, address);
    }

    // Completa el input State
    public void completeStateInput(String state) {
        write(stateInput, state);
    }

    // Completa el input City
    public void completeCityInput(String city) {
        write(cityInput, city);
    }

    // Completa el input ZipCode
    public void completeZipCodeInput(String zipCode) {
        write(zipCodeInput, zipCode);
    }

    // Completa el input MobileNumber
    public void completeMobileInput(String mobile) {
        write(mobileNumberInput, mobile);
    }

    // Selecciono el dia
    public void selectDayInput(int value) {
        selectFromDropdownByIndex(dayInput, value);
    }

    // Selecciono el mes
    public void selectMonthInput(int value) {
        selectFromDropdownByIndex(monthInput, value);
    }

    // Selecciono el año
    public void selectYearInput(int value) {
        selectFromDropdownByIndex(yearInput, value);
    }

    public void clickNewsletter() {
        clickElement(newsletterCheck);
    }

    public void clickOffers() {
        clickElement(offersCheck);
    }

    public void clickCreateAccount() {
        clickElement(createAccountButton);
    }

    public void clickContinue() {
        clickElement(continueButton);
    }

    // Completo la parte superior del formulario
    public void completeTopForm(String pass, int dValue, int mValue, int yValue) {
        selectGender();
        completePassInput(pass);
        selectDayInput(dValue);
        selectMonthInput(mValue);
        selectYearInput(yValue);
        clickNewsletter();
        clickOffers();
    }

    // Completo la inferior superior del formulario
    public void completeBottomForm(String name, String Lname, String company, String address, String state, String city,
            String zipCode, String mobile) {
        completeNameInput(name);
        completeLastNameInput(Lname);
        completeCompanyInput(company);
        completeAddressInput(address);
        completeStateInput(state);
        completeCityInput(city);
        completeZipCodeInput(zipCode);
        completeMobileInput(mobile);
    }
}
