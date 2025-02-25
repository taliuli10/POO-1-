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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double s1, s2, d1, d2;
        
        System.out.println("EXEMPLO DE CONTA");
        
        Conta ct;
        ct = new Conta();
        //DEPOSITO 1
        System.out.println("Insira o valor que deseja depositar: ");
        d1 = scan.nextInt();
        
        System.out.printf("Seu sado agora e de: %d", (d1 + saldo));
        
        //DEPOSIO 2
        System.out.println("Insira o valor que deseja sacar: ");
        d2 = scan.nextInt();
        
        System.out.printf("Seu saldo e de: %d", (d1 + d2));
        
        //SAQUE 1
        System.out.println("Insira o valor que deseja sacar: " );
        s1 = scan.nextInt();
        
        
        //SAQUE 2  
        System.out.println("Insira o valor que deseja sacar: " );
        s2 = scan.nextInt();
        
        ct.Sacar(s1);
        ct.Sacar(s2);
        
        
        System.out.printf("Seu sado agora e de: %d", (ct.s1 - ct.s2 - ct.saldo));
        
        //SALDO TOTAL
        ct.saldo = (ct.d1 + ct.d2) - (ct.s1 + ct.s2);
        System.out.printf("Seu saldo total e de: %.2f", ct.saldo);
      
       
    }
}
