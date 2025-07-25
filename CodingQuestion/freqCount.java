import java.util.*;
public class freqCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (freq.containsKey(ch)) {
                freq.put(ch, freq.get(ch) + 1);
            } else {
                freq.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.print("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }


}
