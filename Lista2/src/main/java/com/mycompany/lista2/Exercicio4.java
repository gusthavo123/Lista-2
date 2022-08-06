
package com.mycompany.lista2;
import java.util.Scanner;
/**
 *
 * @author gumiy
 */
public class Exercicio4 {
    public static void main(String[] args) {
      Scanner ler = new Scanner (System.in);
      int a, b, c;
        System.out.println("Informe o valor de A: ");
        a = (int) ler.nextInt();
        System.out.println("Informe o valor de B: ");
        b = (int) ler.nextInt();
        if (a == b){ 
            c = a + b;
            System.out.println("Os requesitos foram preenchidos para haver uma soma!" + "\n"+ "A soma dos valores é de: " + c);
        }else{ 
            c = a * b;
            System.out.println ("Os requesitos foram preenchidos para haver uma multiplicação!" + "\n"+ "A multiplicação dos valores é de: " + c);
        }
    }
}
