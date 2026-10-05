import java.util.Scanner;

public class InvertirNumero {

    public static int invertir(int numero, int invertido) {

        if (numero == 0) {
            return invertido;
        }

        return invertir(numero / 10,
                        invertido * 10 + numero % 10);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = teclado.nextInt();

        int resultado = invertir(Math.abs(numero), 0);

        if (numero < 0) {
            resultado = -resultado;
        }

        System.out.println("Numero invertido: " + resultado);

        teclado.close();
    }
}