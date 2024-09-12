package Chase;

import java.io.IOException;

class Result {
    // Answer goes here
    private static boolean hasSubString(String subString, String s) {
        if (s.contains(subString)) {
            return true;
        }
        return false;
    }

    private static String removeSubString(String subString, String s) {
        String result = "";
        int startIndex = s.indexOf(subString);
        int endIndex = subString.length() - 1 + startIndex;
        result += s.substring(0, startIndex);
        result += s.substring(endIndex + 1, s.length());
        return result;
    }

    public static String getFinalString(String s) {
        String result = s;
        while (hasSubString("AWS", s)) {
            result = removeSubString("AWS", s);
        }

        return result;
    }
}

public class QuestionOne {
    public static void main(String[] args) throws IOException {
        String s = "AWSG";
        String result = Result.getFinalString(s);
        System.out.println(result);
    }
}
