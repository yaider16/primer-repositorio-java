import java.util.Scanner;

public class Taller{
    /* Aqui declaro el scanner como variable
    global porque de otra forma tendria que crear 
    varios scanners y eso seria innecesario*/
    public static Scanner sc=new Scanner(System.in);

    /*Aqui estan cada una de las operaciones en forma de método
    (Las operacion de potencia y multiplicacion estan hechas con bucles)*/
    public static int suma(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }
    public static int resta(int num1, int num2) {
        int resultado = num1 - num2;
        return resultado;
    }
    public static int mult(int num1, int num2) {
        int resultado = 0;
        for (int i = 0; i < num2; i++) {
            resultado+=num1;
        }
        return resultado;
    }
    public static float div(float num1, float num2) {
        float resultado = num1 / num2;
        return resultado;
    }
    public static int pot(int num1, int num2){
        int result =0;
        for (int i = 1; i < num2; i++) {
            result+=num1*num1;
        }
        return result;
    }
    public static void piramid(int tamano){

        for (int i = 1; i <= tamano; i++) { // Bucle para las filas
            // Espacios en blanco antes de los asteriscos
            for (int j = 1; j <= tamano - i; j++) {
                System.out.print(" ");
            }
            
            // Asteriscos
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            System.out.println(); // Salto de línea
        }

    }
    // Aqui está el menu completo de la calculadora numerica 
    public static void calculadoraNumerica(){
        
        // Creo las constantes que seran usadas para el switch
        final int SUMA = 1;
        final int RESTA = 2;
        final int MULT = 3;
        final int DIV = 4;
        final int POT =5;
        final int PIRAMID=6;
        final int salir = 0;
        
        // creo el booleano que mantiene activo un bucle y establezco a el bucle
        boolean par = true;

            while (par){
                // Imprimo el display del menu y le pido a el usuario que elija
                System.out.println("----------Calculador Numerica de Yaider-----------");
                System.out.println("1 para Suma\n2 Para resta\n3 Para multiplicar\n4 Para dividir\n5 Para potencia\n6 Para piramede de el tamaño deseado\nPara volver coloque 0");

                int desicion = sc.nextInt();
                // Si el usuario decide salir, este volvera a el menu principal. hago esto rompiendo el bucle y cambiando el booleano
                if (desicion==salir) {
                    System.out.println("Gracias por usar la Calculadora numerica De Yaider <3\n");
                    System.out.println("\n\n\n\n");
                    par = false;
                    break;
                }
                // le pido dos numeros para la operacion ya que no importa cual operacion sea, siempre necesitará dos numeros
                int num1 = 0;
                int num2 = 0;
                /*Creo el switch que en caso de la determinada 
                  operacion imprime el resultado haciendo uso de el respectivo metodo
                */
                switch (desicion){
                    case SUMA:
                        System.out.println("De dos numeros para la operacion:");
                        num1 = sc.nextInt();
                        num2 = sc.nextInt();
                        System.out.println("La suma da " + suma(num1, num2) + "\n\n\n");
                        break;
                    case RESTA:
                        System.out.println("De dos numeros para la operacion:");
                        num1 = sc.nextInt();
                        num2 = sc.nextInt();
                        System.out.println("La resta da " + resta(num1, num2) + "\n\n\n");
                        break;
                    case MULT:
                        System.out.println("De dos numeros para la operacion:");
                        num1 = sc.nextInt();
                        num2 = sc.nextInt();
                        System.out.println("La multiplicacion da " + mult(num1, num2) + "\n\n\n");
                        break;
                    case DIV:
                        System.out.println("De dos numeros para la operacion:");
                        num1 = sc.nextInt();
                        num2 = sc.nextInt();
                        System.out.println("La division da " + div(num1, num2) + "\n\n\n");
                        break;
                    case POT:
                        System.out.println("De dos numeros para la operacion:");
                        num1 = sc.nextInt();
                        num2 = sc.nextInt();
                        System.out.println("La potencia da "+ pot(num1,num2)+"\n\n\n");

                    case PIRAMID:
                        System.out.println("De el tamaño");
                        int tamaño = sc.nextInt();
                        piramid(tamaño);
                    default:
                        break;
                }}
        return;
    }
    
