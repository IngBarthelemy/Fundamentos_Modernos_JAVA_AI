import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            Menu.mostrar();
            opcion = Menu.leerOpcion(sc);

            switch (opcion) {
                case 1:
                    Operaciones.agendar(sc);
                    break;

                case 2:
                    Operaciones.Listar();
                    break;

                case 3:
                    Operaciones.cancelar(sc);
                    break;

                case 4:
                    Operaciones.reporte();
                    break;

                case 5:
                    System.out.println("Gracias por usar el Gestor de Reservas.");
                    break;

                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
