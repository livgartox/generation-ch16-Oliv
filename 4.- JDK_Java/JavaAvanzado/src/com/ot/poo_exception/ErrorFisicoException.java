package com.ot.poo_exception;

public class ErrorFisicoException extends Exception{
    public ErrorFisicoException(Exception ex) {
        super("\t\t\t <-- Ocurrió un error Físicp--> ",ex);
    }
}
