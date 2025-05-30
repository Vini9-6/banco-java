public class Main {

   public static void main (String[] args) {
   Banco banco = new Banco(); 
   banco.setNome("Banco Digital");
   System.out.println("Bem-vindo ao " + banco.getNome());
   System.out.println("===================================");

   Conta cc = new ContaCorrente();
   cc.imprimirExtrato();
   cc.depositar(100);
   cc.imprimirExtrato();

   Conta cp = new ContaPoupanca();
   cp.imprimirExtrato();
   cc.transferir(10, cp);
   cc.imprimirExtrato();
   cp.imprimirExtrato();
   
   cc.sacar(50);
   cc.imprimirExtrato();
   }
}
