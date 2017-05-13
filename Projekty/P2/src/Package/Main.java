package Package;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int number = 5;

    static int factorial(int number) {
        int multiple = 1;
        for (int i = 1; i <= number; i++) {
            multiple *= i;
        }
        return multiple;
    }

    static int factorialRec(int number) {
        if (number < 2) {
            return 1;
        }
        return factorialRec(number - 1) * number;
    }

    static void table(String[] table) {
        for (int i = 0; i < table.length; i++) {
            System.out.println("Imie " + (i + 1) + " osoby: " + table[i]);
        }
    }

    public static void main(String[] args) {
        int number = 6;
        Scanner in = new Scanner(System.in);

//        Zadanie 1
//        int number;
//        System.out.print("Podaj liczbe: ");
//        number = in.nextInt();
//	    System.out.println(factorial(number));
//	    System.out.println(factorialRec(number));

//        Zadanie 2
//        String[] names = new String[4];
//        for (int i = 0; i < names.length; i++) {
//            System.out.print("Podaj " + (i + 1) + " imie: ");
//            names[i] = in.next();
//        }
//        table(names);

        /* Rzutowanie
        int a = 5;
        double b = 13.5;
        double c = b /(double)a;
        System.out.println(c);
        */
        Random rand = new Random();
        int randomnumber = rand.nextInt(49) + 1;
        int usertype;
        int[] randomnumbers = new int[6];
        for(int i=0; i<randomnumbers.length; i++) {
            randomnumbers[i] = randomnumber;
        }
        System.out.print("Podaj liczbe z przedzialu [1, 49]: ");
        usertype = in.nextInt();
        for(int i=0; i<randomnumbers.length; i++) {
            if (usertype == randomnumbers[i]) {
                System.out.println("Liczba " + usertype + " jest w tablicy");
                break;
            }
        }

    }
}
