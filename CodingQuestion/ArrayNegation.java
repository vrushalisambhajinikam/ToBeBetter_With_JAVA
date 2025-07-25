import java.util.Scanner;

public class ArrayNegation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a1 = new int[]{10, 20, 30, -40, 50, 60, -70, 80, -90};

        for (int i = 0; i < a1.length; i++) {
            if(a1[i]>0){
                //n-(n*2)
                System.out.print(a1[i]-(a1[i]*2)+" ");
            }
            else {
                System.out.print(a1[i]);
            }
        }
    }
}
