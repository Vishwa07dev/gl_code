package com.gl.graphs.traversals.maze;

/**
 * This will act as the test method
 */
public class Test {

  public static void main(String[] args) {
    //Maze path map
    int[][] maze = {
        {1,1,1,1,1},
        {1,2,0,1,1},
        {1,1,0,1,1},
        {1,1,1,3,1},
        {1,1,0,1,1},
        {1,1,1,1,1}
    };

    boolean[][] visited = new boolean[maze.length][maze[0].length];

    MazePathFinder mazePathFinder = new MazePathFinder(maze, visited , 1,1);

    mazePathFinder.findTheWay();
  }

}
