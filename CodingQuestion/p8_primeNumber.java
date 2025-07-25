import java.util.Scanner;

public class p8_primeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();

        int flag=1;
        if(num<2){
                flag=0;
            }

            for (int i = 0; i <= Math.sqrt(num) ; i++) {
                if(num%i==0){
                    flag=0;
                }
            }
            if(flag==1){
                System.out.println("prime");
        }
            else {
                System.out.println("Not prime");
            }

    }
}
