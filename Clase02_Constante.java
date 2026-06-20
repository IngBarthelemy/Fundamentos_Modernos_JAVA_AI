public class Clase02_Constante {
    public static void main(String[] args) {
        // Se definen las constantes con la palabra reservada final, el tipo de dato y
        // el nombre de la constante en mayuscula.
        final double PI = 3.1416;
        final String NOMBRE = "Juan";
        final boolean CASADO = true;
        final char SEXO = 'M';

        System.out.println("El valor de PI es: " + PI);
        System.out.println("El nombre es: " + NOMBRE);
        System.out.println("¿Está casado? " + CASADO);
        System.out.println("El sexo es: " + SEXO);

        // final double PI = 3.1416;
        // Esto generará un error de compilación porque PI es una constante
    }

}
