
package com.mycompany.lista2;
import java.util.Scanner;
/**
 *
 * @author gumiy
 */
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int lado;
        float cm;
        System.out.println("Informe o número de lados: ");
        lado = (int) ler.nextInt ();
        System.out.println("Informe a quantidade em centimetros: ");
        cm = (float) ler.nextFloat ();
         if (lado == 3) {
        System.out.println("Triangulo " + cm + " cm");
        } else if (lado == 4){
        System.out.println("Quadrado " + cm + " cm");
        } else if (lado == 5){
            System.out.println("Pentagono " + cm + " cm");
        } else {
            System.out.println("Não reconhecido!"); 
        }
       }
    }

