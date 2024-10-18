package javaCurso;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class curso24 {
    private JFrame frame;
    private JTextField pesoField;
    private JTextField alturaField;
    private JTextField resultadoField;

    public curso24() {
        frame = new JFrame("Calculadora IMC e IAC");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2));

        JLabel pesoLabel = new JLabel("Peso (kg):");
        pesoField = new JTextField();
        JLabel alturaLabel = new JLabel("Altura (m):");
        alturaField = new JTextField();
        JButton calcularButton = new JButton("Calcular");
        resultadoField = new JTextField();
        resultadoField.setEditable(false);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });

        frame.add(pesoLabel);
        frame.add(pesoField);
        frame.add(alturaLabel);
        frame.add(alturaField);
        frame.add(calcularButton);
        frame.add(resultadoField);

        frame.setVisible(true);
    }

    private void calcular() {
        double peso = Double.parseDouble(pesoField.getText());
        double altura = Double.parseDouble(alturaField.getText());

        // Cálculo do IMC
        double imc = peso / (altura * altura);

        // Cálculo do IAC (considerando um valor fixo de 1 para simplificação)
        double iac = (imc * 1.3); // apenas para exemplo

        // Formatação do resultado
        String resultado = String.format("IMC: %.2f\nIAC: %.2f", imc, iac);
        resultadoField.setText(resultado);

        // Salvar em arquivo
        salvarResultado(imc, iac);
    }

    private void salvarResultado(double imc, double iac) {
        try (PrintWriter writer = new PrintWriter(new FileOutputStream("resultado.txt"))) {
            writer.printf("IMC: %.2f\nIAC: %.2f\n", imc, iac);
            JOptionPane.showMessageDialog(frame, "Resultados salvos em resultado.txt");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Erro ao salvar o resultado.");
        }
    }

    public static void main(String[] args) {
      SwinUtilities.invokeLater(curso24::
    	  SwingUtilities.invokeLater(curso24::ne
    			  
    			  
    			  SwingUtilities.invok
    			  SwingUtiliti
    			  new);
    }
    	
    
}


