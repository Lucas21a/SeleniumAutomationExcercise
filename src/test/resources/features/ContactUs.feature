@ContactUs
Feature: Test de Contact Us
    Scenario: el usuario quiere contactarse con el equipo de Automation Exercise
        Given el usuario se dirige a la pestaña Contact Us
        When completa el formulario de contacto
        And clickea el boton submit de contacto
        Then regresa a MainPage desde contacto