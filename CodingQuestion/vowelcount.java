import java.util.*;

public class vowelcount {
    public static void main(String[] args) {

                String str = "VrushaliNikam";
                Map<Character, Integer> vowelCount = new HashMap<>();
                Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

                for (char ch : str.toLowerCase().toCharArray()) {
                    if (vowels.contains(ch)) {
                        vowelCount.put(ch, vowelCount.getOrDefault(ch, 0) + 1);
                    }
                }

                for (char v : vowels) {
                    System.out.println(v + ": " + vowelCount.getOrDefault(v, 0));
                }
            }
        }

