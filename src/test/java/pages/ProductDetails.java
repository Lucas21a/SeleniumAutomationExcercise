package pages;

public class ProductDetails extends BasePage {

    private String quantityInput = "//input[@id='quantity']";
    private String buttonAddCart = "//body/section[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/span[1]/button[1]";
    public String buttonViewCart = "//u[contains(text(),'View Cart')]";

    public ProductDetails() {
        super(driver);
    }

    public void writeQuantity(String value) {
        write(quantityInput, value);
    }

    public void clickAddCart() {
        clickElement(buttonAddCart);
    }

    public void clickViewCart() {
        clickElement(buttonViewCart);
        ;
    }

}
