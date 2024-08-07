package edu.dio.fluxoJava;

public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String msg) {
        super(msg);
    
    }
    public ParametrosInvalidosException() {
        super("Parâmetros Inválidos!");
    
    }
}