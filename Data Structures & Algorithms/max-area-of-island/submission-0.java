class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if ((grid[row][col] == 1) && (!visited[row][col])) {
                    maxArea = Math.max(maxArea, checkLand(grid, visited, row, col));
                }
            }
        }

        return maxArea;
    }

    private int checkLand(int[][] grid, boolean[][] visited, int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) {
            return 0;
        }

        int area = 1;

        if (grid[row][col] == 0) {
            return 0;
        }

        if (visited[row][col]) {
            return 0;
        }

        visited[row][col] = true;

        area += checkLand(grid, visited, row - 1, col);
        area += checkLand(grid, visited, row + 1, col);
        area += checkLand(grid, visited, row, col - 1);
        area += checkLand(grid, visited, row, col + 1);

        return area;
    }
}
