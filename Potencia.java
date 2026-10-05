import java.util.Scanner;

public class Potencia {

    public static long potencia(int base, int exponente) {

        if (exponente == 0) {
            return 1;
        }

        return base * potencia(base, exponente - 1);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        int base = teclado.nextInt();

        System.out.print("Ingrese el exponente: ");
        int exponente = teclado.nextInt();

        if (exponente < 0) {
            System.out.println("Ingrese un exponente positivo.");
        } else {
            System.out.println("Resultado: "
                    + potencia(base, exponente));
        }

        teclado.close();
    }
}