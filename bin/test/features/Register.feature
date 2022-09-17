@Reg
Feature: Test de registro de Automation Exercise
    Scenario: como usuario quiero registrarme en Automation Exercise
        Given el usuario esta en la pagina de registro
        When completa el formulario
        And hace click en registrarme
        Then elimina la cuenta

Feature: Test de login de Automation Exercise
    Scenario: como usuario quiero loguearme en Automation Exercise
        Given el usuario esta en la pagina de login
        When completa con sus datos
        And hace click en login
        Then vizualiza que esta logueado
