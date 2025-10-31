package solid.singleResponsability;

import java.util.List;

class Pedido {
    List<Item> itens;
    String emailCliente;

    Pedido(List<Item> i, String e) {
        this.itens = i;
        this.emailCliente = e;
    }
}