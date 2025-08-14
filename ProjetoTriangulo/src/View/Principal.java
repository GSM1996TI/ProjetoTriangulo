package View;

import javax.swing.JOptionPane;
import Model.Triangulo;

public class Principal {
    public static void main(String[] args) {
        Triangulo objTriangulo = new Triangulo();

        try {
            // Entrada via JOptionPane
            objTriangulo.lado1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado 1:"));
            objTriangulo.lado2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado 2:"));
            objTriangulo.lado3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado 3:"));

            if (objTriangulo.isTriangle()) {
                String mensagem = " Os valores formam um triângulo!\n"
                                + " Perímetro: " + objTriangulo.getPerimetro() + "\n"
                                + " Tipo: " + objTriangulo.getTipo() + "\n"
                                + " Área: " + objTriangulo.getArea();
                JOptionPane.showMessageDialog(null, mensagem);
            } else {
                JOptionPane.showMessageDialog(null, " Valores inseridos não formam um triângulo.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira números válidos.");
        }
    }
}
