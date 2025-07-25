import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstringWithoutRepChar {

    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string :");
        str=sc.nextLine();

        int ans=LongSubStringLen(str);

        System.out.println("Longest Substring length is : "+ans);
    }

    public static int LongSubStringLen(String str){

        Set<Character> seen=new HashSet<>();
        int left=0,right=0,maxlen=0;

        while (right<str.length())
        {
            char ch=str.charAt(right);

            if(!seen.contains(ch))
            {
                seen.add(ch);
                maxlen=Math.max(maxlen, right-left+1);
                right++;
            }
            else {
                seen.remove(str.charAt(left));
                left++;
            }
        }

        return maxlen;

    }
}
