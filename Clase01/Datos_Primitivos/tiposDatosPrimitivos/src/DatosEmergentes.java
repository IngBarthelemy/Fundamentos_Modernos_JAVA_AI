import javax.swing.JOptionPane;

public class DatosEmergentes {
    public static void main(String[] args) {

        // Declaran los datos o las variables primitivas.
        int edad;
        char sexo;
        boolean matrimonio;
        double peso;
        String nombres;

        // Entrada de datos emergentes.
        nombres = JOptionPane.showInputDialog(null, "Ingresa su nombre, por favor");
        edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cual es tu edad?"));
        sexo = JOptionPane.showInputDialog("Cual es tu sexo F o M").charAt(0);
        matrimonio = Boolean.parseBoolean(JOptionPane.showInputDialog("Usted es Casado Verdaro o Falso"));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Ingresa su peso, por favor!"));

        // Imprime los datos emergentes en la pantalla de manera permamente.

        JOptionPane.showMessageDialog(null, "Mi nombre es: " + nombres + ", tengo " + edad + " anios \n" +
                "soy " + sexo + ", mide: " + peso + " Kg");
    }
}
