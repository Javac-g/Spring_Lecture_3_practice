package LAB_3;

import java.util.Scanner;

public class Main {

    static double R, L;
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String...args){

        System.out.println("Введите радиус окружности:  ");

        R = scanner.nextDouble();

        L = 2 * Math.PI * R;

        System.out.println("Длина окружности равна: " + L);

        scanner.next();



    }
}
