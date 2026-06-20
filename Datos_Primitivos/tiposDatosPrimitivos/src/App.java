
//Importa la clase Scanner
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // Declara los datos o las variables primitivas.
        int edad;
        char sexo;
        boolean matrimonio;
        double peso;
        String nombres;
        // Define la clase Scanner para pedir o escanear datos desde el teclado.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa su nombre, por favor. ");
        nombres = entrada.nextLine();

        System.out.println("Cual es su edad?");
        edad = entrada.nextInt();

        System.out.println("Cual es su sexo");
        sexo = entrada.next().charAt(0);

        System.out.println("Ingresa su matrimonio, por favor");
        matrimonio = entrada.nextBoolean();

        System.out.println("Ingresa su peso");
        peso = entrada.nextDouble();

        System.out.println("Mi nombre es: " + nombres + "\n" +
                "tengo " + edad + " anios \n" + " mide " + peso + "Kg  " + " soy " + sexo + " y  Casado " + matrimonio);
    }
}
