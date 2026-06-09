class Solution {
    public int numIslands(char[][] grid) {
        int islandCount = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {

                if (grid[row][col] == '1') {
                    islandCount++;

                    exploreIsland(grid, row, col);
                }
            }
        }

        return islandCount;
    }

    private void exploreIsland(char[][] grid, int row, int col) {

        // Outside the grid
        if (row < 0 || row >= grid.length ||
            col < 0 || col >= grid[0].length) {
            return;
        }

        // Water or already visited
        if (grid[row][col] == '0') {
            return;
        }

        // Mark current land as visited
        grid[row][col] = '0';

        // Explore neighbours
        exploreIsland(grid, row - 1, col); // up
        exploreIsland(grid, row + 1, col); // down
        exploreIsland(grid, row, col - 1); // left
        exploreIsland(grid, row, col + 1); // right
    }
}
