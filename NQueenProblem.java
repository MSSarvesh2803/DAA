import java.util.Scanner;

public class NQueenProblem {
    static void printSolution(int board[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }

    static boolean isSafe(int board[][], int row, int col, int n) {
        int i, j;
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;
        for (i = row, j = col; j >= 0 && i < n; i++, j--)
            if (board[i][j] == 1)
                return false;
        return true;
    }

    public static boolean solveNQueen(int board[][], int col, int n) {
        if (col >= n)
            return true;

        for (int i = 0; i < n; i++) {
            if (isSafe(board, i, col, n)) {
                board[i][col] = 1;
                if (solveNQueen(board, col + 1, n))
                    return true;
                board[i][col] = 0;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the chessboard: ");
        int n = sc.nextInt();
        int board[][] = new int[n][n];
        if (!solveNQueen(board, 0, n)) {
            System.out.print("Solution does not exist");
        } else {
            System.out.println("Solution exists:");
            printSolution(board, n);
        }
        sc.close();
    }
}
