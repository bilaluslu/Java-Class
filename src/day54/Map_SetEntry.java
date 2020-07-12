package day54;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_SetEntry {
    public static void main(String[] args) {

        LinkedHashMap<String,String> countries = new LinkedHashMap<>();
        countries.put("Tajikistan","Dushanbe");
        countries.put("East Turkistan","Urumqi");
        countries.put("Japan", "Tokyo");
        countries.put("Ukraine", "Kharkov");
        countries.put("USA","Washington DC");
        countries.put("Pakistan","Islamabad");

        for ( Map.Entry<String,String> each : countries.entrySet() ) {
            System.out.println( each.getKey() + "'s capital is: " + each.getValue() );
        }





    }
}
