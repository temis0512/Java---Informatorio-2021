import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        datos();
    }

    // Imprime datos ingresados por consola
    static void datos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre y su apellido:");
        String nombreCompleto = sc.nextLine();
        System.out.println("Ingrese su edad:");
        String edad = sc.nextLine();
        System.out.println("Ingrese su dirección:");
        String direccion = sc.nextLine();
        System.out.println("Ingrese su ciudad:");
        String ciudad = sc.nextLine();
        sc.close();
        String mensaje = String.format("%s - %s - %s años - %s", ciudad, direccion, edad, nombreCompleto);
        System.out.println(mensaje);
    }
}
