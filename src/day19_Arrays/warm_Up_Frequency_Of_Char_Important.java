package day19_Arrays;

import java.util.Scanner;

public class warm_Up_Frequency_Of_Char_Important {
    public static void main(String[] args) {

/*
write a program that can return the frequency of the characters ina string
		Ex: "AABCBCA" ==> "A3B2C2"

		    ****************************
		    ****** VERY IMPORTANT ******
		    ****************************
 */

        //Scanner input = new Scanner(System.in);
        //String str = input.nextLine();

        String str = "AABCC";     //"A2B1C2"
        String result = "";   //"A2B1C2"

        String nonDup =""; //ABC

        for(int i=0; i <= str.length()-1; i++){

            if(!nonDup.contains( ""+str.charAt(i)) ){  // if the character at index i is not contained in nonDup, then it will be concated
                nonDup += str.charAt(i);
            }
        }
        //  System.out.println(nonDup);
        // nonDup ="ABC";     str = "AABCC";   ==> result= "A2B1C2"

        for(int j = 0 ; j <= nonDup.length()-1; j++ ){
            char ch = nonDup.charAt(j);

            int count = 0;  // count the total number of occurence of each charcter from str
            for(int i = 0; i <= str.length()-1; i++){
                if(str.charAt(i) == ch){
                    count++;
                }
            }
            result +=   "" + ch  + count;   // "" ==> to make String otherwise gives compile error
        }
        System.out.println(result);
















    }
}
