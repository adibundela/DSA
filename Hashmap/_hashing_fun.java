import java.util.*;
import java.io.*;
public class _hashing_fun {
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap =new HashMap<>();
     // functionality of the put() function
        hashmap.put(1,"aditya" );
        hashmap.put(3, "twinklel");
        hashmap.put(5, "asha");
        hashmap.put(8, "karan");
        System.out.println("HashMap of the given data :"+hashmap);
    // functanily of get function
        String result = hashmap.get(3);
        System.out.println("the vale at key 3:"+result);
    // functanilty of containskey() function

        System.out.println(hashmap.containsKey(2));
    
    // functionality of remove function
       
       hashmap.remove(3);
       System.out.println("HashMap of the given data :"+hashmap);
    
    // itrating using for loop
    for(Map.Entry< Integer,String > e: hashmap.entrySet()){  // for each loop
        System.out.println("HashMap:");
        System.out.println( e.getKey()+":"+e.getValue());
    }

         

    }
}
