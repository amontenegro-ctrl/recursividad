import java.util.Scanner;

public class MCD {

    public static int mcd(int m, int n) {

        if (n == 0) {
            return m;
        }

        return mcd(n, m % n);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int m = teclado.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int n = teclado.nextInt();

        m = Math.abs(m);
        n = Math.abs(n);

        System.out.println("El MCD es: " + mcd(m, n));

        teclado.close();
    }
}