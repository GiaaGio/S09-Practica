package CPrincipal;

import CLeer.CLeer;
import CMatematicas.CMatematicas;
import java.util.Scanner;

public class CPrincipal {
    
    static CMatematicas obj = new CMatematicas();
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Área de circulo (Math.PI)");
            System.out.println("2. Volumen de cilindro (Math.PI)");
            System.out.println("3. Número menor (Math.min)");
            System.out.println("4. Número mayor (Math.max)");
            System.out.println("5. División exacta (Math.DivideExact)");
            System.out.println("6. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> ejercicioCirculo();
                case 2 -> ejercicioCilindro();
                case 3 -> ejercicioMenor();
                case 4 -> ejercicioMayor();
                case 5 -> ejercicioDivision();
                case 6 -> exit = true;
                default -> System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        }
    }

    public static void ejercicioCirculo() {
        float radio = CLeer.LeerRadio();
        obj.setRadio(radio);
        System.out.println("\u001B[31mRadio: " + obj.getRadio());
        System.out.println("\u001B[31mÁrea del circulo: " + obj.AreaCirculo());
    }

    public static void ejercicioCilindro() {
        float radio = CLeer.LeerRadio();
        float altura = CLeer.LeerAltura();
        obj.setRadio(radio);
        obj.setAltura(altura);
        System.out.println("\u001B[31mRadio: " + obj.getRadio());
        System.out.println("\u001B[31mAltura: " + obj.getAltura());
        System.out.println("\u001B[31mVolumen del cilindro: " + obj.Cilindro());
    }

    public static void ejercicioMenor() {
        float num1 = CLeer.LeerNumero1();
        float num2 = CLeer.LeerNumero2();
        obj.setNum1(num1);
        obj.setNum2(num2);
        System.out.println("\u001B[31mNumero 1: " + obj.getNum1());
        System.out.println("\u001B[31mNumero 2: " + obj.getNum2());
        System.out.println("\u001B[31mEl número menor es: " + obj.Menor());
    }

    public static void ejercicioMayor() {
        float num1 = CLeer.LeerNumero1();
        float num2 = CLeer.LeerNumero2();
        obj.setNum1(num1);
        obj.setNum2(num2);
        System.out.println("\u001B[31mNumero 1: " + obj.getNum1());
        System.out.println("\u001B[31mNumero 2: " + obj.getNum2());
        System.out.println("\u001B[31mEl número mayor es: " + obj.Mayor());
    }

    public static void ejercicioDivision() {
        float num1 = CLeer.LeerNumero1();
        float num2 = CLeer.LeerNumero2();
        obj.setNum1(num1);
        obj.setNum2(num2);
        System.out.println("\u001B[31mNumero 1: " + obj.getNum1());
        System.out.println("\u001B[31mNumero 2: " + obj.getNum2());
        System.out.println("\u001B[31mLa division exacta es: " + obj.Division());
    }
}
