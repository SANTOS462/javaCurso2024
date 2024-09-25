package java2024;
import java.util.Scanner;

	public class Calculadora01 {
public static void main(String[] args) {

  //calculadora 
  Scanner scanner = new Scanner("System.in");

System.out.println("Capital onde investir (R$):");
double taxa = scanner.nextInt();
  
System.out.println("Tempos em anos");
int tempo = scanner .nextInt();

Scanner sc;
double capital = sc.nextDouble();
(capital * taxa * tempo);

System.out.println("Digite a Taxa de juros anual:");
scanner.close();

//Pegar o tempo da aplicação:
System.out.println("Digite o tempo");
int tempo = sc.nextInt();	
	
	//Cálculo dos juros compostos(anual):
double montante = capital *Math.pow(1 +(taxa/100); tempo);
	double juros = montante - capital;

//Resultados:	
System.out.println("O valor dos juros compostos é:" + juros);	
System.out.println("O valor total (principal + juros) é: "+ montante);	
sc.close();	
	

	


	
	
	
	
	
	
	
	
	
	
	
		

	
	
	
	
}	
	
	
	}	
	
	
	
	
	