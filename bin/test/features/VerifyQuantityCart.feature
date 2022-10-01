@quantity
Feature: Test de cantidad de productos en Cart
    Scenario: el usuario verifica si la cantidad de productos agregados al Cart son iguales a los mostrados
        Given el usuario elige un producto al azar
        When incrementa la cantidad
        And clickea el boton de addCart
        And se dirige al Cart
        Then chequea que sea la cantidad que el eligio
