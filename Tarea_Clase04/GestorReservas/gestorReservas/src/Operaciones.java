import java.util.Scanner;

public class Operaciones {
    static final int CUPO_MAX = 10;
    static String[] nombres = new String[CUPO_MAX];
    static int[] horas = new int[CUPO_MAX];
    static int[] codigoServicio = new int[CUPO_MAX];
    static int contador = 0;

    public static void agendar(Scanner sc) {
        if (contador == CUPO_MAX) {
            System.out.println("Agenda llena. No se pueden agendar mas reservas.");
            return;
        }

        System.out.print("Nombre del cliente: ");
        String nombre = sc.nextLine();
        if (!Validador.nombreValido(nombre)) {
            System.out.println("El nombre no puede estar vacio.");
            return;
        }

        System.out.print("Hora (8-17): ");
        int hora = sc.nextInt();
        sc.nextLine();
        if (!Validador.horaValida(hora)) {
            System.out.println("Hora invalida. Debe ser entre 8 y 17.");
            return;
        }

        boolean ocupada = false;
        for (int i = 0; i < contador; i++) {
            if (horas[i] == hora) {
                ocupada = true;
            }
        }

        if (ocupada) {
            System.out.println("Esa hora ya esta ocupada. Elige otra.");
            return;
        }

        System.out.print("Servicio (1 = Corte, 2 = Tinte, 3 = Manicure): ");
        int servicio = sc.nextInt();
        sc.nextLine();
        if (!Validador.servicioValido(servicio)) {
            System.out.println("Servicio invalido. Debe ser 1, 2 o 3.");
            return;
        }

        nombres[contador] = nombre;
        horas[contador] = hora;
        codigoServicio[contador] = servicio;
        contador++;
        System.out.println("Reserva agendada correctamente.");

    }

    public static String nombreServicio(int codigo) {
        switch (codigo) {
            case 1:
                return "Corte";
            case 2:
                return "Tinte";
            case 3:
                return "Manicure";
            default:
                return "Desconocido";
        }
    }

    public static void Listar() {
        if (contador == 0) {
            System.out.println("Aun no hay reservas registradas.");
            return;
        }
        System.out.println("--- RESERVAS DEL DIA ---");
        for (int i = 0; i < contador; i++) {
            System.out.println((i + 1) + ".  Nombre del cliente: " + nombres[i]
                    + " | hora: " + horas[i] + ":00"
                    + " | servicio: " + nombreServicio(codigoServicio[i]));
            System.out.println("-------------------------------------------------------------");
        }
    }

    public static void cancelar(Scanner sc) {
        if (contador == 0) {
            System.out.println("Aun no hay reservas registradas.");
            return;
        }

        Listar();
        System.out.print("Numero de reserva a cancelar: ");
        int pos = sc.nextInt();
        sc.nextLine();

        if (pos < 1 || pos > contador) {
            System.out.println("Ese numero no existe en la agenda.");
            return;
        }

        int indice = pos - 1;

        for (int i = indice; i < contador - 1; i++) {
            nombres[i] = nombres[i + 1];
            horas[i] = horas[i + 1];
            codigoServicio[i] = codigoServicio[i + 1];
        }

        contador--;
        System.out.println("Reserva cancelada correctamente.");
    }

    public static void reporte() {
        if (contador == 0) {
            System.out.println("Aun no hay reservas registradas.");
            return;
        }

        double totalFacturado = 0;

        for (int i = 0; i < contador; i++) {
            totalFacturado += precioServicio(codigoServicio[i]);
        }

        System.out.println("Total de citas: " + contador);
        System.out.println("Total facturado: $" + totalFacturado);
    }

    public static double precioServicio(int codigo) {
        switch (codigo) {
            case 1:
                return 25000;
            case 2:
                return 60000;
            case 3:
                return 30000;
            default:
                System.out.println("Codigo de servicio invalido: " + codigo);
                return -1.0;
        }
    }
}
