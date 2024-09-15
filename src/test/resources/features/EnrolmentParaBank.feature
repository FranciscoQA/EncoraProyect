#language:es

Característica: Inicio de Sesion
  Como candidato a pruebas QA Automatizador
  Quiero ingresar a la pagina ParaBank
  Para realizar una prueba de automatizacion

  @EnrolamientoParaBankCreateNewLogin
  Escenario: Create Login - New User
    Dado que ingreso a la pagina Para Bank
    Cuando la pagina este abierta realizo click en register
    Y ingreso datos aleatorios en el formulario
    Y hacer click en el boton register
    Entonces valido que se despliega el mensaje exitoso "Your account was created successfully. You are now logged in."
    Y que ingreso a la pagina Para Bank
    Y ingreso con la cuenta generada
    Entonces valido que se despliega el mensaje exitoso "An internal error has occurred and has been logged."
