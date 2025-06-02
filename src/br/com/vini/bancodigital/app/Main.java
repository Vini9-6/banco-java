package br.com.vini.bancodigital.app;

import java.util.Scanner;

import br.com.vini.bancodigital.modelo.Banco;
import br.com.vini.bancodigital.modelo.Cliente;
import br.com.vini.bancodigital.modelo.Conta;
import br.com.vini.bancodigital.modelo.ContaCorrente;
import br.com.vini.bancodigital.modelo.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNome("Banco Digital");
        System.out.println("Bem-vindo ao " + banco.getNome());
        System.out.println("===================================");

        Cliente Vini = new Cliente();
        Vini.setNome("Vinicius");
        Conta cc = new ContaCorrente(Vini);
        Conta cp = new ContaPoupanca(Vini);

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Depositar na Conta Corrente");
            System.out.println("2 - Transferir da Conta Corrente para Poupança");
            System.out.println("3 - Imprimir Extrato Conta Corrente");
            System.out.println("4 - Imprimir Extrato Conta Poupança");
            System.out.println("0 - Encerrar Programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor para depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    cc.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Valor para transferir: ");
                    double valorTransferencia = scanner.nextDouble();
                    cc.transferir(valorTransferencia, cp);
                    break;
                case 3:
                    cc.imprimirExtrato();
                    break;
                case 4:
                    cp.imprimirExtrato();
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
