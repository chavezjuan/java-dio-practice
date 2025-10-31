package solid.singleResponsability;

import java.util.List;

class CalculoPedido {
    public double calcularPedido(Pedido pedido) {
        double total = 0;
        for (Item item : pedido.itens) {
            total += item.preco;
        }
        return total;
    }
}
