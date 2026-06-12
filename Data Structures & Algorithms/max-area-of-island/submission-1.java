class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][] visited = new boolean[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                maxArea = Math.max(maxArea, checkIslands(grid, visited, row, col));
            }
        }

        return maxArea;
    }

    private int checkIslands(int[][] grid, boolean[][] visited, int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) {
            return 0;
        }

        if (grid[row][col] == 0) {
            return 0;
        }

        if (visited[row][col]) {
            return 0;
        }

        int area = 1;
        visited[row][col] = true;

        area += checkIslands(grid, visited, row - 1, col);
        area += checkIslands(grid, visited, row + 1, col);
        area += checkIslands(grid, visited, row, col - 1);
        area += checkIslands(grid, visited, row, col + 1);

        return area;
    }
}
