@logout
Feature: Test de logout de Automation Exercise
    Scenario: el usuario se desloguea luego de hacer el login
        Given el usuario navega a la pagina de login
        When ingresa los datos de su cuenta
        And clickea el boton de login
        Then desloguea la cuenta
