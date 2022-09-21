@SearchProduct
Feature: Test de busqueda de producto de Automation Exercise
    Scenario: el usuario busca un producto en la pestaña de Products
        Given el usuario se dirige a la pestaña productos
        When busca un producto deseado
        Then visualiza el resultado de la busqueda
