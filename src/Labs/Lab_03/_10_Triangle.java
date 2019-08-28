/*
Write a program that reads three edges for a triangle and computes the perimeter if the
input is valid. Otherwise, display that the input is invalid.
The input is valid if the sum of every pair of two edges is greater than the remaining edge.
*/

package Labs.Lab_03;

import java.util.Scanner;

public class _10_Triangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter Edge1: ");
        double edge1 = input.nextDouble();
        System.out.print("  >> Enter Egde2: ");
        double edge2 = input.nextDouble();
        System.out.print("  >> Enter Edge3: ");
        double edge3 = input.nextDouble();
        if (edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge3 + edge2 > edge1) {
            System.out.println("  >> The Perimeter is: " + (edge1 + edge2 + edge3));
        } else {
            System.out.println("  >> The input is invalid !");
        }

    }
}