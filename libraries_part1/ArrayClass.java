/*manipulate arrays

search elements

sort arrays

compare arrays

convert arrays to strings

fill arrays with values */






import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayClass {
    public static void main(String[] args) {
        int[] a={10,33,7};

        System.out.println(Arrays.toString(a));//meaningful representation of array

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        int index=Arrays.binarySearch(a, 33);
        System.out.println(index);

        int[] c = {1, 2, 3};
        int[] b = Arrays.copyOf(c, 5);

        System.out.println(Arrays.toString(b));

        List<Integer> x=new ArrayList<>(); 

        for (int i : a) {
            x.add(i);
            
        }
        System.out.println(x);

    }
}