    // Aqui está el menu completo de la calculadora de texto con sus respectivas operaciones
    public static void calculadoraTexto(){
        // establezco las variables que usaré para el switch
        final int REPETIR = 1;
        final int CONTIENE = 2;
        final int ENCRIPTAR=3;
        final int DES_ENCRIPTAR=4;
        final int PALABRAS=5;
        final int ENCRIPTAR2=6;
        final int SALIR=0;

        // Creo el bucle que ejecutará el menu, el booleano y sus opciones
        Boolean par =true;
        while (par) {
            System.out.println("---------Calculadora de Texto de Yaider---------");
            System.out.println("1 Para saber si se repite una letra en una palabra y cuantas veces se repite");
            System.out.println("2 Para saber si un texto contiene una palabra designada");
            System.out.println("3 Para encriptar una palabra");
            System.out.println("4 Para des-encriptar una palabra deseada");
            System.out.println("5 Para saber cuantas veces está una paslabra en un texto");
            System.out.println("6 Para encriptacion de texto en base a cuatro\n0 Para volver");

            /*Pido el numero para la operación deseada y creo el switch que tiene cada operacion
              dependiendo de cual elija el usuario*/
            int des = sc.nextInt();
            // Si el usuario decide salir, este volvera a el menu principal. hago esto rompiendo el bucle y cambiando el booleano
            if (des==SALIR) {
                System.out.println("Gracias por usar la Calculadora De Texto De Yaider <3\n");
                System.out.println("\n\n\n\n");
                par = false;
                break;
                }
            // Creo el switch que contiene cada uno de las opciones del menu
            switch (des) {
                /* Tengo separado cada metodo para una mayor legibilidad */
                case REPETIR:
                    repetir();
                    System.out.println("\n\n\n");
                    break;

                case CONTIENE:
                    contiene();
                    System.out.println("\n\n\n");
                    break;

                case ENCRIPTAR:
                    encriptar();
                    System.out.println("\n\n\n");
                    break;

                case DES_ENCRIPTAR:
                    des_encriptar();
                    System.out.println("\n\n\n");
                    break;  

                case PALABRAS:
                    palabras();
                    break;
                case ENCRIPTAR2:
                    encriptar2();
                    break;
                default:
                    System.out.println("\n\n\n");
                    break;
            }
        }
    }

