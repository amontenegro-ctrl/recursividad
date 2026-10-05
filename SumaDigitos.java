import java.util.Scanner;

public class SumaDigitos {

    public static int sumaDigitos(int numero) {

        numero = Math.abs(numero);

        if (numero < 10) {
            return numero;
        }

        return (numero % 10) + sumaDigitos(numero / 10);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = teclado.nextInt();

        System.out.println("La suma de los digitos es: "
                + sumaDigitos(numero));

        teclado.close();
    }
}