Feature: Funcionalidad de Items

  Scenario Outline: Verificar el guardado de un nuevo item
    Given 'IsoCode' page is loaded
    And presionar botton 'Plus'
    And llenar informacion "<modelo>" and "<marca>" and "<categoria>" and "<potencia>" and "<estado>" and "<cantidad>" and "<precio>" del item
    Then verificar en la lista 'Catalog'

    Examples:
      | modelo  | marca    | categoria  | potencia | estado | cantidad | precio |
      | AFD     | Mercedes | Tractores  | 200      |      1 |      5   | 2000   |
      | XYZ     | Mercedes | Tractores  | 200      |      1 |      5   | 2000   |
