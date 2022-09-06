package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

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

    public RegisterFormPage() {
        super(driver);
    }

    public void completePassInput(String pass) {
        write(passInput, pass);
    }

    public void selectGender() {
        clickElement(genderButton);
    }

    public void completeNameInput(String name) {
        write(nameInput, name);
    }

    public void completeLastNameInput(String Lname) {
        write(lastNameInput, Lname);
    }

    public void completeCompanyInput(String company) {
        write(companyInput, company);
    }

    public void completeAddressInput(String address) {
        write(addressInput, address);
    }

    public void completeStateInput(String state) {
        write(stateInput, state);
    }

    public void completeCityInput(String city) {
        write(cityInput, city);
    }

    public void completeZipCodeInput(String zipCode) {
        write(zipCodeInput, zipCode);
    }

    public void completeMobileInput(String mobile) {
        write(zipCodeInput, mobile);
    }

    public void selectDayInput(int value) {
        selectFromDropdownByIndex(dayInput, value);
    }

    public void selectMonthInput(int value) {
        selectFromDropdownByIndex(monthInput, value);
    }

    public void selectYearInput(int value) {
        selectFromDropdownByIndex(yearInput, value);
    }

    public void clickNewsletter() {
        clickElement(newsletterCheck);
    }

    public void clickOffers() {
        clickElement(offersCheck);
    }

    public void completeTopForm(String pass, int dValue, int mValue, int yValue) {
        selectGender();
        completePassInput(pass);
        selectDayInput(dValue);
        selectMonthInput(mValue);
        selectYearInput(yValue);
        clickNewsletter();
        clickOffers();
    }

    public void completeBottomForm(String name, String Lname, String company, String state, String city, String zipCode,
            String mobile) {
        completeNameInput(name);
        completeLastNameInput(Lname);
        completeCompanyInput(company);
        completeStateInput(state);
        completeCityInput(city);
        completeZipCodeInput(zipCode);
        completeMobileInput(mobile);
    }
}
