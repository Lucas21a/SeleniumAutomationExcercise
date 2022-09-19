Feature: Test de login de Automation Exercise
    @login
    Scenario: como usuario quiero loguearme con usuario y contraseña correcta en Automation Exercise
        Given el usuario esta en la pagina de login
        When completa con sus datos
        And hace click en login
        And vizualiza que esta logueado
        Then elimina su cuenta logueada

