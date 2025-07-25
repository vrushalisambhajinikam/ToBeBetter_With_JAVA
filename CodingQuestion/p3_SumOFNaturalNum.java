import java.util.Scanner;

public class p3_SumOFNaturalNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        int sum = 0;


//        while(num>0){
//            sum=sum+num;
//            num--;
//        }
//        System.out.println(sum);

        int ans=calsum(num);
        System.out.println(ans);

    }
        //USING RECURSION


    static int calsum(int num){
        if(num==0){
            return num;
        }
        return num+calsum(num-1);
    }
}
