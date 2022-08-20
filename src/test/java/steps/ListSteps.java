package steps;

import java.util.List;

import cucumber.api.java.en.*;
import pages.ListPage;

public class ListSteps {

    ListPage list = new ListPage();

    @Given("^I navigate to the list page$")
    public void navigateToListPage() {
        list.navigateToListPage();
    }

    @When("^I search (.+) in the list$")
    public void searchTheList(String state) throws InterruptedException {
        list.enterSearchCriteria(state);
    }

    @Then("^I can find (.+) in the list$")
    public void theCityIsThere(String city) {
        List<String> lista = list.getAllSearchResults();
        boolean textIsThere = lista.contains(city);

        if (textIsThere) {
            System.out.println("Se encontro la ciudad en la lista: PASSED !");
        } else {
            throw new Error("La ciudad no esta en la lista: FAILED!");
        }
    }
}
