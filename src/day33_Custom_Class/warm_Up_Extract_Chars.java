package day33_Custom_Class;

import java.util.ArrayList;

public class warm_Up_Extract_Chars {
    /*
    write a program that can extract the sepecial characters, digits and alphebets from a string and stores them into seperate ArrayLists of Character:
			ex:
				str = "ABCD123$%#@&456EFG!";
				list1: {$, %, #, @, &, !}
				list2: {A, B, C, D, E, F, G}
				list3: {1, 2, 3, 4, 5, 6}
     */
    public static void main(String[] args) {
/*
    with for each loop
 */
        String str = "ABCD123$%#@&456EFG!";

        char[] arr = str.toCharArray();

        ArrayList<Character> letters = new ArrayList<>();   // isLetter()
        ArrayList<Character> digits = new ArrayList<>();    // isDigit()
        ArrayList<Character> specialChars = new ArrayList<>();

        for ( char each : arr ) {
            if ( Character.isLetter(each) ) {
                letters.add( each );
            } else if ( Character.isDigit(each) ) {
                digits.add( each );
            } else {
                specialChars.add( each );
            }
        }
        System.out.println( letters );
        System.out.println( digits );
        System.out.println( specialChars );




    }
}
