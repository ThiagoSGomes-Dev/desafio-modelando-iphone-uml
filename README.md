# desafio-modelando-iphone-uml
Desafio de código pôr em prática toda a concepção de análise de negócios, requisitos, conceitos da programação orientada a objetos e modelagem UML | Bootcamp Santander 2024 - Backend com Java.

## Diagrama de Classes (Iphone UML)

```mermaid
classDiagram
Iphone --|> ReprodutorMusical
<<classe>> Iphone
Iphone : -String modelo
Iphone : -int armazenamento
Iphone : void tocar()
Iphone : void pausar()
Iphone : void selecionarMusica(String musica)
Iphone : void ligar(String numero)
Iphone : void atender()
Iphone : void iniciarCorreioVoz()
Iphone : void exibirPagina(String url)
Iphone : void adicionarNovaAba()
Iphone : void atualizarPagina()
<<interface>> ReprodutorMusical
ReprodutorMusical : +tocar()
ReprodutorMusical : +pausar()
ReprodutorMusical : +selecionarMusica(String musica)
Iphone --|> AparelhoTelefonico
<<interface>> AparelhoTelefonico
AparelhoTelefonico : +ligar(String numero)
AparelhoTelefonico : +atender()
AparelhoTelefonico : +iniciarCorreioVoz()
Iphone --|> NavegadorInternet
<<interface>> NavegadorInternet
NavegadorInternet : +exibirPagina(String url)
NavegadorInternet : +adicionarNovaAba()
NavegadorInternet : +atualizarPagina()
```
