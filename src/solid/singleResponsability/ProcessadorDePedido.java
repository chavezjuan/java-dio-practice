package solid.singleResponsability;

public class ProcessadorDePedido {

    private final CalculoPedido calculoPedido;
    private final DescontoPedido descontoPedido;
    private final PedidoRepository pedidoRepository;
    private final EmailService emailService;

    ProcessadorDePedido(CalculoPedido calculoPedido,
                        DescontoPedido descontoPedido,
                        PedidoRepository pedidoRepository,
                        EmailService emailService) {
        this.calculoPedido = calculoPedido;
        this.descontoPedido = descontoPedido;
        this.pedidoRepository = pedidoRepository;
        this.emailService = emailService;
    }

    public void processar(Pedido pedido) {

        // 1. Responsabilidade: Cálculo de Regra de Negócio
        double total = calculoPedido.calcularPedido(pedido);

        // Aplica um desconto fixo de 10%
        total = descontoPedido.aplicarDesconto(total);
        System.out.println("Total do pedido calculado: " + total);

        // 2. Responsabilidade: Persistência
        System.out.println("Salvando pedido no banco de dados...");
        pedidoRepository.salvar(pedido);

        // 3. Responsabilidade: Notificação
        System.out.println("Enviando e-mail de confirmação para " + pedido.emailCliente);
        emailService.enviarEmail(pedido);

        System.out.println("Pedido processado.");
    }
}
