import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many number you want to insert in array");
        int n= sc.nextInt();
        int arr[]=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        //Bubble sorting
        int i,j,temp;

        for (  i = 0; i <n-1; i++) {

            for (  j = 0; j < n-i-1; j++) {

                if(arr[j]<arr[j+1]){

                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for (int k = 0; k < n; k++) {
            System.out.print(arr[k]+"  ");

        }
    }
}
