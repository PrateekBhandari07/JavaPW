package JavaPW.assingment;

import java.util.Scanner;

public class WordSearch {

    /**
     * Checks if 'word' exists in the 'board' using DFS backtracking.
     */
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        boolean[][] visited = new boolean[m][n];

        // Try to start DFS from every cell
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, i, j, 0, visited)) {
                    return true; // Found the word
                }
            }
        }
        return false; // Word not found
    }

    /**
     * DFS backtracking function.
     */
    private boolean dfs(char[][] board, String word, int i, int j, int index, boolean[][] visited) {
        if (index == word.length()) {
            return true; // Entire word matched
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length ||
                visited[i][j] || board[i][j] != word.charAt(index)) {
            return false; // Out of bounds, mismatch, or already visited
        }

        visited[i][j] = true; // Mark visited

        // Explore all 4 directions
        boolean found = dfs(board, word, i + 1, j, index + 1, visited) ||
                dfs(board, word, i - 1, j, index + 1, visited) ||
                dfs(board, word, i, j + 1, index + 1, visited) ||
                dfs(board, word, i, j - 1, index + 1, visited);

        visited[i][j] = false; // Backtrack
        return found;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordSearch solver = new WordSearch();

        // Input board dimensions
        System.out.print("Enter number of rows in the board: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns in the board: ");
        int cols = sc.nextInt();
        sc.nextLine(); // Consume newline

        char[][] board = new char[rows][cols];
        System.out.println("Enter the board row-wise (without spaces):");
        for (int i = 0; i < rows; i++) {
            String line;
            while (true) {
                System.out.print("Row " + (i + 1) + ": ");
                line = sc.nextLine().trim();
                if (line.length() == cols) {
                    break;
                } else {
                    System.out.println("Please enter exactly " + cols + " characters.");
                }
            }
            for (int j = 0; j < cols; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        // Input the word to search
        System.out.print("Enter the word to search: ");
        String word = sc.nextLine().trim();

        // Check and display result
        boolean result = solver.exist(board, word);
        if (result) {
            System.out.println("The word EXISTS in the board.");
        } else {
            System.out.println("The word DOES NOT EXIST in the board.");
        }

        sc.close();
    }
}
