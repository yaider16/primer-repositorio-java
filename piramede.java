import java.util.Scanner;

public class piramede {
    // Main. Donde se ejecuta la aplicación 
    public static void main(String[] args) {
        // Creo el escaner para pedir el número
        Scanner sc = new Scanner(System.in);

        // Pido el número
        System.out.println("-------Yaidamede--------\nIngrese el número de tamaño de la piramede");
        int tamano = sc.nextInt();
        System.out.println("\n");

        // Ejecuto la función y cierro el escaner
        piramedes(tamano);

        // No pienso agregar más funcionalidades si no me pagan más 
        System.out.println("Para más funcionalidades considere pagar una cantidad superior");
        sc.close();
    }

    // Función en donde se ejecuta la piramede
    public static void piramedes(int tamano) {

        // Creo el sting donde guardo los asteriscos e inicia con uno solo
        String puntos = "*";

        // Este primer for imprime la primera mitad de los asteriscos
        for (int i = 0; i < tamano; i++) {
            System.out.println(puntos);
            puntos += "*";
        }

        // Este otro la segunda mitad, y empieza desde el anterior para no imprimir de
        // nuevo el mas alto
        for (int i = tamano - 1; i > 0; i--) {

            // Coge lo que ya había empezando desde 0 hasta el valor de i
            String puntos2 = puntos.substring(0, i);

            // Lo imprime
            System.out.println(puntos2);
        }

    }
}
