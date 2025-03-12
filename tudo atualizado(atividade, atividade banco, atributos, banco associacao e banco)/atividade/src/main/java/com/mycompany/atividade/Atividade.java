/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade;

/**
 *
 * @author alunolab08
 */
import java.util.Scanner;

public class Atividade {
    
   /* public static void exibirMenu(){
        System.out.println("\n--- Menu ---");
        System.out.println("\tescolha sua opcao: ");
        System.out.println("\t[1] Entrar na conta");
        System.out.println("\t[2] Sair da conta");
        System.out.println("\t[0] Fechar aplicativo");
        System.out.println("\t-----------------------");
    }
        public static void exibirMenuOpcoes(){
            System.out.println("\n--- Sistema Bancário ---");
            System.out.println("1 - Depósito");
            System.out.println("2 - Saque");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Consultar Limite");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
    }*/

    public static void main(String[] args) {
        Conta conta = new Conta(5000.00, 50000.00);

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Sistema Bancário ---");
            System.out.println("1 - Depósito");
            System.out.println("2 - Saque");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Consultar Limite");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser depositado: R$ ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser sacado: R$ ");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    break;
                case 3:
                    System.out.println("Saldo atual: R$ " + conta.getSaldo());
                    break;
                case 4:
                    System.out.println("Limite disponível: R$ " + conta.getLimite());
                    break;
                case 5:
                    System.out.println("Obrigado por utilizar o sistema bancário!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 5);
        
        Conta c1;
        c1 = new Conta();
        c1.numero = 10;
        c1.saldo = 1000;
        c1.limite = 500;
        
        //opcao 1 : (Melhor opcao)
        Cliente cli1 = new Cliente();
        cli1.cpf = "181847887-03";
        cli1.nome = "Ricardo";
        cli1.sobrenome = "Taliuli";
        
        c1.titular = cli1;
        
        Cliente cli2 = new Cliente();
        cli2.cpf = "181847887-30";
        cli2.nome = "xxxx";
        cli2.sobrenome = "zzzz";
        
        cli1.Casamento(cli2);
        
        System.out.println(c1.titular.conjuge.nome);
        
        scanner.close();

    }
}
