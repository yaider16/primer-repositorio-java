import java.util.Calendar;
import java.util.Scanner;

public class encriptado2 {

    public static String[] abc = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
                                    "q","r", "s", "t", "u", "v", "w", "x", "y", "z" };
 
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        boolean sigue = true;
        while (sigue) {

            System.out.println("-----------Encriptador--------\n1 para encriptar\n2 para desencriptar\n0 para salir");
            int des = sc.nextInt();

            if (des == 0) {
                sigue = false;
                break;
            } else {
                sc.nextLine();
                //
                System.out.println("Dé la palabra");
                String palabra = sc.nextLine();

                String palabraEncriptada = encriptador(palabra, des);

                System.out.println(palabraEncriptada);
            }
        }
        sc.close();
    }

    public static String encriptador(String palabra, int encriptar) throws InterruptedException {
        String palabraEncriptada = "";

        Calendar fecha = Calendar.getInstance();
        int minuto = fecha.get(Calendar.MINUTE);

        System.out.println("Espere un momento");

        for (int i = 0; i < 3; i++) {
            String puntos = "...";
            Thread.sleep(500);
            System.out.println(puntos.charAt(i));
        }

        for (int i = 0; i < palabra.length(); i++) {
            String letra = palabra.substring(i, i + 1);
            int posicion = obtenerPosicion(letra);
            int nuevaPosicion = 0;

            if (encriptar == 1) {
                nuevaPosicion = (minuto) + posicion;
            } else {
                nuevaPosicion = (posicion) - minuto;
            }

            int posicionFinal = movimiento(nuevaPosicion);

            palabraEncriptada += abc[posicionFinal];
            // palabraEncriptada+=abc[nuevaPosicion];
        }
        return palabraEncriptada;
    }

    public static int obtenerPosicion(String letra) {

        int pos = 0;

        for (int i = 0; i < abc.length; i++) {
            if (abc[i].equals(letra)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static int movimiento(int nuevaPosicion) {
        int posicionFinal = 0;

        while (nuevaPosicion > abc.length - 1) {
            nuevaPosicion -= abc.length;
        }
        while (nuevaPosicion < 0) {
            nuevaPosicion += abc.length;
        }

        posicionFinal = nuevaPosicion;

        return posicionFinal;
    }
}