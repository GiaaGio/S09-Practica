package CLeer;

import java.util.Scanner;

public class CLeer {
    
    public static float LeerRadio() {
        float n;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese valor de radio: ");
            n = teclado.nextFloat();
        } while (n < 0);
        return n;
    }
    
    public static float LeerAltura() {
        float h;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese valor de altura: ");
            h = teclado.nextFloat();
        } while (h < 0);
        return h;
    }
    
    public static float LeerNumero1() {
        float m;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese número 1: ");
            m = teclado.nextFloat();
        } while (m < 0);
        return m;
    }
    
    public static float LeerNumero2() {
        float o;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese número 2: ");
            o = teclado.nextFloat();
        } while (o < 0);
        return o;
    }
}
