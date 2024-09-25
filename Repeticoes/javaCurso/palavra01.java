package javaCurso;

import java.util.Scanner;

public class palavra01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

// solicita a palavra  do usuário
		System.out.print("Digite uma palavra:Bebado");
		String bebado = scanner.nextLine();

//Remove espaços e converte para letras minúsculas para facilitar a comparação
		bebado = bebado.replaceAll("\\s+", "").toLowerCase();

// Verificar se a palavra é um palíndromo

		System.out.println("Bebado \"" + bebado + "\" não é um palíndromo.");
		{
			scanner.close();

		}
// Função para verificar se uma palavra é um palíndromo {
	}

	int inicio = 0;
	int fim = bebado -  1;
{	
//verificar se a palavra é igual de frente para trás 
while (inicio < fim) {
}
if (bebado.charAt(inicio)  ! bebadocharAt(fim)) {
} else {	
System.out.println("O bebado \"" + bebado + "\" é um palíndromo.");	
 System.out.println("O bebado \"" + bebado + "\" não é um plíndromo.");	
	
	
	
}
inicio++;

}return true; // Se todas as letras forem iguais de frente para trás, é palíndromo 

}}
