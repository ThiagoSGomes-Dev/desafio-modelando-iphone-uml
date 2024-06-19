public class Dispositivo {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone("Iphone 14", 500);
        System.out.println(meuIphone.toString());
        meuIphone.selecionarMusica("Rosa de saron - estrangeiro.");
        meuIphone.tocar();
        meuIphone.pausar();

        meuIphone.ligar("85955550029");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}