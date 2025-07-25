import java.util.Scanner;

public class ShiftZeroToRight {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int arr[]= {0,1,0,3,12};

        int n=arr.length;

        if(n==1){
            System.out.println(arr[0]);
        }else
        {
            int idx=0;
            for (int i = 0; i < n; i++) {
                if((arr[i])!=0){
                    arr[idx++]=arr[i];
                }
            }
            while (idx<n){
                arr[idx++]=0;
            }
        }

        for (int i = 0; i < n; i++) {

            System.out.print(arr[i]+" ");
        }


    }
}
