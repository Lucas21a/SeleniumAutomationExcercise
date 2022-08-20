Feature: Probamos cositas
    @Test
    Scenario Outline: Validate that a text is present inside the list
        Given I navigate to the list page
        When I search <state> in the list
        Then I can find <city> in the list

        Examples:
            | state   | city                |
            | Florida | Miami, Florida      |
            | Seattle | Seattle, Washington |

