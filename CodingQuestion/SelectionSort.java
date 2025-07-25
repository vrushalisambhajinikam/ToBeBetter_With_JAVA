import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many number you want to insert in array");
        int n= sc.nextInt();
        int arr[]=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        //selection sort

        for (int i = 1; i < n; i++) //n-1 passes loop
        {
            int k=i;
            for (int j = i+1; j < n; j++) //Find max element in unsorted part
            {
                if(arr[j]>arr[k])
                {
                    k=j;
                }
                if(k!=i){
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }

        for (int k = 0; k < n; k++) {
            System.out.print(arr[k]+"  ");

        }
    }
}
