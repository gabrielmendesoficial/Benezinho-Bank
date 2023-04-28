package br.com.benezinhobank.model.model;

import br.com.benezinhobank.model.pessoa.model.Pessoa;

public class ContaPoupanca extends Conta {

    private int aniversario;

    public ContaPoupanca() {
    }

    public ContaPoupanca(double saldo, Agencia agencia, Pessoa titular, int aniversario) {
        super(saldo, agencia, titular);
        this.aniversario = aniversario;
    }

    public int getAniversario() {
        return aniversario;
    }

    public void setAniversario(int aniversario) {
        this.aniversario = aniversario;
    }
}
