package DogFile;

import java.util.*;
public class HashMapExample {
    public static void main(String args[]) {
        // create and populate hash map
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"Java");
        map.put(2, "Python");
        map.put(3, "PHP");
        map.put(4, "SQL");
        map.put(5, "C++");
        System.out.println("Tutorial in Guru99: "+ map);
        //Remove value of key 5
        map.remove(2);
        //map.containsKey(2);
        //map.isEmpty();
        System.out.println("Tutorial in Guru99 After Remove: "+ map);
        //System.out.println(Map.of().keySet());
        //System.out.println(Map.values());
    }
}
