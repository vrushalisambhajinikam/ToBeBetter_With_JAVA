public class PAlindrome {
    public static void main(String[] args) {

                String str = "vrushalli";
                boolean isPalindrome = true;

                int start = 0;
                int end = str.length() - 1;

                while (start < end) {
                    if (str.charAt(start) != str.charAt(end)) {
                        isPalindrome = false;
                        break;
                    }
                    start++;
                    end--;
                }

                if (isPalindrome)
                    System.out.println("Palindrome");
                else
                    System.out.println("Not Palindrome");
            }

    }
