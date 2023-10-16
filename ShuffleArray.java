import java.util.*;
public class ShuffleArray {
    public static void main(String[] args)
    {
        Integer[] Array1={1,2,3,4,5,6,7};
        List<Integer> List1 = Arrays.asList(Array1);
        Collections.shuffle(List1);
        List1.toArray(Array1);
        System.out.println(Arrays.toString(Array1));
    }
    
}
