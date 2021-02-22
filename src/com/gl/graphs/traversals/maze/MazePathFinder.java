package com.gl.graphs.traversals.maze;

/**
 *     1,1,1,1,1
 *     1,2,0,1,1
 *     1,1,0,1,1
 *     1,1,0,3,1
 *     1,1,0,1,1
 *     1,1,1,1,1
 *
 *     1-> wall
 *     0 -> path
 *     2 -> start
 *     3 -> exit
 *
 */
public class MazePathFinder {

  private int[][] mazePath ;
  private boolean[][] visited ;
  private int sRow ;
  private int sCol ;

  public MazePathFinder(int[][] mazePath, boolean[][] visited , int sRow , int saCol) {
    this.mazePath = mazePath;
    this.visited = visited;
    this.sRow = sRow ;
    this.sCol = sCol;
  }

  /**
   * This method will contain the logic to find the path
   */
  public void findTheWay(){
    if(pathExits(this.sRow,this.sCol)){
      System.out.println("Path found for the Exit gate");
    }else{
      System.out.println("No path found for the Exit gate");
    }
  }

  /**
   * This method will return true, if the path exists, else will return false
   * @param rowIndex
   * @param columnIndex
   * @return
   */
  private boolean pathExits(int rowIndex, int columnIndex) {
    System.out.println("Visiting row : "+rowIndex +" and column : "+columnIndex);

    if(mazePath[rowIndex][columnIndex]==3){
      return true ;
    }
    int endOfMage = mazePath.length;
    //validation of rowIndex and columnIndex
    if(visited[rowIndex][columnIndex]){
      return false ;
    }else if (rowIndex <0 || rowIndex>=endOfMage){
      return false;
    }else if(columnIndex<0 || columnIndex >=endOfMage){
      return false ;
    }else if(mazePath[rowIndex][columnIndex]==1){
      return false ;
    }else{
      this.visited[rowIndex][columnIndex] = true ;
      return pathExits(rowIndex+1,columnIndex) || pathExits(rowIndex,columnIndex+1)
          || pathExits(rowIndex,columnIndex-1)|| pathExits(rowIndex-1,columnIndex);
    }

  }
}
