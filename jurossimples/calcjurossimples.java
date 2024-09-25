package;

import java.util.Scanner;
public class calcjurossimples {

public class CalcJurossimples {
 private static final Readable System = null;

public static void main(String[] args) {
   // instanciando a classe  scanner para USÁ-LA
  Scanner scanner = new Scanner(System);
   //entrada dos valores 
  System.out.println("Capital a investir (R$): ");
double taxa = scanner.nextDouble();

 System.out.println(" tempo em anos ");
 int tempo = scanner .nextInt();
  
 double juros = (capital * taxa * tempo)/100;
 System.out.println("O valor dos juros é:" + juros);
 //Resultado Final:
 double total = capital + juros;
 System.out.println("Capital inicial + Juros "+ total);
 scanner.close();
 
 
 
 
 }
}
}
 
 
 
 
 
 