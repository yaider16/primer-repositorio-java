import java.util.Scanner;

public class matrices {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("1 si quieres hueco o 2 si quieres lleno la figura: ");
        int des = sc.nextInt();
        System.out.print("Altura: ");
        int altura = sc.nextInt();
        System.out.print("Anchura: ");
        int anchura = sc.nextInt();

        String[][] matriz = new String[altura][anchura];

        if (des == 1) {
            matriz = cerrado(matriz);
        } else {
            matriz = abierto(matriz);
        }

        imprimirMatriz(matriz);
        sc.close();
    }

    public static String[][] cerrado(String[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = "0";
            }
        }
        return matriz;
    }
    public static String[][] abierto(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {
                if (i == 0 || j == 0 || i == matriz.length - 1 || j == matriz[0].length - 1) {

                    matriz[i][j] = "0";
                } else {
                    matriz[i][j] = " ";
                }
            }
        }

        return matriz;
    }
    public static void imprimirMatriz(String[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
