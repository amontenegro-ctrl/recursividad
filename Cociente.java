import java.util.Scanner;

public class Cociente {

    public static int cociente(int dividendo, int divisor) {

        if (dividendo < divisor) {
            return 0;
        }

        return 1 + cociente(dividendo - divisor, divisor);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        int dividendo = teclado.nextInt();

        System.out.print("Ingrese el divisor: ");
        int divisor = teclado.nextInt();

        if (divisor == 0) {
            System.out.println("No se puede dividir entre cero.");
        } else if (dividendo < 0 || divisor < 0) {
            System.out.println("Ingrese numeros positivos.");
        } else {
            System.out.println("El cociente es: "
                    + cociente(dividendo, divisor));
        }

        teclado.close();
    }
}