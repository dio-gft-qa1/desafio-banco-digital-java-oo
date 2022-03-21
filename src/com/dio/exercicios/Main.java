package com.dio.exercicios;

// implementar como interface iConta

public class Main {

    public static void main(String[] args) {
	    Conta cc = new ContaCorrente();
	    Conta poupanca = new ContaPoupanca();

        cc.depositar(100);
        cc.transferir(poupanca, 70);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
