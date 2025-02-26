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
    
    public static void exibirMenu(){
        System.out.println("\t-----------------------");
        System.out.println("\t\tMENU");
        System.out.println("\t-----------------------");
        System.out.println("\tescolha sua opcao: ");
        System.out.println("\t[1] Entrar na conta");
        System.out.println("\t[2] Sair da conta");
        System.out.println("\t[0] Fechar aplicativo");
        System.out.println("\t-----------------------");
    }
        public static void exibirMenuOpcoes(){
        System.out.println("\t-----------------------");
        System.out.println("\t\tMENU");
        System.out.println("\t-----------------------");
        System.out.println("\tescolha sua opcao: ");
        System.out.println("\t[1] Mostrar saldo");
        System.out.println("\t[2] Depositar");
        System.out.println("\t[3] Sacar");
        System.out.println("\t[0] Sair");
        System.out.println("\t-----------------------");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double s1, s2, d1, d2;
        int opcao = -1, menuOpcao;
           do{
               exibirMenu();
               opcao = scan.nextInt();
               
               exibirMenuOpcoes();
                menuOpcao = scan.nextInt();
                
                
                Conta c1;
                c1 = new Conta();
                
                c1.nome = "ricardo";
                c1.numero = "1";
                c1.limite = "5000";
                c1.saldo = "1000";
                
                Conta c2;
                c2 = new Conta();
                   
                c2.nome = "Jose";
                c2.numero = "2";
                c2.limite = "10000";
                c2.saldo = "2000";
                
                
                switch (menuOpcao){
                    case 0:
                        System.out.println("Saindo do programa...");
                 //DEPOSITO 
                    case 1:
                        System.out.printf("Entrando na conta.");
                        
                    case 2:
                 //SAQUE 1
                        System.out.println("Insira o valor que deseja depositar: ");
                        d1 = scan.nextInt();
                    case 3:
                        System.out.println("Insira o valor que deseja sacar: " );
                        s1 = scan.nextInt();
                
                
                switch (opcao){
                    case 0:
                        System.out.println("Saindo do programa...");
                 //DEPOSITO 
                    case 1:
                        System.out.printf("Seu saldo e de: %2.f", ct.saldo );
                        ct.saldo = scan.nextInt();
                    case 2:
                 //SAQUE 1
                        System.out.println("Insira o valor que deseja depositar: ");
                        d1 = scan.nextInt();
                    case 3:
                        System.out.println("Insira o valor que deseja sacar: " );
                        s1 = scan.nextInt();

        
                    ct.Sacar(s1);
        
                //SALDO TOTAL
                    ct.saldo = (d1 + d2) - (s1 + s2);
                    System.out.printf("Seu saldo total e de: %.2f", ct.saldo);
                    }
            }while(opcao != 0);
       
    }
}
