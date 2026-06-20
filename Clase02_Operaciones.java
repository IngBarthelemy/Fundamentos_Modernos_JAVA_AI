public class Clase02_Operaciones {

    public static void main(String[] args) {

        // ! Suma
        int a = 5;
        int b = 10;
        int suma = a + b;
        System.out.println("La suma de " + a + " y " + b + " es: " + suma);

        // ! Resta
        int resta = b - a;
        System.out.println("La resta de " + b + " y " + a + " es: " + resta);

        // ! Multiplicación
        int multiplicacion = a * b;
        System.out.println("La multiplicación de " + a + " y " + b + " es: " + multiplicacion);

        // ! División
        int division = b / a;
        double division2 = division; // Conversión implícita de int a double
        System.out.println("La división de " + b + " entre " + a + " es: " + division2);

        // ! Módulo
        int modulo = b % a;
        System.out.println("El módulo de " + b + " entre " + a + " es: " + modulo);

    }
}
