package Repl_It;

import java.util.Scanner;

public class Calori_Burned {
    public static void main(String[] args) {
/*One way to measure the amount of energy that is expended during exercise is to use
metabolic equivalents (MET).
Here are some METS for various activities:
- Running 6 MPH: 10 METS
- Basketball: 8 METS
- Sleeping: 1 MET
METS are given per minute.

The number of calories burned per minute may be estimated using the following formula:
cal = 0.0175 * MET * Weight in kilograms

Write a program that asks user to enter his weight in pounds, and then calculates a
nd outputs the total number of calories burned for a  person who runs 6 MPH for 30 minutes,
plays basketball for 30 minutes, and then sleeps for 6 hours. One kilogram is equal to 2.2 pounds.
use (int)cal to round a double value.
Example:

output: Enter weight in pounds:
input: 150
output: Calories Burned: 1073
 */
        double weight = 0;
        double cal = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter weight in pounds:");
        weight = scan.nextDouble();

        weight = weight/2.2;

        double met = 30*10 + 30*8 + 6*60*1 ;

        cal = (0.0175 * met * weight);

        int a = (int) cal;

                System.out.println(a);











    }
}
