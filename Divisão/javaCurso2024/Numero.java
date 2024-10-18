package javaCurso2024;


import java.util.Scanner;public static void main
	ublic static void main(String[]args){
public class Numero {

	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	


	//Solicita ao usuário para inserir dois números inteiros:
	System.out.print("Insira o primeiro número inteiro:");
	int numero1 = scanner.nextInt();
	
	System.out.println("Insira o segundo número inteiro:");
	int numero2 = scanner.nextInt();
	
		
	//Verificar se o  segundo número é zero
	if (numero2 == 0) {
		System.out.println("Erro: Não é possivel dividir por zero.");
	} else {
		try {
			
			//Tenta realizar a divisão
			int resultado = numero1 / numero2;
			System.out.println("Resultado da divisão:" + resultado);
		} catch (ArithmeticException e) {
			//Capturar a exceção caso ocorra
			System.out.println("Erro: Ocorreu uma exceção ao tentar dividir:"+ e.getMessage());
			
			
			// Fecha o scanner
			scanner.close();
		}
	
		

	
