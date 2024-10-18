package javaCurso2024;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Leitura {
public static void main(String[] args) {
	String caminho = "C:\\dados.txt"; // Caminho do arquivo
	File arquivo = new File(caminho);

	// Verifica se o arquivo existe
	if (!arquivo.exists()) {
		System.out.println("Erro: O arquivo não existe em" + caminho);
		return; //Encerra o programa se o arquivo não existir
		
		//ler Argovia
		try ( (new FileReader(arquivo))) {
			
			// Le o arquivo linha por linha 
			
				char[] linha;
				System.out.println(linha); // Exibe a linha no console
				
		} catch  (IOExcepcion e) {
				// Capture exceções i/o
				System.out.println("Erro ao ler o arquivo:" + e.getMessage());
				
			
		
			}	
		}

}

private static BufferedReader args(FileReader fileReader) {
	
	return null;
}



}