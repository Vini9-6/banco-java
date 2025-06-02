package br.com.vini.bancodigital.modelo;
//package br.com.vini.bancodigital.model;

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();

   //void imprimirInfoComum();
}