public class ReverseWordOfString {

    public static void main(String[] args) {
        String str="Hello Vrushalli";
        System.out.println(reverseword(str));
    }

    static String reverseword(String str){

        StringBuilder result=new StringBuilder();
        StringBuilder word=new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char c=str.charAt(i);

            if(c != ' '){
                word.append(c);
            }
            else {
                result.append(word.reverse().toString());
                result.append(" ");
                word.setLength(0);
            }
        }
        result.append(word.reverse().toString());

        return result.toString();
    }
}
