import java.util.HashMap;
public class GridPath {
	static int[][] grid;
	public static void main(String[] args){
		//grid = new int[][] {{1, 1, 1}, {2, 2, 3}, {2, 2, 1}};
		grid = new int[100][100];
		for (int r = 0; r < grid.length; ++r){
			for (int c = 0; c < grid[r].length; ++c){
				grid[r][c] = 1;
			}
		}
		System.out.println("Starting");
		System.out.println(evalPath());
	}

	static int evalPath(){
		return evalPath(0, 0, grid[0][0]);
	}
	// Technically just two inputs; I left row and col separate because I didn't particularly care to combine them
	static int evalPath(int row, int col, int cost){
		if (!(row + 1 < grid.length) && !(col + 1 < grid[0].length)){
			return cost;
		}
		else if (!(row + 1 < grid.length)){
			return evalPath(row, col + 1, cost + grid[row][col + 1]);
		}
		else if (!(col + 1 < grid[0].length)){
			return evalPath(row + 1, col, cost + grid[row + 1][col]);
		}
		return Math.min(evalPath(row + 1, col, cost + grid[row+1][col]), evalPath(row, col+1, cost + grid[row][col+1]));
	}
}
