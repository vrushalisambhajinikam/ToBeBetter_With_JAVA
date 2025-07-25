import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSumProblem {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many number you want to insert in array");
        int n= sc.nextInt();
        int arr[]=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter target value");
        int targe= sc.nextInt();

        int result[]=TwoSumCalulation(arr,targe);


        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No such pair found.");
        }
    }

    public static int[] TwoSumCalulation(int []arr,int target){

        Map<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff=target-arr[i];

            if(map.containsKey(diff)){

                return new int[]{map.get(diff),i};
            }
            else {
                map.put(arr[i],i);
            }
        }
        return new int[0];
    }



}
