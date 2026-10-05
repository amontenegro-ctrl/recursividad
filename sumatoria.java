import java.util.Scanner;

public class sumatoria {

    public static int sumatoria(int n) {

        if (n == 0) {
            return 0;
        }

        return n + sumatoria(n - 1);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int n = teclado.nextInt();

        if (n < 0) {
            System.out.println("Ingrese un numero positivo.");
        } else {
            System.out.println("La sumatoria es: "
                    + sumatoria(n));
        }

        teclado.close();
    }
}