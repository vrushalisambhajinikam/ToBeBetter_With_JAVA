import java.util.*;

public class charCount {


    public static void main(String[] args) {

//        String str = "xperate";
//        Map<Character, Integer> map = new HashMap<>();
//
//        for (char ch : str.toCharArray()) {
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }
//        System.out.println(map);

//
//        int num=15;
//        boolean isprime=true;
//
//        if(num<=1){
//            isprime=false;
//        }
//        else {
//
//            for (int i = 2; i <= Math.sqrt(num); i++) {
//
//                if(num%i == 0){
//                    isprime=false;
//                    break;
//                }
//            }
//
//        }
//        System.out.println(isprime);


        //pattern Printing

//        Scanner sc=new Scanner(System.in);
//        int num= sc.nextInt();

//
//        for (int row = 0; row< num; row++) {
//            for (int col = 0; col <= row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        int temp=num;
//        int sum=0;
//        while (num > 0) {
//
//            int ldigit=num%10;
//            sum+= Math.pow(ldigit,3);
//            num/=10;
//        }
//
//        if(sum==temp)
//            System.out.println("Armstrong");
//        else
//            System.out.println("Not");




        //Duplicate Ele from Array

        int[] arr={1,1,2,3,4,2,5,3,1,8};
        Map<Integer,Integer>m1=new HashMap<>();

        for (int num:arr){
            m1.put(num,m1.getOrDefault(num,0)+1);
        }

        for (Map.Entry<Integer,Integer>e: m1.entrySet())
        {
            if (e.getValue()>1){
                System.out.println(e.getKey());
            }
        }


















        }


}
