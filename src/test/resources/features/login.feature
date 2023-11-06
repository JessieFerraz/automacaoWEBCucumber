#language:pt

  Funcionalidade: Login
    Cenario: Realizar Login
      Dado que esteja na página da lojinha
      Quando o login for realizado com os seguintes dados
        |usuario|jessieferraz|
        |senha  |123456      |
      Entao valido que o login foi realizado

    @loginEsquema
    Esquema do Cenario: Realizar Login com <usuario>
      Dado que esteja na página da lojinha
      Quando o login for realizado com os seguintes dados
        |usuario|<usuario>|
        |senha  |<senha>  |
      Entao valido que o login foi realizado

      Exemplos:
        |usuario      |senha       |
        |jessieferraz |123456      |