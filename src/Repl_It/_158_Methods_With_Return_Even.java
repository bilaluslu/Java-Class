package Repl_It;

import java.util.Scanner;

public class _158_Methods_With_Return_Even {
/*
isEven method gets a number(int) if its even (2,4,8...) returns true.
if its odd return false.
for example:
isEven(1) --> false
isEven(8) --> true
 */
    public static boolean isEven(int n){

        if ( n % 2 == 0) {
            return true;
        } else {
            return  false;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println(isEven(n));

    }


}
