#Author: hamtont@gmail.com
@tag
Feature: Comprar articulo en web plazavea.com

  @tag1
  Scenario: Ingresar a la web plazavea.com y realizar compra de un articulo
    Given que el usuario se encuentra en plazavea
    When el usuario selecciona opcion de televisores en electrohogar
    Then el debera visualizar el carrito con su articulo agregado
