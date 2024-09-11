import java.util.*;

/*
 * JPMC Coding Interview Question: Number With 2
 */

public class NumberWithTwo {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(getNthNumberWithTwo(n));

        scanner.close();
    }

    private static int getNthNumberWithTwo(int n) {
        return 10 * (n - 1) + 2;
    }
}
