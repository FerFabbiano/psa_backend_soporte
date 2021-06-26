Feature: LoginFeature

  Scenario: Login utilizando contrasenia y mail correctos
    Given Me registro con el mail: "franco@gmail.com" y contrasenia: "hola15"
    When Me logueo con "franco@gmail.com" y "hola15"
    Then Se me indica "Login exitoso"

  Scenario: Login utilizando mail incorrecto
    Given Me registro con el mail: "franco@gmail.com" y contrasenia: "hola15"
    When Me logueo con "farnco@gmail.com" y "hola15"
    Then Se me indica "Mail o contrasenia incorrecta, vuelva a intentar"

  Scenario: Login utilizando contrasenia incorrecta
    Given Me registro con el mail: "franco@gmail.com" y contrasenia: "hola15"
    When Me logueo con "franco@gmail.com" y "hola51"
    Then Se me indica "Mail o contrasenia incorrecta, vuelva a intentar"
