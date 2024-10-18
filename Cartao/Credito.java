
 interface  Credito {
void realizarpagamento();
}

 
//Classe cartaCredito que implementa a interface de pagamento:
 class CartaoCredito implements pagamento {
 
 
 @Override
	public void realizarPagamento() {
	 System.out.println("Pagamento realizado com cartão de credito");
 }
 
 
 // Classe Boleto que implementa a interface pagamento:
 class Boleto implements Pagamento {
	 @Override
	 public void realizarPagamento() {
		 System.out.println("Pagamento realizado com Boleto");
	 }
 
 
  // Classe principal
 public class Main {
public static void main(string[] args) {
	
// Variavel para determinar o tipo de pagamento:
	String tipoPagamento = "boleto"; // pode ser cartao ou boleto
	
 // Pagamento pagamento
	// Condição para determinar a forma de pagamento
	if (tipoPagamento.equals("cartao")) {
		pagamento = new Boleto();
	} else {
		System.out.println("Forma de pagamento inválida.");
		return; //Encerra o programa se a forma de pagamento for inválida
	
	
	
	}
}

 
 
 