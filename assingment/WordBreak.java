package JavaPW.assingment;

import java.util.*;

public class WordBreak {

    /**
     * Checks if string 's' can be segmented into words from 'wordDict'.
     */
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        int n = s.length();

        boolean[] dp = new boolean[n + 1];
        dp[0] = true; // Empty string can always be segmented

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && dict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: the string to check
        System.out.print("Enter the string to check: ");
        String s = sc.nextLine();

        // Input: dictionary size
        System.out.print("Enter the number of words in the dictionary: ");
        int dictSize = sc.nextInt();
        sc.nextLine(); // Consume newline

        List<String> wordDict = new ArrayList<>();
        System.out.println("Enter " + dictSize + " dictionary words:");
        for (int i = 0; i < dictSize; i++) {
            wordDict.add(sc.nextLine());
        }

        // Check and display result
        boolean result = wordBreak(s, wordDict);
        if (result) {
            System.out.println("The string CAN be segmented using the dictionary.");
        } else {
            System.out.println("The string CANNOT be segmented using the dictionary.");
        }

        sc.close();
    }
}
