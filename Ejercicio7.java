import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un caracter a: ");
        String a = scan.next();

        
        System.out.println(a.toUpperCase());
        scan.close();
        }
    }

