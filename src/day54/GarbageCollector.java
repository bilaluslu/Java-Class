package day54;

public class GarbageCollector {
    public static void main(String[] args) {

        GarbageCollector obj = new GarbageCollector();  // will not be collected by garbage collector
                               new GarbageCollector();  // will be collected by garbage collector

        System.out.println("Done");

        // unreference an object:

        String str = new String("Cybertek");
               str = new String("MIT");

        System.out.println(str);

        Integer num = new Integer(123);
                num = new Integer(124);

                // 123 wil be collected by garbage collector






    }
}
