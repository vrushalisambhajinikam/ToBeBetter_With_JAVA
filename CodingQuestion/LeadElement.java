import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeadElement {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int arr[]={10,50,6,7,2,1,3};

        List<Integer>res=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int lead=arr[i];
            int newsize=arr.length-i-1;
            while (newsize>0){
                for (int j=0;j<newsize;j++)
                {
                    if(arr[i]>arr[j+1]){
                        res.add(lead);
                    }
                    else {
                        res.add(arr[j]);
                    }
                }
            }
        }
        System.out.println(res);
    }

}
