
package com.mycompany.lista2;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
     int numero1;
     int numero2;
     int numero3;
     int auxiliar;
     System.out.println ("Informe o primeiro número: ");
     numero1 = (int) ler.nextInt ();
     System.out.println("Informe o segundo número: ");
     numero2 = (int) ler.nextInt ();
     System.out.println("Informe o terceiro número: ");
     numero3 = (int) ler.nextInt (); 
 
                if (numero1 > numero2) {
                    auxiliar = numero1;
                    numero1 = numero2;
                    numero2 = auxiliar;
                }
 
                if (numero2 > numero3) {
                    auxiliar = numero2;
                    numero2 = numero3;
                    numero3 = auxiliar;

                }

                if (numero1 > numero2) {
                    auxiliar = numero1;
                    numero1 = numero2;
                    numero2 = auxiliar;
                }
        
                System.out.println ("Ordem decrescente: " + " "+ numero3 + " " + numero2 + " " + numero1);
 
            }
        }

