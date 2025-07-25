import java.util.Scanner;

public class ShiftArrayByKPos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a1 = new int[]{1,2,3,4,5};
        System.out.println("Enter k value : ");
        int k = sc.nextInt();
        int n = a1.length;
        int[] rotatedarr = new int[n];

        int i;
        for(i = 0; i < a1.length; ++i) {
            int newidx = (i + k) % n;
            rotatedarr[newidx] = a1[i];
        }

        for(i = 0; i < a1.length; ++i) {
            System.out.print(rotatedarr[i] + " ");
        }
    }
}
