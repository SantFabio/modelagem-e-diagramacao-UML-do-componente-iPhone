classDiagram
class Musica {
-nome: String
-artista: String
-duracao: double
+Musica(nome: String, artista: String, duracao: double)
+getters() and setters()
}

    class Contato {
      -ddd: int
      -numero: int
      -donoNumero: String
      +Contato(ddd: int, numero: int, donoNumero: String)
      +getters() and setters()
    }

    class Telefone {
      +ligar(contato : Contato)
      +atender()
      +iniciarCorreioVoz()
    }

    class Safari {
      -abasAbertas: ArrayList~String~
      +exibirPagina(url : String)
      +adicionarNovaAba(url : String)
      +atualizarPagina()
    }

    interface ReprodutorMusical {
      +tocar(musica : Musica)
      +pausar()
      +selecionarMusica(musica : Musica)
    }

    interface AparelhoTelefonico {
      +ligar(contato : Contato)
      +atender()
      +iniciarCorreioVoz()
    }

    interface NavegadorInternet {
      +exibirPagina(url : String)
      +adicionarNovaAba(url : String)
      +atualizarPagina()
    }

    class AppMusic {
      +tocar(musica : Musica)
      +pausar()
      +selecionarMusica(musica : Musica)
    }

    class iPhone {
      ++ Musica
      ++ AppMusic
      ++ Contato
      ++ Telefone
      ++ Safari
    }

    Musica --|> AppMusic : uses
    AppMusic ..> ReprodutorMusical : implements
    Contato --|> Telefone : uses
    Telefone ..> AparelhoTelefonico : implements
    Safari ..> NavegadorInternet : implements

    ReprodutorMusical <|.. AppMusic : implements
    AparelhoTelefonico <|.. Telefone : implements
    NavegadorInternet <|.. Safari : implements
