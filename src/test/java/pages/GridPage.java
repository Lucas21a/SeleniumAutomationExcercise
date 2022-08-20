package pages;

public class GridPage extends BasePage {

    private String cell = "//*[@id='root']/div/";
    private String mainTable = "//*[@id='root']/div/table";

    public GridPage() {
        super(driver);
    }

    public void navigateToGrid() {
        navigateTo("https://1v2njkypo4.csb.app");
    }

    // devolver valor de una celda
    public String getValueFromGrid(int row, int column) {
        return getValueOnTable(cell, row, column);
    }

    public boolean cellStatus() {
        return elementIsDisplayed(mainTable);
    }

}