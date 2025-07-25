import java.util.Scanner;

public class p5_GretestNum {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fnum, lnum;
        fnum = sc.nextInt();
        lnum = sc.nextInt();

        if(fnum>lnum)
        {
            System.out.println("first greater");
        }
        else{
            System.out.println("last");
        }
    }
}
