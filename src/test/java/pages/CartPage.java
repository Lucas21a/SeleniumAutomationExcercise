package pages;

import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    private String quantityLabel = "//button[contains(text(),'4')]";

    public CartPage() {
        super(driver);
    }

    public String valueLabelQuantity() {
        return getTextFromWebElemen(quantityLabel);
    }

}
