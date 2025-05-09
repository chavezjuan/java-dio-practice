package POO;

public class Application {
    public static void main(String[] args) {
        System.out.println("Ligando o Iphone ...");
        Iphone iphone = new Iphone();
        System.out.println("Demonstrando as operações:");
        iphone.adicionarNovaAba();
        iphone.atender();
        iphone.exibirPagina("www.google.com");
        iphone.atualizarPagina();
        iphone.ligar("99999-9999");
        iphone.selecionarMusica();
        iphone.pausar();
        iphone.tocar();
        iphone.iniciarCorreioVoz();
    }
}
