import java.util.*;

/*
 * JPMC Coding Interview Question: New Number System
 * 
 * Here is about to introduce a new kind of number system. Where instead of 10 digits there is 20, 
 * from a to t, all in small. Now a means 1, b means 2 and t means 20, then aa means 21. Now for 
 * a new number you have to print the decimal form it. Note that the letters in the input string 
 * will be lower case and from a to t. 
 * 
 * Input:
 *  e
 * Output:
 *  5
 * 
 * Input:
 *  ac
 * Output:
 *  23
 * 
 */

public class NewNumberSystem {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a letter a-t to convert:");
        String input = scanner.nextLine();

        try {
            System.out.println(convert(input));
        } catch (InvalidInputException e) {
            System.err.println("Cannot convert letter " + e.getInvalidLetter());
        }

        scanner.close();
    }

    private static int convert(String input) throws InvalidInputException {
        int result = 0;

        for (int i = input.length() - 1, placeValue = 1; i >= 0; i--, placeValue *= 20) {
            char currentLetter = input.charAt(i);
            int currentLetterValue = getLetterValue(currentLetter);

            if (currentLetterValue == -1) {
                throw new InvalidInputException(currentLetter);
            }

            result += currentLetterValue * placeValue;
        }

        return result;
    }

    private static int getLetterValue(char letter) {
        switch (letter) {
            case 'a':
                return 1;
            case 'b':
                return 2;
            case 'c':
                return 3;
            case 'd':
                return 4;
            case 'e':
                return 5;
            case 'f':
                return 6;
            case 'g':
                return 7;
            case 'h':
                return 8;
            case 'i':
                return 9;
            case 'j':
                return 10;
            case 'k':
                return 11;
            case 'l':
                return 12;
            case 'm':
                return 13;
            case 'n':
                return 14;
            case 'o':
                return 15;
            case 'p':
                return 16;
            case 'q':
                return 17;
            case 'r':
                return 18;
            case 's':
                return 19;
            case 't':
                return 20;
            default:
                return -1;
        }
    }

    private static class InvalidInputException extends Exception {
        private char invalidLetter;

        public InvalidInputException(char invalidLetter) {
            super();
            this.invalidLetter = invalidLetter;
        }

        public char getInvalidLetter() {
            return this.invalidLetter;
        }
    }
}
