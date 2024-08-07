
package edu.dio.fluxoJava;
public class App {
    public static void main(String[] args) throws Exception {
        Contador contador = new Contador();

        try {
        contador.lerNumeros();
        contador.imprimirNumeros();
        }catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
}
