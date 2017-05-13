package Package;

import java.util.Scanner;

public class Rectangle {

    private double x = 0.0;
    private double y = 0.0;

    private double sideA = 0.0;
    private double sideB = 0.0;

    private static int count = 0; //this

    Scanner in = new Scanner(System.in);

    public Rectangle(double x, double y, double sideA, double sideB) {
        this.x = x;
        this.y = y;
        this.sideA = sideA;
        this.sideB = sideB;
        count++;
    }

    public Rectangle() {
        double sideA, sideB;

        System.out.print("Współrzędna x: ");
        this.x = in.nextDouble();

        System.out.print("Współrzędna y: ");
        this.y = in.nextDouble();

        System.out.print("Długość boku A: ");
        sideA = in.nextDouble();

        if (sideA <= 0.0) {
            throw new IllegalArgumentException("Bok A nie może być mniejszy lub równy 0");
        }
        this.sideA = sideA;

        System.out.print("Długość boku B: ");
        sideB = in.nextDouble();

        if (sideB <= 0.0) {
            throw new IllegalArgumentException("Bok B nie może być mniejszy lub równy 0");
        }

        this.sideB = sideB;
    }

    public double calculateCircuit() {
        return 2*(sideA + sideB);
    }

    public double calculateField() {
        return sideA*sideB;
    }

    public double getXCornerA() {
        return x;
    }

    public double getXCornerB() {
        return (x+sideA);
    }

    public double getXCornerC() {
        return x;
    }

    public double getXCornerD() {
        return (x+sideA);
    }

    public double getYCornerA() {
        return y;
    }

    public double getYCornerB() {
        return y;
    }

    public double getYCornerC() {
        return (y-sideB);
    }

    public double getYCornerD() {
        return (y-sideB);
    }

    public double[] getAllCorners() {
        double[] corners = {
            getXCornerA(),
            getYCornerA(),
            getXCornerB(),
            getYCornerB(),
            getXCornerC(),
            getYCornerC(),
            getXCornerD(),
            getYCornerD()
        };
        return corners;
    }

    public void viewCornerPositions() {
        System.out.println("A: ["+getXCornerA()+", "+getYCornerA()+"]");
        System.out.println("B: ["+getXCornerB()+", "+getYCornerB()+"]");
        System.out.println("C: ["+getXCornerC()+", "+getYCornerC()+"]");
        System.out.println("D: ["+getXCornerD()+", "+getYCornerD()+"]");
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public static int getCount() {
        return count;
    }

}
