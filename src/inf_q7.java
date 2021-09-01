import java.util.HashSet;
import java.util.Set;

public class inf_q7 {
    /*
    이차원배열 matrixZero
     */
    public void solve(int[][] grid) {
        print(grid);

        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    System.out.print("[" + i + "][" + j + "]" + grid[i][j] + " ");
                    rowSet.add(i);
                    colSet.add(j);
                }
                System.out.println();
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (rowSet.contains(i) || colSet.contains(j)) {
                    grid[i][j] = 0;
                    System.out.print("[" + i + "][" + j + "]" + grid[i][j] + " ");
                }
            }
            System.out.println();
        }

        System.out.println("======result=======");
        print(grid);

    }

    public void print(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print("[" + i + "][" + j + "]" + grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
