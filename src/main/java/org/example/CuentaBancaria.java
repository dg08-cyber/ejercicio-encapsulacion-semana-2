package org.example;

public class CuentaBancaria {
    private int saldo = 0;

    public void depositar(int cantidad) {
        saldo += cantidad;
    }

    public void retirar(int cantidad) {
        saldo -= cantidad;
    }

    public int getSaldo() {
        return saldo;
    }
}

