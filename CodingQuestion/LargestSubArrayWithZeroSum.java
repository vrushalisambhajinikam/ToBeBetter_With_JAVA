import java.util.HashMap;
import java.util.Scanner;

public class LargestSubArrayWithZeroSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>h1=new HashMap();
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];

            if(h1.containsKey(sum)){

                int previdx=h1.get(sum);

            }
            else {
                h1.put(sum,i);
            }


        }


    }
}
