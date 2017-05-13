package Package;

import java.util.Scanner;
//import java.util.Objects;

public class Main {

    public static void main(String[] args) {
//          Zadanie 3, 4
            int liczba;
            Scanner in = new Scanner(System.in);
            System.out.println("Podaj liczbe calkowita dodatnia: ");
            liczba = in.nextInt();
            for(int i=1; i<=liczba; i+=2) {
                System.out.print(i+" ");
            }
            System.out.println();
            for(int i=1; i<=liczba; i*=2) {
                System.out.print(i+" ");
            }
            int licznik = 0;
            for(int i=1; i<liczba; i++) {
                if(liczba %% i == 0) {
                    licznik++;
                }
            }
            if(licznik == 2 && liczba != 1) {
                System.out.println("Liczba " + liczba + " jest liczba pierwsza");
            }

//          Zadanie 2
//          String name1 = "Bartosz";
//          String name2 = "Aleksandra";
//          String name3 = "Patryk";
//          String name;
//
//          Scanner input = new Scanner(System.in);
//          System.out.println("Podaj imie: ");
//          name = input.next();
//          switch (name) {
//              case "Bartosz":
//                  System.out.println("Siemasz "+name+"!");
//                  break;
//              case "Patryk":
//                  System.out.println("Witaj "+name+"!");
//                  break;
//              case "Aleksandra":
//                  System.out.println("Hej "+name+"!");
//                  break;
//              default:
//                  System.out.println("Nie znamy sie gosciu!");
//          }
//
//          if(name.equals(name1) || name.equals(name2) || name.equals(name3)) {
//          if(name == name1 || name == name2 || name == name3) {
//              System.out.println("Witaj "+name+"!");
//          }
//          else {
//              System.out.println("Nie znamy sie gosciu!");
//          }

//        Zadanie 1
//        double C, F;
//        System.out.println("Podaj temperature w Celsjuszach: ");
//        Scanner c = new Scanner(System.in);
//        C = c.nextDouble();
//        F = (C*1.8f)+32.0f;
//        System.out.println("W przeliczeniu na Fahrenheity: "+F+" tekst");
//        c.close();
    }

}