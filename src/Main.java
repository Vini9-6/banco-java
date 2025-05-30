public class Main {

   public static void main (String[] args) {
   Banco banco = new Banco(); 
   banco.setNome("Banco Digital");
   System.out.println("Bem-vindo ao " + banco.getNome());
   System.out.println("===================================");
   
   Cliente Vini = new Cliente();
   Vini.setNome("Vinicius");
   Conta cc = new ContaCorrente(Vini);
   Conta cp = new ContaPoupanca(Vini);

   cc.depositar(180);
   cc.transferir(100, cp);
   cc.imprimirExtrato();
   cp.imprimirExtrato();
   System.out.println("===================================");
   }
}
