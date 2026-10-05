import java.util.Scanner;

public class CopiarCadena {

    public static String copiar(String cadena, int posicion) {

        if (posicion == cadena.length()) {
            return "";
        }

        return cadena.charAt(posicion)
                + copiar(cadena, posicion + 1);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = teclado.nextLine();

        String copia = copiar(cadena, 0);

        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena copiada: " + copia);

        teclado.close();
    }
}