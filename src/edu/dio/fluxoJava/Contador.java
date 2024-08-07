package edu.dio.fluxoJava;

import java.util.Scanner;

public class Contador {
    
    int num = 0;
    int num2 = 0;

    Scanner scan = new Scanner(System.in);

    public void lerNumeros() {
        System.out.println("Digite o primeiro número:");
        num = scan.nextInt();
        System.out.println("Digite o segundo número:");
        num2 = scan.nextInt();
    }

    public void imprimirNumeros() throws ParametrosInvalidosException{
        if (num > num2){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!"); 
        }else {
            for (int contador = 1; contador <= (num2 - num); contador++) {
                System.out.println("Imprimindo o número " + contador);
            }
    }
  }
}