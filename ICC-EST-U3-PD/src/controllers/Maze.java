package controllers;

public class Maze {
    private boolean[][] maze;

    public Maze(boolean[][] maze) {
        this.maze = maze;
    }

    public void printMaze() {
        System.out.println("Laberinto cargado:");
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print((maze[i][j] ? "-" : "*"));
                if (j < maze[i].length - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
