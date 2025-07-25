import java.util.HashSet;
import java.util.Set;

public class LongestSubstringlen {
    public static void main(String[] args) {
        String str="abcabcbb";
        int left=0,right=0,maxlen=0;
        Set<Character>seen=new HashSet<>();

        while(right<str.length())
        {
            char ch= str.charAt(right);
            if(!seen.contains(ch)){
                seen.add(ch);
                right++;
                maxlen=Math.max(maxlen,right-left+1);
            }
            else {
                seen.remove(str.charAt(left));
                left++;
            }
        }
        System.out.println(maxlen-1);
    }
}

