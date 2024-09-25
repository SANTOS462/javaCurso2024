package java2024;

public class ManipulandoStrings {

	public static void main(String[] args) {

// Criando Strings:
		String texto = "william";
		String texto2 = "Vamos aprender sobre Strings!";

// 1. Comprimento da string:

		// System.out.println("comprimento da String" + texto.length());

// 2. Concatenar Strings: 
		String textoCompleto = texto + texto2;
		System.out.println("Texto Completo:" + textoCompleto);
// 3. converter para Maiúsculas E minúsculas:
		//System.out.println("MAIÚSCULAS:"+texto.toupperCase());
		//System.out.println("minúsculas:"+texto.toUpperCase());
		//System.out.println("Apenas a primeira letra maiuscula:"+texto.subtring(0,1).toUpperCase());

// 4.Substituir uma parte da String:
		//String novoTexto=texto.replace("Java","PHP");
		// System.out.println("Texto após a substituição: " + novoTexto)
// 5.Buscar por uma substring:
		//int posicao=texto.indexOf("curso");System.out.println("posição da palavra 'curso': "+posicao);

//6.Verificar se uma string começa ou termina com uma substring:
		//System.out.println("Começa com 'Bem':"+ texto.startsWith("Bem");

//7.Dividir uma String:
		String nomeCompleto ="William Henrique lima Santos";
	
		System.out.println("Palavra no texto completo:");
		
		String[] palavras = nomeCompleto.split(" ");
		for(String palavra : palavras)  {
				 
			 System.out.println(palavra);
		}
		
   //}
	
   //8. Remover espaços:
   String textoComEspacos =" Texto com espaços.     ";
   
 //  System.out.println(" Texto sem espaços:'" +
 //  textoComEspacos.trim()replaceALL("\\S+", ""  )+ "'");
   /* O comando: "  \\s+ " => captura todos os espaços da string
 * O comando " " => substitui todos os espaços por apenas 1.  
  */ 
   
   
   
   
	}}
















