public abstract class Conta implements IConta {
    
    private static int SEQUENCIAL = 1;
    protected static final int AGENCIA_PADRAO = 0001;

    protected int numero;
    protected int agencia;
    protected double saldo;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        //this.saldo = 0.0;
    }

    public int getNumero() {
        return numero;
    }
    public int getAgencia() {
        return agencia;
    }
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    @Override
    public void imprimirExtrato() {

    }

}

