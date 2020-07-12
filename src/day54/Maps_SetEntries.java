package day54;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Maps_SetEntries {
    public static void main(String[] args) {

        LinkedHashMap<String,String> fb = new LinkedHashMap<>();
        fb.put("Tester01" , "password1");
        fb.put("Tester02" , "password1");   // duplicated so first one removed
        fb.put("Tester02" , "password2");   // this one stays
        fb.put("Tester03" , "password3");
        fb.put("Tester04" , "password4");
        fb.put("Tester05" , "password5");

        System.out.println( fb );

        for ( String eachKey : fb.keySet() ) {
            //System.out.println( eachKey + " " + fb.get(eachKey) ); // returns Keys+Values
            System.out.println( eachKey );  // returns all Keys
        }
        List<String> username = new ArrayList<>(fb.keySet());
        System.out.println( username );

        System.out.println("=================================");

        for ( String eachValue : fb.values() ) {
            System.out.println( eachValue );    // returns all values
        }

        List<String> password = new ArrayList<>(fb.values());
        System.out.println( password );

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");





    }
}
