import java.util.Scanner;

public class display_string_with_given_format {
    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        String str1 = sc.next();
//        StringBuilder result = new StringBuilder();
//
//        char prevChar = '\0';
//
//        if (Character.isDigit(str1.charAt(0))) {
//            System.out.println("plz enter starting char as letter");
//             return;
//        }
//            for (int i = 0; i < str1.length(); i++) {
//
//                char current = str1.charAt(i);
//
//                if (Character.isLetter(current)) {
//                    prevChar = current;
//                } else if (Character.isDigit(current)) {
//                    int count = current - '0';
//                    while (count > 0) {
//                        result.append(prevChar);
//                        count--;
//                    }
//                }
//            }
//            System.out.println(result.toString());






    //2nd version of i/p=  a1b2cd4 here above logic only print the d-4 times but we need to print the cd-4 times
    // output must be=     abbcdcdcdcd

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        StringBuilder result = new StringBuilder();
        StringBuilder sb1=new StringBuilder();

        if (Character.isDigit(str1.charAt(0))) {
            System.out.println("plz enter starting char as letter");
            return;
        }
        for (int i = 0; i < str1.length(); i++) {

            char current = str1.charAt(i);

            if (Character.isLetter(current))
            {
                sb1.append(current);
            }
            else {
                if (Character.isDigit(current)) {
                    int count = current - '0';
                    while (count > 0) {
                        result.append(sb1);
                        count--;

                    }
                    sb1.setLength(0);
                }
            }

        }
        System.out.println(result.toString());


























}



}
