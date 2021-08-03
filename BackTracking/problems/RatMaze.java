package problems;

public class RatMaze {

	public static void main(String[] args) {

		int[][] maze = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };
		int[][] sol = new int[maze.length][maze.length];

		boolean res = solveMaze(maze, sol);
		if (res == true) {
			System.out.println("YES!");
		} else {
			System.out.println("NO!");
		}

	}

	static boolean solveMaze(int[][] maze, int[][] sol) {

		if (solveMazeRec(maze, sol, 0, 0) == false) {
			System.out.println("Solution does not exist");
			return false;
		} else {
			printMazePath(sol);
			return true;
		}
	}

	static boolean solveMazeRec(int[][] maze, int[][] sol, int i, int j) {

		if (i == maze.length - 1 && j == maze.length - 1) {
			sol[i][j] = 1;
			return true;
		}

		if (isSafe(maze, i, j)) {

			sol[i][j] = 1;

			if (solveMazeRec(maze, sol, i + 1, j) == true) {
				return true;
			} else if (solveMazeRec(maze, sol, i, j + 1) == true) {
				return true;
			}

			sol[i][j] = 0;
		}
		return false;
	}

	/**
	 * Existence of this type of function is a property of BackTracking Algorithms.
	 * We avoid unnecessary recursions by checking the breaking conditions. 
	 * @param maze
	 * @param i
	 * @param j
	 * @return
	 */
	static boolean isSafe(int[][] maze, int i, int j) {
		return (i < maze.length) && (j < maze.length) && (maze[i][j] == 1);
	}

	static void printMazePath(int[][] sol) {
		for (int i = 0; i < sol.length; i++) {
			for (int j = 0; j < sol.length; j++) {
				System.out.print(sol[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
