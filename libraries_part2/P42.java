import java.util.*;

public class P42{
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(Comparator.comparingInt(String::length));

        ts.add("Banana");
        ts.add("Apple");
        ts.add("Mango");
        ts.add("Kiwi");

        System.out.println(ts);
    }
}

