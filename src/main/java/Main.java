import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== PATRONES CREACIONALES =====");
            System.out.println("1. Ejecutar Abstract Factory");
            System.out.println("2. Ejecutar Builder");
            System.out.println("3. Ejecutar Prototype");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\nEjecutando Abstract Factory...\n");
                    abstractFactory.Main.main(new String[]{});
                    break;
                case 2:
                    System.out.println("\nEjecutando Builder...\n");
                    builder.Main.main(new String[]{});
                    break;
                case 3:
                    System.out.println("\nEjecutando Prototype...\n");
                    prototype.Main.main(new String[]{});
                    break;
                case 4:
                    System.out.println("\nSaliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("\nOpción no válida, intenta de nuevo.");
            }
        }
    }
}
