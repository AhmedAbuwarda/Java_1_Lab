/*
Ex1: Write a program that reads a Celsius degree in a double value from the console, then
converts it to Fahrenheit and displays the result. The formula for the conversion is as follows:
fahrenheit = (9 / 5) * celsius + 32

Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8

*/

package Labs.Lab_02;

import java.util.Scanner;

public class _08_Ex01_FahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\n >> Enter your Celsius degree: ");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        System.out.println(" >> " + celsius + " celsius = " + fahrenheit + " fahrenheit");

    }
}