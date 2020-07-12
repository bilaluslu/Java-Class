package day54;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class Maps_Practice1 {
    public static void main(String[] args) {
        
        Map<String , LocalDate> birthdayOfMate = new LinkedHashMap<>();
        birthdayOfMate.put("Emrah",LocalDate.of(1985,4,25));
        birthdayOfMate.put("Bilal",LocalDate.of(1988,9,24));
        birthdayOfMate.put("Ali",LocalDate.of(1986,1,1));
        birthdayOfMate.put("Veli",LocalDate.of(1989,7,18));
        birthdayOfMate.put("Mehmet",LocalDate.of(1982,12,30));
        birthdayOfMate.put("Anil", LocalDate.of(1453,5,29));

        birthdayOfMate.put("Ali",LocalDate.of(1990,11,11)); // this one will be kept,
                            // first one will be removed if we try to duplicate
        birthdayOfMate.put("Mehmet", LocalDate.now());

        System.out.println(birthdayOfMate);
        System.out.println( "size: " +  birthdayOfMate.size() );  // returns 6

        birthdayOfMate.remove("Ali");
        System.out.println( "after remove: " + birthdayOfMate);
        System.out.println( "after remove size: " + birthdayOfMate.size() );   // returns 5

        System.out.println( birthdayOfMate.get("Anil") );   //  returns 1453-05-29


        boolean r1 = birthdayOfMate.containsKey("Muhtar");
        System.out.println( r1 ); // returns boolean false

        boolean r2 = birthdayOfMate.containsValue( LocalDate.of(1988,9,24) );
        System.out.println( r2 ); // returns boolean true


        birthdayOfMate.clear(); // clears everything
        System.out.println( birthdayOfMate );   // returns empty after clear method

        
        
        
        
        
    }
}
