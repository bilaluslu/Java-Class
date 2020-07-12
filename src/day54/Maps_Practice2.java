package day54;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Maps_Practice2 {
    public static void main(String[] args) {

        LinkedHashMap<String,Integer> classMatesScore = new LinkedHashMap<>();
        classMatesScore.put("Ali",95);
        classMatesScore.put("Veli",85);
        classMatesScore.put("Mehmet",70);
        classMatesScore.put("Riza",91);
        classMatesScore.put("Ahmet",32);

        LinkedHashMap<String , Integer> badStudent = new LinkedHashMap<>();
        LinkedHashMap<String , Integer> goodStudent = new LinkedHashMap<>();


        for ( String eachName : classMatesScore.keySet() ){
            int eachValue = classMatesScore.get( eachName );    // score
            if ( eachValue <= 90 ){
                badStudent.put( eachName,eachValue);
            } else {
                goodStudent.put( eachName , eachValue );
            }
        }

        System.out.println("Bad Student --> " + badStudent );
        System.out.println("Good Student --> " + goodStudent );








    }
}
