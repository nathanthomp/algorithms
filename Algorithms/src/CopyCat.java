import java.util.*;

/*
 * JPMC Coding Interview Question: Copy Cat
 * 
 * Ashish was copying from Rahit in the exam. So, Rahit told him to change the answers a 
 * little bit so that the examiner cannot find the fraud. But silly Ashish in the way 
 * started to change all the answers that were needed. He shuffled the letters in each 
 * word in a way where the maximum number of letters were misplaced.
 * 
 * The letters are all in lowercase.
 * 
 * Input:
 * 4
 * abababa
 * bbj
 * kj
 * kk
 * 
 * Output:
 * 6
 * 2
 * 2
 * 0
 * 
 */

public class CopyCat {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of words:");
        String input = scanner.nextLine();

        int numberOfWords;
        try {
            numberOfWords = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println(input + " is not a number");
            scanner.close();
            return;
        }

        String[] words = new String[numberOfWords];
        for (int i = 0; i < numberOfWords; i++) {
            System.out.println("Enter word:");
            words[i] = scanner.nextLine();
        }

        for (String word : words) {
            int numberOfDifferences = getNumberOfDifferences(word);
            System.out.println(numberOfDifferences);
        }

        scanner.close();
    }

    private static int getNumberOfDifferences(String word) {
        int result = 0;
        List<String> uniqueWords = new LinkedList<String>();
        uniqueWords.add(word);

        for (int index = 0; index < word.length() - 1; index++) {
            char currentLetter = word.charAt(index);
            char nextLetter = word.charAt(index + 1);

            
        }

        return result;
    }
}
