import java.util.Comparator;

public class AgeComparator implements Comparator {
    public int compare(Object o1, Object o2) {
         SinhVien s1 = (SinhVien) o1;
         SinhVien s2 = (SinhVien) o2;

        if (s1.getAge() == s2.getAge())
             return 0;
         else if (s1.getAge() > s2.getAge())
             return 1;
         else
         return -1;
     }
}
