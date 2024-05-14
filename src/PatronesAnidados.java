import java.util.Scanner;

public class PatronesAnidados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número de filas que quieres que tenga el patrón: ");
        int n = scanner.nextInt();

        System.out.println("Patrón 1:");
        patron1(n);

        System.out.println("Patrón 2:");
        patron2(n);

        System.out.println("Patrón 3:");
        patron3(n);

        System.out.println("Patrón 4:");
        patron4(n);
    }

    public static void patron1(int n) {
        for (int i = 1; i <= n; i++) {
            // En la primera y la última fila se imprimen todos los asteriscos
            if (i == 1 || i == n) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
                // En las filas intermedias solo se imprimen los asteriscos de los extremos
            } else {
                System.out.print("*");
                for (int j = 1; j < n - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patron2(int n) {
        for (int i = 1; i <= n; i++) {
            // En la primera y la última fila se imprimen todos los astericos
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
                // En las filas intermedias se imprime un asterisco en posición diagonal decreciente
            } else {
                for (int j = 1; j <= n; j++) {
                    // Se imprime el asterisco en la diagonal
                    if (j == n - i + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void patron3(int n) {
        // Bucle para las filas
        for (int i = 1; i <= n; i++) {
            // Bucle para las columnas de la fila en la que se encuentra
            for (int j = 1; j <= n; j++) {
                // Se imprime una x en dos casos:
                // 1. Primera diagonal : Cuando se está en la misma posision en la fila y columna como fila 1 columna 1
                // 2. Segunda diaginal: Desde la esquina superior derecha a la esquina inferior izquierda
                if (j == i || j == n - i + 1) {
                    System.out.print("x");
                } else {
                    //Si no se está en las diagonales se imprime un espacio
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void patron4(int n) {
        if (n == 1) {
            // Si n es 1 se imprime solo un asterisco
            System.out.println("*");
            // Se finaliza la ejecución del método después de imprimir el asterisco
            return;
        }

        // Se imprime la primera fila con n-1 asteriscos
        for (int i = 0; i < n - 1; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Se imprimen las filas intermedias con un espacio antes de los asteriscos
        // Solo si n es mayor que 2 hay filas intermedias
        if (n > 2) {
            for (int i = 2; i < n; i++) {
                // Se considera un espacio antes del inicio
                System.out.print(" ");
                // Se imprimen n-2 asteriscos para filas intermedias
                for (int j = 0; j < n - 2; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        // Se imprime la última fila con n-1 asteriscos con un espacio al principio
        // Se verifica que hay al menos dos filas
        if (n > 1) {
            // Se deja un espacio antes del inicio
            System.out.print(" ");
            // Se imprime n-1 asteriscos
            for (int i = 0; i < n - 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}





