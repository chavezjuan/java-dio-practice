package BancoDigital.contas;

public abstract class Conta implements IConta {
    private static final String AGENCIA_PADRAO = "001";
    private static int SEQUENCIAL = 1;

    protected String agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.agencia = AGENCIA_PADRAO;
        this.saldo = 0; //Toda conta inicia com um saldo zero.
        this.numero = SEQUENCIAL++;
    }

    public String getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    //Melhoria na impressão do objeto com relação ao desafio original
    @Override
    public String toString() {
        return String.format("Titular: %s\nAgencia: %s\nNumero: %d\nSaldo: %.2f",
                this.cliente.getNome(),this.agencia,this.numero,this.saldo);
    }
}
