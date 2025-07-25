import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[]arr1={1,2,2,4,5,1};
        int[]arr2={2,2,5};

        Set<Integer> unique=new HashSet<>();
        Set<Integer>intersection=new LinkedHashSet<>();

        for (int num:arr1){
            unique.add(num);
        }
        System.out.println(unique);

        for (int num:arr2)
        {
            if(unique.contains(num)){
                intersection.add(num);
            }
        }

        System.out.println("Common ele in both array are: "+intersection);
    }
}
