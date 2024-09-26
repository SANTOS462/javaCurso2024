
public class ClassesMetodos {
  
   //Metodo 1: calcula a soma de 2 valores:	
public int soma(int a, int b) {	
	  return a + b;
	
}	
	
//Metodo 2: Verificar se um numero é Par:
public  
boolean numero % 2 ==0;


public String invertString(String texto) {	
	  return new StringBuilder(texto).reverse().toString();
	
}
	
 // Método 4: Calcular o fatorial de um número:
public int fatorial(int numero) {
 if (numero== 0 || numero ==1) {
return 1;
 }

 return numero * fatorial(numero - 1
 
}

//Este método executa outros métodos!
 public static void main(String[] args) {

	
	 
	 
	 //Instanciando a nossa que criamos

	ClassesMetodos util = new ClassesMetodos();
   // Este método executa outros métodos!

  public static void main(String[] args) {
     //Intanciando a nossa que criamos:
	ClassesMetodos util= new ClassesMetodos();
	//Chamando os métodos:
	System.out.println("Soma de 5 e 3: "+ util.soma(5, 3) );
	System.out.println("O número 4 é par?" + util.ehPar(4));
	System.out.println("String invertida de 'java': " +
util.invertString("Java"));
}
}










