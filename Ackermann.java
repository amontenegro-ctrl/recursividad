import java.util.Scanner;

public class Ackermann {

    public static int ackermann(int m, int n) {

        if (m == 0) {
            return n + 1;
        }

        if (m > 0 && n == 0) {
            return ackermann(m - 1, 1);
        }

        return ackermann(
                m - 1,
                ackermann(m, n - 1)
        );
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el valor de m: ");
        int m = teclado.nextInt();

        System.out.print("Ingrese el valor de n: ");
        int n = teclado.nextInt();

        if (m < 0 || n < 0) {

            System.out.println(
                    "Los valores deben ser positivos.");

        } else {

            System.out.println(
                    "Ackermann(" + m + ", " + n + ") = "
                    + ackermann(m, n));
        }

        teclado.close();
    }
}