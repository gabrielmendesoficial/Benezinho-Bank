package br.com.benezinhobank.model.model;

import br.com.benezinhobank.model.pessoa.model.Pessoa;

public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(double saldo, Agencia agencia, Pessoa titular, double limite) {
        super(saldo, agencia, titular);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
