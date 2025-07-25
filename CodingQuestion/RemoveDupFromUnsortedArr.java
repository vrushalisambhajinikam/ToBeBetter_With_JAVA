import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupFromUnsortedArr {
    public static void main(String[] args) {
        int[]arr={10,15,3,3,11,13,10,5};

        Set<Integer>s1=new HashSet<>();
        for (int num:arr){
            if(!(s1.contains(num))){
                s1.add(num);
            }
            else {
                System.out.println("Duplicate "+num);
            }
            s1.add(num);
        }

        //Duplicate
        //Duplicate
        //[1, 2, 3, 4]
        System.out.println(s1);
    }
}
