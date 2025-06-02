package br.com.vini.bancodigital.modelo;
import java.util.List;

public class Banco {

    public String nome;
    private List <Conta> contas; // Lista de contas do banco
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}

