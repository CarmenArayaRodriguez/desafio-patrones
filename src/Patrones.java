import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número de caracteres que quieres que tenga el patrón: ");
        int n = scanner.nextInt();

        // Patrón 1
        System.out.println("Patrón 1:");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print("*");
            } else {
                System.out.print(".");
            }
        }
        // Nueva línea
        System.out.println();

        // Patrón 2
        System.out.println("Patrón 2:");
        for (int i = 0; i < n; i++) {
            System.out.print((i % 4) + 1);
        }

        System.out.println();

        // Patrón 3
        System.out.println("Patrón 3:");
        int grupoCompleto = n / 3;
        int residuoGrupo = n % 3;

        // Se imprimen los grupos completos de "||*"
        for (int i = 0; i < grupoCompleto; i++) {
            System.out.print("||*");
        }

        // Se imprimen los caracteres restantes según el residuo
        if (residuoGrupo == 1) {
            System.out.print("|");
        } else if (residuoGrupo == 2) {
            System.out.print("||");
        }

        System.out.println();
    }
}
