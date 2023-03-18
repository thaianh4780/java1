import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Chuong7 {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<String>();
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Banana");
        hset.add("Apple");
        hset.add("Mango");
        //Addition of null values
        hset.add(null);
        hset.add(null);
        //Displaying HashSet elements
//        System.out.println(hset);

        //Addition of duplicat
        hset.stream().forEach(System.out::println); // in data trong List by stream

        System.out.println( hset.contains("Mango"));
        System.out.println(hset.size());
        //sort
//        List<String> sortedList = hset.stream()
//                .sorted(Comparator.naturalOrder())
//                .collect(Collectors.toList());
////                .forEach(System.out::println);
//        System.out.println(sortedList);
    }
}
