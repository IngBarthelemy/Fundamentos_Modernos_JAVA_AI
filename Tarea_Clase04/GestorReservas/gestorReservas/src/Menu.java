import java.util.Scanner;

public class Menu {
    public static void mostrar() {
        System.out.println();
        System.out.println("=== GESTOR DE RESERVAS ===");
        System.out.println("1. Agendar una reserva");
        System.out.println("2. Listar todas las reservas");
        System.out.println("3. Cancelar una reserva");
        System.out.println("4. Ver el reporte del dia");
        System.out.println("5. Salir");
    }

    public static int leerOpcion(Scanner sc) {

        System.out.print("Elige una opcion: ");

        while (!sc.hasNextInt()) {
            System.out.println("Debes escribir un numero.");
            sc.nextLine();
            System.out.print("Elige una opcion: ");
        }

        int opcion = sc.nextInt();
        sc.nextLine();

        return opcion;
    }
}
