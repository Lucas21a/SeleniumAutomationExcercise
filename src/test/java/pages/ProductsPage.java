package pages;

public class ProductsPage extends BasePage {

    // xPath del label ALL PRODUCTS
    private String allProductsLabel = "//h2[contains(text(),'All Products')]";
    // xPath del input Search
    private String searchInput = "//input[@id='search_product']";
    // xPath del button de Search
    private String searchButton = "//button[@id='submit_search']";
    // xPath del label SEARCHED PRODUCTS
    private String searchedProductsLabel = "//h2[contains(text(),'Searched Products')]";

    private String firstProductButton = "//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]";
    private String secondProductButton = "//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/a[1]";
    private String continueShoppingButton = "//button[contains(text(),'Continue Shopping')]";
    private String viewCartButton = "//u[contains(text(),'View Cart')]";

    public ProductsPage() {
        super(driver);
    }

    // Escribe el producto en el input Search
    public void writeSearchProducts(String product) {
        write(searchInput, product);
    }

    // CLiack el boton de busqueda
    public void clickSearchProduct() {
        clickElement(searchButton);
    }

    // Devuelve un boolean segun si es visible o no el label ALL PRODUCTS
    public boolean statusAllProductsLabel() {
        return elementIsDisplayed(allProductsLabel);
    }

    // Devuelve un boolean segun si es visible o no el label SEARCHED PRODUCTS
    public boolean statusSearchedProducts() {
        return elementIsDisplayed(searchedProductsLabel);
    }

    public void clickFirstButton() {
        clickElement(firstProductButton);
    }

    public void clickSecondButton() {
        clickElement(secondProductButton);
    }

    public void clickcontinueShopping() {
        clickElement(continueShoppingButton);
    }

    public void clickViewCart() {
        clickElement(viewCartButton);
    }

}
