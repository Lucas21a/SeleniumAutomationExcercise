Feature: Test de registro de Automation Exercise
    Scenario: como usuario quiero registrarme en Automation Exercise

        Given estoy en la pagina de registro
        When yo completo el formulario
        And hago click en registrarme
        Then muestra que la cuenta fue creada

