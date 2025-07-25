import java.util.HashMap;
import java.util.Scanner;

public class SmallestSubstring {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str1=sc.next();
        String target=sc.next();

        HashMap<Character,Integer>target_char_count=new HashMap<>();
        HashMap<Character,Integer>window_char_count=new HashMap<>();


        int left=0,right=0;
        for (int i = 0; i < str1.length(); i++)
        {


             for(char ch: target.toCharArray()) {

                 if (target_char_count.containsKey(ch)) {
                     target_char_count.put(ch, target_char_count.get(ch) + 1);
                 } else {
                     target_char_count.put(ch, 1);
                 }
             }
        }

    }
}
