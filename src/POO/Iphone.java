package POO;

import POO.recursos.AparelhoTelefonico;
import POO.recursos.NavegadorInternet;
import POO.recursos.ReprodutorMusical;

class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz");
    }

    @Override
    public void exibirPagina(String endereco) {
        System.out.println("Exibindo a página " + endereco);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando ...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando ...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }
}
