package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions action;

    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lucas Fredes Ibarra\\Desktop\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    // Navegar a una url pasada por parametro
    public static void navigateTo(String url) {
        driver.get(url);
    }

    // Cierra la instancia del navegador
    public static void closeBrowser() {
        driver.quit();
    }

    // busca y devuelve un webElement
    private WebElement find(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    // Realiza click izq en el elemento
    public void clickElement(String locator) {
        find(locator).click();
    }

    // Escribe en un campo de texto
    public void write(String locator, String textoWrite) {
        find(locator).clear(); // limpia el campo de texto
        find(locator).sendKeys(textoWrite);

    }

    // Seleccionar en dropdown por valor
    public void selectFromDropdownByValue(String locator, String valueSelect) {
        Select dropdown = new Select(find(locator));
        dropdown.selectByValue(valueSelect);
    }

    // Seleccionar en dropdown por index
    public void selectFromDropdownByIndex(String locator, int valueSelect) {
        Select dropdown = new Select(find(locator));
        dropdown.selectByIndex(valueSelect);
    }

    // Seleccionar en dropdown por contenido de texto
    public void selectFromDropdownByText(String locator, String valueSelect) {
        Select dropdown = new Select(find(locator));
        dropdown.selectByVisibleText(valueSelect);
    }

    // Poner el cursor sobre un WebElement
    public void hoverOVerElement(String locator) {
        action.moveToElement(find(locator));
    }

    // Doble click a un webElement
    public void doubleClick(String locator) {
        action.doubleClick(find(locator));
    }

    // Click derecho a un webElement
    public void rightClick(String locator) {
        action.contextClick(find(locator));
    }

    // Obtener el contenido de una celda en una tabla
    public String getValueOnTable(String locator, int row, int column) {
        String cellINeed = locator + "/table/tbody/tr[" + row + "]/td[" + column + "]";

        return find(cellINeed).getText();
    }

    // Reescribo el valor de una celda en una tabla
    public void setValueOnTable(String locator, int row, int column, String contenido) {
        String cellINeed = locator + "/table/tbody/tr[" + row + "]/td[" + column + "]";
        find(cellINeed).sendKeys(contenido);
    }

    // Validar si el elemento es mostrado
    public boolean elementIsDisplayed(String locator) {
        return find(locator).isDisplayed();
    }

    // Devuelve una lista de webElements
    public List<WebElement> bringMeAllElements(String locator) {
        return driver.findElements(By.className(locator));
    }

    // Devuelve la url actual
    public String getCurrentUrl() {
        String url = driver.getCurrentUrl();
        return url;
    }

}
