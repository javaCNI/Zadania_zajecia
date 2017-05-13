package Package;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Computer x = new Computer();
//        Computer y = new Computer("PC", "Nvidia");
//        double a = 5.2, b = 2.4;
//        y.Calculate(a, b);
//        System.out.println(y.getComputer_name());
//        y.setComputer_name("Pecet");
//        System.out.println(y.getComputer_name());


        Rectangle rectangle = new Rectangle(4.5, 2.3, 3.2, 5.1);
        System.out.println("Pole figury: "+rectangle.calculateCircuit());

        Rectangle[] object = new Rectangle[10];

        try
        {
            for(int i=0; i<2; i++)
            {
                System.out.println("Figura "+(i+1));
                object[i] = new Rectangle();
            }
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }

        boolean collision = true; //XA, XB; YC, YA = 0, 2; 5, 1

        double[] compartments = {
                object[0].getAllCorners()[0],
                object[0].getAllCorners()[2],
                object[0].getAllCorners()[5],
                object[0].getAllCorners()[1]
        };

        for(int i=0; i<4; i++) {
            System.out.println("WIERZCHOŁEK "+(i+1));
            for(int j=0; j<4; j++) {
                if(j%2 == 0) {
                    if ( object[1].getAllCorners()[(i*2)+((j%4)/2)] < compartments[j] ) {
                        collision = false;
                    }
                    System.out.println(object[1].getAllCorners()[(i*2)+((j%4)/2)]);
                }
                else {
                    if ( object[1].getAllCorners()[(i*2)+((j%4)/2)] > compartments[j] ) {
                        collision = false;
                    }
                }
            }
            if(collision) {
                System.out.println("Kolizja dla "+(i+1)+" wierzchołka");
                break;
            }
        }

        for(int i=0; i<2; i++) {
            System.out.println("Figura "+(i+1)+" - współrzędne punktów");
            object[i].viewCornerPositions();
        }

    }
}