import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1)
                + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el limite de la serie: ");
        int limite = teclado.nextInt();

        if (limite < 0) {

            System.out.println("El limite debe ser positivo.");

        } else {

            System.out.println("Serie de Fibonacci:");

            for (int i = 0; i <= limite; i++) {

                System.out.print(fibonacci(i) + " ");
            }

            System.out.println();
        }

        teclado.close();
    }
}