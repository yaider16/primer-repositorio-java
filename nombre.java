import java.util.Scanner;

public class nombre {
    public static void main(String[] args) {
        System.out.println("ingrese nombre");
        Scanner sc = new Scanner(System.in);

        String nombre = sc.nextLine();

        double gey = Math.random()*10;

        System.out.println("Es una escala del uno al diez usted "+nombre+ " es "+gey+ " gey");

        sc.close();
    }
}
