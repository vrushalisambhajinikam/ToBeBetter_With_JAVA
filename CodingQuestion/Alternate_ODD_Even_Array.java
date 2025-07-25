import java.util.Arrays;
import java.util.Scanner;

public class Alternate_ODD_Even_Array {


    public static void main(String[] args) {

        /*
        Separate odd and even numbers.
        Sort both lists individually.
        Merge them in alternating order (even-odd).

        Example:
            Input: 10 25 20 40 55
            Even → [10,20,40]
            Odd → [25,55]
            Output → 10 25 20 55 40
        **/

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter how many ele you want to store :");
        int n= sc.nextInt();
        int ans[]=new int[n];
        int evenarr[]=new int[n];
        int oddarr[]=new int[n];

        int evencount=0,oddcount=0;

        for (int i = 0; i < n ; i++) {
            int number=sc.nextInt();
            if(number %2==0){
                evenarr[evencount]=number;
                evencount++;
            }
            else {
                oddarr[oddcount]=number;
                oddcount++;
            }
        }

        Arrays.sort(evenarr,0,evencount);
        Arrays.sort(oddarr,0,oddcount);

        int evenidx=0,oddidx=0,ansidx=0;
        for (int i = 0; i < n; i++) {

            if(evenidx<evencount && (ansidx%2==0 || oddidx>=oddcount)){
                ans[ansidx]=evenarr[evenidx];
                evenidx++;
                ansidx++;

            }
            else if(oddidx<oddcount) {
                ans[ansidx]=oddarr[oddidx];
                oddidx++;
                ansidx++;
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }


    }
}
