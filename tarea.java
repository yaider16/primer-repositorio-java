import java.util.Scanner;

public class tarea {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion = 0;        
        while (opcion != 3){
            System.out.println("---- Calcular ----");
            System.out.println("1. Calculadora numérica");
            System.out.println("2. Calculadora de texto");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();

            final int NUMERICA=1;
            final int TEXTO=2;
            final int SALIR=3;

            switch (opcion) {
                case NUMERICA:
                    calculadoraNumerica();
                    break;
                case TEXTO:
                    calculadoraTexto();
                    break;
                case SALIR:
                    System.out.println("Saliendo");
                    opcion=3;
                    break;
                default:
                    break;
            }
        }
    }

    public static void calculadoraNumerica(){
        int opcion = 0;
        while (opcion != 6){
            System.out.println("---- CALCULADORA DE NUMEROS ----");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    Suma();
                    break;
                case 2:
                    Resta();
                    break;
                case 3:
                    Multiplicacion();
                    break;
                case 4:
                    Division();
                    break;
                case 5:
                    Potencia();
                    break;
                case 6:
                    System.out.println("ok");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
    public static void Suma() {
        System.out.print("Ingrese el primer número: ");
        int num1 = teclado.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = teclado.nextInt();
        int resultado = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);
    }
    public static void Resta() {
        teclado.nextLine();
        System.out.print("Ingrese el primer número: ");
        int num1 = teclado.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = teclado.nextInt();
        int resultado = num1 - num2;
        System.out.println("El resultado de la resta es: " + resultado);
    }
    public static void Multiplicacion() {
        teclado.nextLine();

        System.out.print("Ingrese el primer número: ");
        int num1 = teclado.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = teclado.nextInt();
        int resultado =0;
        for (int i = 0; i < num2; i++) {
            resultado+=num1;
        }
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
    public static void Division() {
        teclado.nextLine();
        System.out.print("Ingrese el primer número: ");
        int num1 = teclado.nextInt();
        System.out.print("Ingrese el segundo número: ");
        float num2 = teclado.nextInt();
        if (num2 == 0) {
            System.out.println("No se puede dividir por cero");
        } else {
            double resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        }
    }
    public static void Potencia() {
        teclado.nextLine();

        System.out.print("Ingrese la base: ");
        int num1 = teclado.nextInt();
        System.out.print("Ingrese el exponente: ");
        int num2 = teclado.nextInt();
        int resultado =0;
        for (int i = 1; i < num2; i++) {
            resultado+=num1*num1;
        }
        System.out.println("El resultado de la potencia es: " + resultado);
    }

    public static void calculadoraTexto(){
        int op= 0;
        while (op != 5){
            final int VECESLETRA = 1;
            final int VALIDARLETRA = 2;
            final int ENCRIPTAR=3;
            final int DESENCRIPTAR=4;

            System.out.println("Calculadora de Texto");
            System.out.println("1. Calcular veces que se encuentra una letra ingresada en un texto ingresado");
            System.out.println("2. Validar si un texto ingresado contiene una palabra ingresada");
            System.out.println("3. Encriptar una palabra");
            System.out.println("4. Desencriptar una palabra");
            System.out.println("5. Volver al menú");
            System.out.print("Elija una opción: ");

            op = teclado.nextInt();

            switch (op) {
                case VECESLETRA:
                    calcularVecesLetra();
                    break;
                case VALIDARLETRA:
                    validarPalabra();
                    break;
                case ENCRIPTAR:
                    encriptarPalabra();
                    break;
                case DESENCRIPTAR:
                    desencriptarPalabra();
                    break;
                case 5:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
            System.out.println();
        }
    }
    public static void calcularVecesLetra() {
        teclado.nextLine();

        System.out.println("Ingrese un texto:");
        String text = teclado.nextLine();
        System.out.println("Ingrese una letra:");
        String letter = teclado.nextLine();

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.substring(i, i+1)==letter.substring(1)) {
                count++;
            }
        }
        System.out.println("La letra " + letter + " aparece " + count + " veces en el texto.");
    }
    public static void validarPalabra(){
        teclado.nextLine();

        System.out.println("Ingrese un texto:");
        String text = teclado.nextLine();
        System.out.println("Ingrese una palabra:");
        String palabra = teclado.nextLine();

        // El contains es para saber si lo tiene o no dentro de sí
        boolean contains = text.contains(palabra);

        if (contains) {
            System.out.println("El texto tiene la palabra " + palabra + ".");
        } else {
            System.out.println("El texto no tiene la palabra " + palabra + ".");
        }
    }
    public static void desencriptarPalabra(){
        teclado.nextLine();
        System.out.println("Ingrese palabra a desencriptar: ");

        String palabraDesencriptada = "";
        String palabra = teclado.nextLine();
        char[] abecedario= new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        // Recorremos cada letra de la palabra
        for(int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            int posicion = -1;
            
            // Buscamos la posición de la letra en el abecedario
            for(int j = 0; j < abecedario.length; j++) {
                if(abecedario[j] == letra) {
                    posicion = j;
                    break;
                }
            }
            
            if(posicion != -1) {
                int nuevaPosicion = (posicion - palabra.length() + abecedario.length) % abecedario.length; // Sumamos la longitud del array para evitar valores negativos
                char letraDesencriptada = abecedario[nuevaPosicion];
                palabraDesencriptada += letraDesencriptada;
            } else {
                // Si la letra no se encuentra en el abecedario, se añade tal cual
                palabraDesencriptada += letra;
            }
        }
        System.out.println("La palabra desencriptada es: "+ palabraDesencriptada);
    }
    public static void encriptarPalabra(){
        teclado.nextLine();
        String palabraEncriptada = "";
        System.out.println("De una palabra para encriptar");
        String palabra = teclado.nextLine();
        char[] abecedario= new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        // Recorremos cada letra de la palabra
        for(int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            int posicion = -1;
            
            // Buscamos la posición de la letra en el abecedario
            for(int j = 0; j < abecedario.length; j++) {
                if(abecedario[j] == letra) {
                    posicion = j;
                    break;
                }
            }
            
            if(posicion != -1) {
                int nuevaPosicion = (posicion + palabra.length()) % abecedario.length; // Si supera la z, da la vuelta
                char letraEncriptada = abecedario[nuevaPosicion];
                palabraEncriptada += letraEncriptada;
            } else {
                // Si la letra no se encuentra en el abecedario, se añade tal cual
                palabraEncriptada += letra;
            }
        }
        System.out.println("la palabra encriptada es: "+palabraEncriptada);
    }
}
