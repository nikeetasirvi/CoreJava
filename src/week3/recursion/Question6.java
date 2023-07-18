package week3.recursion;

import java.util.*;

public class Question6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        floodfill(arr, 0, 0, "");
    }
    
    // Note: You can add more arguments to the method if needed
    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf) {

         int n = maze.length;
        int m = maze[0].length;
        if (sr == n - 1 && sc == m - 1) {
            System.out.println(asf);
            return;
        }
        int value = maze[sr][sc];
        maze[sr][sc] = 1;
        if (sr > 0 && maze[sr - 1][sc] == 0) {
            floodfill(maze, sr - 1, sc, asf + "t");
        }
        if (sc > 0 && maze[sr][sc - 1] == 0) {
            floodfill(maze, sr, sc - 1, asf + "l");
        }
        if (sr < n - 1 && maze[sr + 1][sc] == 0) {
            floodfill(maze, sr + 1, sc, asf + "d");
        }
        if (sc < m - 1 && maze[sr][sc + 1] == 0) {
            floodfill(maze, sr, sc + 1, asf + "r");
        }
        maze[sr][sc] = value;

    }
}
