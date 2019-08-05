package com.example.diccionario;

import javax.security.auth.PrivateCredentialPermission;

public class Diccionario {

   private String palabra;
   private String significado;

    public Diccionario(String palabra, String significado) {
        this.palabra = palabra;
        this.significado = significado;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getSignificado() {
        return significado;
    }

    public void setSidnificado(String significado) {
        this.significado = significado;
    }

    @Override
    public String toString() {
        return palabra;
    }
}
