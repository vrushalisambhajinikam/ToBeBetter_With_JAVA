import java.util.ArrayList;
import java.util.Scanner;
public class TwoDArray {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }

        }
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<n;j++)
//            {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//
//        }

        ArrayList<Integer>even=new ArrayList<>();
        ArrayList<Integer>odd=new ArrayList<>();

        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j || (i+j)== arr.length-1)
                {
                    System.out.print(arr[i][j]+" ");
                    if(arr[i][j] %2==0){
                        even.add(arr[i][j]);
                    }
                    else {
                        odd.add(arr[i][j]);
                    }
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        System.out.println(even);
        System.out.println(odd);

    }

}
