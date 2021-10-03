package com.BridgeLabz;
import java.util.Scanner;

public class UC3CompareLine {
        static void comparesTo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co-ordinate for 1st point for 1st Line: ");
        double X1 = sc.nextDouble();
        double Y1 = sc.nextDouble();
            System.out.println("Enter the co-ordinates for 2nd point for 1st Line: ");
            double X2 = sc.nextDouble();
            double Y2 = sc.nextDouble();
            System.out.println("Enter the co-ordinate for the 1st point for 2nd Line");
            double A1 = sc.nextDouble();
            double B1 = sc.nextDouble();
            System.out.println("Enter the co-ordinates for 2nd point for 2nd Line: ");
            double A2 = sc.nextDouble();
            double B2 = sc.nextDouble();

            double x = Math.pow(X2-X1, 2);
            double y = Math.pow(Y2-Y1, 2);

            double a = Math.pow(A2-A1, 2);
            double b = Math.pow(B2-B1, 2);

            double Length = Math.sqrt(x+y);
            double Length2 = Math.sqrt(a+b);
            System.out.println("Length of line B/W two co-ordinates are: " +Length);
            System.out.println("Length of Line B/W two co-ordinates are: " +Length2);
            if (Length == Length2) {
                System.out.println("Both Line is are equal: ");

            }
            else if(Length>Length2) {
                System.out.println("1st line is greater than 2nd line: ");

            }
            else {
                System.out.println("2nd line is greater than 1st line: ");

            }
            sc.close();

    }
    public static void main(String[] args) {
       //     TODO Auto-genrated method stub
        comparesTo();
    }
}
