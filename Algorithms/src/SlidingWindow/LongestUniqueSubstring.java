package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {

    private static boolean hasDuplicate(String subS) {
        Set<Character> characterSet = new HashSet<Character>();
        for (int i = 0; i < subS.length(); i++) {
            if (!characterSet.add(subS.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private static int longestUniqueSubstring(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s.length();
        }

        int maxLength = 1, currentLength = 1;

        for (int leftIndex = 0; leftIndex < s.length(); leftIndex++) {
            for (int rightIndex = leftIndex + 1; rightIndex < s.length(); rightIndex++) {
                String subString = s.substring(leftIndex, rightIndex + 1);
                if (hasDuplicate(subString)) {
                    break;
                } else {
                    currentLength++;
                }
            }
            maxLength = Math.max(maxLength, currentLength);
            currentLength = 1;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int numberOfTestCases = 3;
        String[] inputs = new String[] { "aab", "bbbbb", "pwwkew" };
        int[] expectedOutputs = new int[] { 2, 1, 3 };

        for (int i = 0; i < numberOfTestCases; i++) {
            System.out.println("Test Case " + i + ": " + inputs[i]);
            System.out.println("\tExpected: " + expectedOutputs[i]);
            System.out.println("\tActual: " + longestUniqueSubstring(inputs[i]));
        }
    }
}