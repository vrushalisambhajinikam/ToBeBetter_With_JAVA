import java.util.Scanner;
import java.util.Stack;

public class validParenthesis {

    public static boolean isValid(String s)
    {
        Stack<Character>st=new Stack<>();
        for (char ch:s.toCharArray()){
            if(ch=='('|| ch=='{'||ch=='[')
            {
                st.push(ch);
            }
            else{
                if(st.isEmpty())return false;

                char top=st.peek();//top ele
                if(ch==')'&& top=='(' ||
                        ch=='}'&& top=='{' ||
                        ch==']'&& top=='['    ){
                    st.pop();
                }
                else {
                    return false;
                }
            }
        }
            return st.isEmpty();
    }
    public static void main(String[] args) {

        String s1;
        Scanner sc=new Scanner(System.in);
        s1=sc.next();
        boolean res=isValid(s1);
        if(res){
            System.out.println("Valid paranthesis");
        }
        else {
            System.out.println("Invalid paranthesis");
        }
    }
}
