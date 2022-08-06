
package com.mycompany.lista2;
import java.util.Scanner;
/**
 *
 * @author gumiy
 */
public class Exercicio7 {
    public static void main(String[] args) {
       Scanner ler = new Scanner (System.in);
       int numero;
        System.out.println("Informe aqui um número: ");
        numero = (int) ler.nextFloat ();
        if (numero % 2 == 0){ 
        System.out.println("Os requisitos foram para a somar 5!" + "\n" + "A soma é de: ");
        System.out.println (numero + 5);
        } else { 
        System.out.println("Os requisitos foram para a somar 8!" + "\n" + "A soma é de: ");
        System.out.println (numero + 8);
        }
    }
}
