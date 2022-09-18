@login2
Feature: Test de login de Automation Exercise
    Scenario: como usuario quiero loguearme con usuario y contraseña incorrecta en Automation Exercise
        Given el usuario esta en la pagina de login.
        When completa con sus datos erroneos
        And hace click en login.
        Then vizualiza un mensaje de error