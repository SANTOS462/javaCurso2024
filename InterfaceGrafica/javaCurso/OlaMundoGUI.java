package javaCurso;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OlaMundoGUI extends JFrame {
public OlaMundoGUI() {
	
	//Configurando a Tela:
	setTitle("OLÁ Mundo em JAVA");
	setSize(400, 300);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//Criando um botão
	//JButton botao = new JButton("Clique em Mim");
	JButton botao = new JButton("<html><body style='text-alingn: center;border: solid; padding: 10px; font-size: 16px;'>Clique em Mim</body<>/html>");
	//Adicionar um Action Listener ao botão:
	botao.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			//Exibir um popup com a mensagem "OLÁ Mundo":
			JOptionPane.showMessageDialog(null, "OLÁ Mundo!");
			
		}		
			
	});
	
	// Adiciona o botão na janela :
	add(botao);
	//Tornar a janela visivel:
	setVisible(true);
}
public static void main(String[] args) {
	//Executar a interface grafica:
	new OlaMundoGUI();
			
			
}			
			
			
			
}		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	
	




