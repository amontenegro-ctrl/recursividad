import java.util.Scanner;

public class Factorial {

    public static long factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int n = teclado.nextInt();

        if (n < 0) {
            System.out.println("El factorial no existe para numeros negativos.");
        } else {
            System.out.println("El factorial de " + n + " es: "
                    + factorial(n));
        }

        teclado.close();
    }
}