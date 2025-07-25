import java.util.Scanner;

public class p6_GreterOfThreeNumber {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int fnum, lnum;
            fnum = sc.nextInt();
            lnum = sc.nextInt();
            int tnum = sc.nextInt();

            if (fnum > lnum && fnum > tnum) {
                System.out.println("first greater");
            } else if (lnum > fnum && lnum > tnum) {
                System.out.println("2nd");
            } else {
                System.out.println("Third ");
            }

        }

}