    public static void repetir(){
        sc.nextLine();

        // Creo un contador y pido un texto y la letra para hacer la comparación
        int count=0;
        System.out.println("De el texto y la letra a comparar");
        String texto = sc.nextLine();
        String letra = sc.nextLine();

        /* Creo un caracter que será la letra usada para la comparación */
        char letter = letra.substring(0,1).charAt(0);

        /*  Creo un array que contendrá cada uno de los caracteres del texto 
            ingresado y tendrá la longitud de este */
        char[] caracteres = new char[texto.length()];

        /* Creo un for que recorrera cada letra de el texto y la guardará en el array anteriormente creado */
        for (int i = 0; i < texto.length(); i++) {
            caracteres[i] = texto.substring(i, i+1).charAt(0);
        }
 
        /* Con este for lo que pienso hacer es recorrer cada caracter del array
         * Y compararlo con la letra que nos han dado, y si es así, a un contador sumarle uno
         */
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i]==letter) {
                    count++;
            }
        }

        // Aqui me pregunto si el contador es mayor a 0, Y si es asi imprimo que aparece y cuantas veces lo hace
        // Y si no, imprimo diciendo que no aparece
        if (count>0) {
            System.out.println(letter+" aparece "+count+" veces");
        }
        else{
            System.out.println(letter+" No se repite en esta palabra");
        }
    }
    public static void contiene(){
        sc.nextLine();
        // Le pido el texto y la palabra para la comparación
        System.out.println("Ingrese una un texto y una palabra para saber si se encuentra dentro del texto");
        String texto = sc.nextLine();
        String palabra = sc.nextLine();

        /*Creo un int que será el que me va a decir si se encuentra o no la palabra
        valdrá 0 si no está y valdrá 1 si se encuentra */
        int saber =0;

        // Se usa la resta de la longitud de los textos para evitar errores al momento de coger subcadenas
        // este recoge hasta cuando el minimo posible de hacer un substring de la longitud de la palabra 
        for (int i = 0; i <= texto.length()-palabra.length(); i++) {

            // Hago un substring que va desde i hasta la longitud de la palabra
            String sub = texto.substring(i, i+palabra.length());
            
            /*Comparo su el substring sacado es igual a la palabra. Si es asi imprimo en pantalla que si se encuentra
                Sino digo que no está
                Me veo en la obligación de usar el metodo .equals() porque al usar el == se analiza la referencia
                En cambio el .equals() analiza es el contenido de un string y no su espacio en memoria*/
            if (sub.equals(palabra)) {
                saber=1;
                break;
            }
        }

        if (saber==1) {
            System.out.println(palabra+" Se encuentra dentro del texto ;)");
        }else{
            System.out.println(palabra+" No se encuentra dentro del texto");
        }


    }
    public static void encriptar(){
        sc.nextLine();
        System.out.println("Escriba la palabra que desea encriptar");
        String palabra = sc.nextLine();

        /*Al hacer el ejercicio e investigar, me di cuenta de que las comilla simples 
        a diferencia de las dobles, sirven para representar un caracter
        Ademas tambien descubrí que las letras tienen tamaños, esto quiere decir que la "a" es mas pequeña que la "X" 
        con esto en mente desarrollé un ciclo for que las organiza en un array*/
        char[] abc = new char[27];
        int count =0;
        
        // Creo un for que va ir desde la a hasta la z sin contar la ñ, uso un contador y añado en su posicion el valor de i
        // que es la de la posicion de la letra
        for (char i = 'a'; i <= 'z'; i++) {
            abc[count] = i;
            count++;
        }
        //  Creo el string donde guardaré la palabra encriptada
        String palabraFinal = "";

        /* Creo un for que va a recorrer todas la letras de la palabra indicada
         Tambien creo un substring que va a recoger cada una de las letras de la palabra*/
        for (int i = 0; i < palabra.length(); i++) {

            String caracter = palabra.substring(i, i+1);

            /*Creo otro for dentro del anterior que se encargará de pasar por cada una de las
              letras del abcedario, creo un char letra que será su posicion en j de la letra */

            for (int j = 0; j <= abc.length-1; j++) {
                char letra = abc[j];

                // Convierto la letra de la palabra en char para la comparacion
                char letraPalabra = caracter.charAt(0);

                /* Me pregunto que si la letra de la palabra es igual a la letra del abecedario del momento
                   Y si la posicion j de la letra mas la logintud de la palabra en menor a la cantidad 
                   de letras del abecedario.
                   
                    Si es asi, a la palabraFinal le sumo la letra de la posicion j más la longitud de la palabra.
                    Ejem: Si la letra fuera la "A" y la palabra tuviera longitud 5, Esta se movería 5 posiciones
                    y terminaría siendo la "F"
                   */
                if (letraPalabra==letra && j+palabra.length()<abc.length-1) {
                    palabraFinal+=abc[j+palabra.length()];
                }

                /* Si lo anterior no se cumple, pregunto si ademas de ser iguales, la posicion en j más
                 la longitud de la palabra es mayor o igual a la cantidad de letras del abecedario*/
                else if (letraPalabra==letra && j+palabra.length()>=abc.length-1) {
                    // Aqui lo que hago es usar un formula que dice lo siguiente:

                    /*La posicion de la palabra en j más la longitud de la palabra.
                     * Todo eso lo divido entre la cantidad de letras del abecedario y recojo el residuo.
                     * Ese residuo será la posicion en la que quedará el valor a determinar.
                     * 
                     * Ejem: Si la letra fuera "w" y la palabra tuviera 6 letras, quedaria asi.
                     * (22+6)/26 luego con el modulo lo que se hace es recoger el residuo de esa divisio
                     * dando como resultado 2. Entonces la letra se moveria 3 espacios porque contamos el 0 como uno.
                     */
                    palabraFinal+=abc[(j+palabra.length())%(abc.length-1)];
                }
            }
        }

        System.out.println("La palabra encriptada es "+palabraFinal);

    }
    public static void des_encriptar(){
        sc.nextLine();
        System.out.println("Ingrese la palabra a des-encriptar");
        String palabra = sc.nextLine();

        char[] abc = new char[27];
        int count =0;
        
        // Creo un for que va ir desde la a hasta la z sin contar la ñ, uso un contador y añado en su posicion el valor de i
        // que es la de la posicion de la letra
        for (char i = 'a'; i <= 'z'; i++) {
            abc[count] = i;
            count++;
        }

        // Creé la palabraFinal que será donde se sumen
        String palabraFinal = "";

        // creo un for que irá hasta la longitud de la palabra evaluando cada letra de esta
        for (int i = 0; i < palabra.length(); i++){

            //saco cada caracter de la palabra con un substring
            String caracter = palabra.substring(i, i+1);

            // Lo convierto a caracter con charAt
            char letraPalabra = caracter.charAt(0);

            // Creo otro for que pasara por todo el array del abecedario
            for (int j = 0; j < abc.length-1; j++) {
                // Saco la posicion j de la letra en el abecedario
                char letra = abc[j];
                /* Me pregunto si la letra es igual a la del caracter y ademas la resta de la posicion
                 * j con la longitud de la palabra es mayor o igual a 0.
                 * Si es asi añado a la palabra final la resta de la posicion j con la longitud de la palabra
                */
                if (letraPalabra==letra && j-palabra.length()>=0) {
                    palabraFinal+=abc[j-palabra.length()];
                }
                
                /* Aqui me pregunto si la resta de estos es menor a 0.
                 Si si es así, cambio la formula original que tenia en la de encriptacion
                 Por su contrario */
                else if (letraPalabra==letra && j-palabra.length()<0) {
                    palabraFinal+=abc[(j-palabra.length())+(abc.length-1)];
                }
            }
        }
        System.out.println("La palabra des-encriptada es "+ palabraFinal);
    }
    public static void palabras(){
        sc.nextLine();
        // Le pido el texto y la palabra para la comparación
        System.out.println("Ingrese una un texto y una palabra para saber si se encuentra dentro del texto");
        String texto = sc.nextLine();
        String palabra = sc.nextLine();
        int count=0;
        /*Creo un int que será el que me va a decir si se encuentra o no la palabra
        valdrá 0 si no está y valdrá 1 si se encuentra */
        int saber =0;

        // Se usa la resta de la longitud de los textos para evitar errores al momento de coger subcadenas
        // este recoge hasta cuando el minimo posible de hacer un substring de la longitud de la palabra 
        for (int i = 0; i <= texto.length()-palabra.length(); i++) {

            // Hago un substring que va desde i hasta la longitud de la palabra
            String sub = texto.substring(i, i+palabra.length());
            
            /*Comparo su el substring sacado es igual a la palabra. Si es asi imprimo en pantalla que si se encuentra
                Sino digo que no está
                Me veo en la obligación de usar el metodo .equals() porque al usar el == se analiza la referencia
                En cambio el .equals() analiza es el contenido de un string y no su espacio en memoria*/
            if (sub.equals(palabra)) {
                saber=1;
                count++;
            }
        }

        if (saber==1) {
            System.out.println(palabra+" Se encuentra dentro del texto "+count+" veces"); 
        }else{
            System.out.println(palabra+" No se encuentra dentro del texto");
        }
    }
    public static void encriptar2(){
        sc.nextLine();
        char[] abc = new char[27];
        int count =0;
        // Creo un for que va ir desde la a hasta la z sin contar la ñ, uso un contador y añado en su posicion el valor de i
        // que es la de la posicion de la letra
        for (char i = 'a'; i <= 'z'; i++) {
            abc[count] = i;
            count++;
        }   
        
        
        System.out.println(" De la palabra y los cuatro numeros");
        String palabra=sc.nextLine();
        String palabraFinal = "";
        int movimiento =0;
        for (int i = 1; i <= 4; i++) {
            System.out.println("De el numero "+i);
            int num=sc.nextInt();
            movimiento +=num;

            for(int h=0;h<palabra.length();h++){

                for (int j = 0; j < abc.length; j++) {
        
                    if (j+movimiento<abc.length-1 && palabra.charAt(h)==abc[j]) {
                        palabraFinal+=abc[j+movimiento];
                    }
                    
                    else if(j+palabra.length()>=abc.length-1 && palabra.charAt(h)==abc[j]){
                        palabraFinal+=abc[(j+movimiento)%(abc.length-1)];
                    }
                }
            }
            System.out.println("La palabra encriptada es "+ palabraFinal);
            palabraFinal="";
        }



    }

    public static void main(String[] args) {
        // Creo el booleano siga para mantener el bucle y creo las constantes para la seleccion del menú
        Boolean siga = true;
        final int NUMERICA = 1;
        final int TEXTO=2;
        final int salir =0;

        /* Establezco el bucle con el menú para seleccionar si será la numerica o de texto
        Y utilizo un switch para que se aplique sea el caso numerica o de texto, mostrando cada una sus*/
        while (siga) {
            System.out.println("\n\n\n\n\n\n\n\n");
            System.out.println("-----Bienvenido al menú de calculadora de Yaider :)-----");
            System.out.println("1 Para calculadora númerica\n2 Para calculadora de texto\n0 Para salir");
            // Pido un numero para la decision y uso un if por si quiere salir de la aplicacion
            int des = sc.nextInt();
            System.out.println("\n\n\n\n");
            if (des==salir) {System.out.println("Gracias por usar la calculadora"); siga=false;}
           
            // Uso el switch para usar ya sea la calculadora numerica o de texto
            switch (des) {
                case NUMERICA:
                    calculadoraNumerica();
                    System.out.println("\n\n\n\n");
                    break;
               
                case TEXTO:
                    calculadoraTexto();
                    System.out.println("\n\n\n\n");
                default:
                    break;
            }}
            // Cuando acaba el ciclo cierro el escaner global
            sc.close();
            sc.reset();
    }
}
