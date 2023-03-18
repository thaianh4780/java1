import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String args[]) {
        ArrayList<SinhVien> listOfSinhVien = new ArrayList<SinhVien>();
        listOfSinhVien.add(new SinhVien(111, "An", 19));
       listOfSinhVien.add(new SinhVien(118, "Binh", 18));
      listOfSinhVien.add(new SinhVien(114, "Phuc", 22));

      System.out.println("Sorting by Age: ");
       Collections.sort(listOfSinhVien, new AgeComparator());
        Iterator itr2 = listOfSinhVien.iterator();
       while (itr2.hasNext()) {
           SinhVien st = (SinhVien) itr2.next();
             System.out.println(st.getId() + " " + st.getName() + " " + st.getAge());
            }

         System.out.println("\nSorting by Name...");
        // use anonymous class
         Collections.sort(listOfSinhVien, new Comparator<SinhVien>() {
public int compare(SinhVien st1, SinhVien st2) {
                return st1.getName().compareTo(st2.getName());
                 }
                    });

         for (SinhVien st : listOfSinhVien) {
            System.out.println(st.getId() + " " + st.getName() + " " + st.getAge());
            }
        }
}
