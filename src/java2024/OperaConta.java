package java2024;

public class OperaConta {
public static void main(String[] args) {
	
// Criação de conta saldo inicial de R$ 1000,00:
ContaBancaria conta  = new ContaBancaria(1000.17);

//Operando a conta do Cliente:
  //1)Exibir o saldo inicial da conta:
System.out.println("Saldo Inicial:" + conta.getSaldo());
//2)Realizando um deposito:
conta.depositar(3);
System.out.println("Saldo apos o deposito de R$" + conta.getSaldo ());
//realizando sacar:
conta.sacar(250);
System.out.println("Saldo apos o saque de R$" + conta.getSaldo ());




}
}


