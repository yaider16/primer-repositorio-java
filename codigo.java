public class codigo{
    public static void main(String[] args) {

        //------------CODIGO DE YAIDER-----------
        String texto = "asdasfsdkgndfjgdfsdffg";
        String pal = "fsd";
        System.out.println(buscarPalabra(texto, pal));  
    }
    public static Boolean buscarPalabra(String texto,String palabra){

        // Creo u booleano que sera quien me diga si está o no la palabra
        Boolean encontrado = false;

        // Saco la longitud de el texto, la palabra y uso un contador para saber posiciones
        int longTexto = texto.length();
        int count =0;
        int longPalabra = palabra.length();

        // Establezco un while que ira desde 0 hasta la resta de la longitud del texto con la palabra
        // Esto es para que no de error
        while (count<longTexto-longPalabra) {

            // Saco un substring que tendrá la longitud de la palabra
            String palabrita = texto.substring(count, count+longPalabra);

            // Comparo si la palabra está, y si sí esta cambio el boolean y cierro el bucle
            if (palabra.contains(palabrita)) {
                encontrado = true;
                break;
            }

            // Sumo uno al contador para seguir el bucle 
            count++;
        }
        // Returno el boolean
        return encontrado;

    }
}