import java.util.Scanner;

public class Multiplicacion {

    public static int multiplicar(int a, int b) {

        if (b == 0) {
            return 0;
        }

        return a + multiplicar(a, b - 1);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int a = teclado.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int b = teclado.nextInt();

        int signo = 1;

        if (b < 0) {
            signo = -1;
            b = Math.abs(b);
        }

        int resultado = multiplicar(a, b) * signo;

        System.out.println("El resultado es: " + resultado);

        teclado.close();
    }
}