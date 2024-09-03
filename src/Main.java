import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion, opcion2;
        double vol, corr, res;

        do {
            System.out.println("MENU DE ACTIVIDADES");
            System.out.println("1. Actividad 1 (ley de ohm)");
            System.out.println("2. Actividad 2");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    do {
                        System.out.println("MENU DE LEY DE OHM");
                        System.out.println("1. Calcular voltaje");
                        System.out.println("2. Calcular corriente");
                        System.out.println("3. Calcular resistencia");
                        System.out.println("4. Salir");
                        System.out.print("Seleccione una opción: ");
                        opcion2 = scanner.nextInt();

                        switch (opcion2) {
                            case 1:
                                System.out.print("Ingrese la corriente (amperios): ");
                                corr = scanner.nextDouble();
                                System.out.print("Ingrese la resistencia (ohmios): ");
                                res = scanner.nextDouble();
                                vol = corr * res;
                                System.out.println("El voltaje es " + vol + " voltios");
                                break;
                            case 2:
                                System.out.print("Ingrese el voltaje (voltios): ");
                                vol = scanner.nextDouble();
                                System.out.print("Ingrese la resistencia (ohmios): ");
                                res = scanner.nextDouble();
                                corr = vol / res;
                                System.out.println("La corriente es " + corr + " amperios");
                                break;
                            case 3:
                                System.out.print("Ingrese el voltaje (voltios): ");
                                vol = scanner.nextDouble();
                                System.out.print("Ingrese la corriente (amperios): ");
                                corr = scanner.nextDouble();
                                res = vol / corr;
                                System.out.println("La resistencia es " + res + " ohmios");
                                break;
                            case 4:
                                System.out.println("Has salido del menú de Ley de Ohm.");
                                break;
                            default:
                                System.out.println("Opción no válida. Intente nuevamente.");
                                break;
                        }
                    } while (opcion2 != 4);
                    break;
                case 2:
                    System.out.println("Actividad 2 en desarrollo.");
                    break;
                case 3:
                    System.out.println("Has salido del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 3);

    }
}
