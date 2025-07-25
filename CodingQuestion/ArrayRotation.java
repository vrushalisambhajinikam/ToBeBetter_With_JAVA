import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int[]a1={10,20,30,40,50,60,70,80,90};
        System.out.println("Enter shift value : ");
        int k=sc.nextInt();
        int n=a1.length;

        int[] rotatedarr=new int[n];

        //Right Rotation
        for (int i = 0; i < a1.length; i++) {
           int newidx=(i+k)%n;
            rotatedarr[newidx]=a1[i];
        }

        for (int i = 0; i < a1.length; i++) {
            System.out.print(rotatedarr[i]+" ");
        }

        System.out.println("\n");
        //Left Shift
        int lidx=0;
        int LeftRotArr[]=new int[n];
        for (int i = 0; i < a1.length; i++) {
            lidx=(i+n-k)%n;
            LeftRotArr[lidx]=a1[i];
        }
        for (int i = 0; i < a1.length; i++) {
            System.out.print(LeftRotArr[i]+" ");
        }
    }
    }
