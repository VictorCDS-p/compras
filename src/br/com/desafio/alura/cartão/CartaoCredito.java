package br.com.desafio.alura.cartão;

import br.com.desafio.alura.compra.Compra;

import java.util.List;

public class CartaoCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoCredito(double limite, double saldo) {
        this.limite = limite;
        this.saldo = saldo;
    }
}
