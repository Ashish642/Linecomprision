package com.BridgeLabz;
import java.util.Scanner;

public class UC1CallLength {
    public static void lengthofLine() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co-ordinates for first point: ");
        double X1 = sc.nextDouble();
        double Y1 = sc.nextDouble();
        System.out.println("Enter the co-ordinates for second point:");
        double X2= sc.nextDouble();
        double Y2 = sc.nextDouble();

        double x = Math.pow(X2-X1, 2);
        double y = Math.pow(Y2-Y1, 2);
        double Length = Math.sqrt(x+y);
        System.out.println("Length of line b/w two co-ordinates are: " +Length);
        sc.close();

    }

    public static void main(String [] args) {
        // A line based on a point consisting of (x,y) co-ordinates using the cartesian system,So that calculate its length
        // A length have two points (X1, Y1)  & (X2 ,Y2)
        // length of line = sqrt ((X2-x1) ^2 +  (Y2 - Y1) ^2)
        lengthofLine();
    }

}
