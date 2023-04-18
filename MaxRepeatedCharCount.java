package String;

import java.util.HashMap;

public class MaxRepeatedCharCount {
    public static int getMaxRepeatedCharCount(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        int maxCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (charCountMap.containsKey(ch)) {
                int count = charCountMap.get(ch);
                charCountMap.put(ch, ++count);
            } else {
                charCountMap.put(ch, 1);
            }
        }

        for (int count : charCountMap.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        String str = "abbcccdddd";
        int maxCount = getMaxRepeatedCharCount(str);
        System.out.println("Maximum repeated character count in the string is: " + maxCount);
    }
}

