package javaCurso;
import java.util.Scanner; 
public class Vogais {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("descobrir quantas Vogais tem");
String frase = scanner.nextLine();

int contadorVogais = 0;

// convertemos a frase para minúsculas para facilitar a verificação 

// Lopp para verificar cada caractere da frase
for (int i = 0; i < frase.length(); i++) {
char c =frase.charAt(i);

// verifica se o caractere é uma vogal
if  (c == 'a' || c=='e'||c== 'i' ||c=='o'||c=='u') {
contadorVogais++;

}

}

System.out.println("A frase contém " + contadorVogais  +" vogais.");
scanner.close();

}


}































