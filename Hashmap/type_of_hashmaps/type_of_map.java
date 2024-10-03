

import java.util.*;

public class type_of_map {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "three");
        map.put(2, "two");
        map.put(7, "four");
        map.put(1, "one");
        System.out.println(map);

        //  for order of insertation maintain -----> LinkedHashMap

        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(3, "three");
        map1.put(2, "two");
        map1.put(7, "four");
        map1.put(1, "one");
        System.out.println(map1);

        //  sorted output on the basis of keys --------> TreeMap
        TreeMap<Integer, String> map2 = new TreeMap<>();
        map2.put(3, "three");
        map2.put(2, "two");
        map2.put(7, "four");
        map2.put(1, "one");
        System.out.println(map2);
        
        





    }
}
