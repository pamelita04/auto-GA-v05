Feature: Funcionalidad de Incidentes

  //Given And When Then

#  @bvt
#  Scenario: Create
#    Given 'SisSecurity' page is loaded
#    And click 'Registrar Maquinaria' tab in 'Header' page
#    //veriffication
#    Then verificar que

#  @ABC
#  Scenario: Edit
#    Given 'SisSecurity' page is loaded
#    And set my credentials on 'Login' page
#
#  @ABC
#  Scenario Outline: Create
#    And fill "<Nombre Maquinaria>" nombre maquinaria campo en 'Formulario Maquina' form
#    Then verificar que "<Nombre Maquinaria>" esta desplago en 'Lista de Maquinarias' tabla
#
#    Examples:
#      | Nombre Maquinaria      | Nombre Maquinaria3      | Nombre Maquinaria2      |
#      | Nombre Maquinaria Test | Nombre Maquinaria Test | Nombre Maquinaria Test |


  Scenario: Ver la pagina principal 'Catalog'
    Given 'IsoCode' page is loaded
    And choose option one click 'Catalog'



  Scenario Outline: Verificar filtro por categoria
    Given 'IsoCode' page is loaded
    And seleccionar el filtro por "<categoria>"

    Examples:
      | categoria |
      | Gruas     |



  Scenario: Ver detalle de item
    Given 'IsoCode' page is loaded
    And choose option one click 'Ver detalle' on card item
