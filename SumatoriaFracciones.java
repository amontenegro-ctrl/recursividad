import java.util.Scanner;

public class SumatoriaFracciones {

    public static double sumatoria(int n) {

        if (n == 1) {
            return 1.0;
        }

        return (1.0 / n) + sumatoria(n - 1);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int n = teclado.nextInt();

        if (n <= 0) {
            System.out.println("El numero debe ser mayor que cero.");
        } else {
            System.out.println("Resultado: " + sumatoria(n));
        }

        teclado.close();
    }
}