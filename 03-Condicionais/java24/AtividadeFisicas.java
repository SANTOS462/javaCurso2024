package java24;
import java.util.Scanner;
public class AtividadeFisicas {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
	
    //Exibe o menu de opções 
System.out.println("Escolha uma atividadade fisica");
System.out.println("1 Caminhada");
System.out.println("2 Ciclismo");
System.out.println("3 Corrida");

//Receba a esconha do usuario:
int opcao = scanner.nextInt();
int calorias = 0;
String atividade ="";

//Estrutura Switch   para selecionar atividade e calcular as calorias:

switch(opcao) {

case 1:
	atividade = "corrida";
calorias = 300;
	break;

	case 2:atividade = "Caminhada";

calorias = 250;
break;
	case 3:
	atividade = "Ciclismo";

calorias = 150;
break;

default:
 System.out.println("Opção inválida! tente novamente.");
 System.exit(0);
}

//Exibe o resultado da escolha:
 System.out.println("Você escolheu a atividade: "+atividade);
 System.out.println("Calorias queimadas em 30 min:"+ calorias+"kcal");

	
// fecha o scanner:
scanner.close();









	}

}





















