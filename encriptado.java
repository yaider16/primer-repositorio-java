import java.lang.reflect.Array;
import java.util.Scanner;

public class encriptado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palabra =sc.nextLine();
        encriptador(palabra);

        sc.close();
    }


    public static String encriptador(String palabra){
        String palabraEncriptada="";

        numerosUnoCinco();

        return palabraEncriptada;
    }

    public static void numerosUnoCinco(){
        
        int[] numeros = new int[5];
        for (int i = 0; i <= 4; i++) {

            int num = Math.round((float) Math.random()*10);

            while (num>5 || num==0) {
                num=Math.round((float)Math.random()*10);
            }

            if (i==4) {
                for (int j = 0; j <= numeros.length-1; j++) {
                    int num2 = numeros[j];
                    
                    for (int j2 = j+1; j2 <= numeros.length-1; j2++) {
                        
                        int num3=numeros[j2];
                        
                        if (num2==num3) {
                            System.out.println(num2);
                        }
                    }
                }
            }
            numeros[i]=num;
        }
        System.out.println(Array.newInstance(null, 0));
    }
}
