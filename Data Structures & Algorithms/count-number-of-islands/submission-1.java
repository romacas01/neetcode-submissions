class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][] visited = new boolean[rows][cols];

        int islandCount = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                if (grid[row][col] == '1' && !visited[row][col]) {

                    islandCount++;

                    exploreIsland(grid, visited, row, col);
                }
            }
        }

        return islandCount;
    }

    private void exploreIsland(
            char[][] grid,
            boolean[][] visited,
            int row,
            int col) {

        // Outside grid
        if (row < 0 || row >= grid.length ||
            col < 0 || col >= grid[0].length) {
            return;
        }

        // Water
        if (grid[row][col] == '0') {
            return;
        }

        // Already explored
        if (visited[row][col]) {
            return;
        }

        visited[row][col] = true;

        // Up
        exploreIsland(grid, visited, row - 1, col);

        // Down
        exploreIsland(grid, visited, row + 1, col);

        // Left
        exploreIsland(grid, visited, row, col - 1);

        // Right
        exploreIsland(grid, visited, row, col + 1);
    }
}