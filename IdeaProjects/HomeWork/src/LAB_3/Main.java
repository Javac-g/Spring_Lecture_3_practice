package LAB_3;

import java.util.Scanner;

public class Main {

    static double R, L;
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String...args){

        System.out.println("Radius:  ");

        R = scanner.nextDouble();

        L = 2 * Math.PI * R;

        System.out.println("Length: " + L);

        scanner.next();



    }
}
