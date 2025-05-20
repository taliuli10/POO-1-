/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicioheranca;

/**
 *
 * @author alunolab11
 */
public class ExercicioHeranca {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("davi conde", "213.542.321-32");
        
        contaCorrente cc = new contaCorrente(1000);
        contaPoupanca cp = new contaPoupanca(5000);
        
        cc.sacar(100);
        cp.sacar(1000);
        
        cc.aplicarRendimento();
        cp.aplicarRendimento();
        
        cliente.mostrarSaldos();
        
    }
}
