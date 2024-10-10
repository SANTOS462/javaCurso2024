package java2024;

public class LISTA8 {
 // Método estatico que retorna o maior número de um array
public static int maiorNumero(int[] numero) {
	int maior = numero[0]; // Assume que o primeiro número é maior

int[] numero1 = new int[5];
	// Percorre o array para encontrar o maior número
	for (int i = 1; i < numero.length; i++) {
		if (numero1[i] > maior)  {
			maior = numero1[i]; // Atualiza o maior número
			
		}		
	}			
	return maior;
		}
	

 // Retorna o maior número encontrado

		
public static void main(String[] args) {
	//Declara e inicializa um array do tipo int
	int[] numeros = {5, 12, 3, 8, 21, 1};

	//Chama o método maiorNumero e armazena o retorno
	int maior = maiorNumero(numeros);

	//Imprime o maior número na tela
	System.out.println("O maoir número do array é: +  maior");



}

	}


