package BancoDigital;

import BancoDigital.contas.Cliente;
import BancoDigital.contas.Conta;
import BancoDigital.contas.ContaCorrente;
import BancoDigital.contas.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente user = new Cliente();
        user.setNome("Juan");

        Conta cc = new ContaCorrente(user);
        Conta poupanca = new ContaPoupanca(user);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
