package com.gl.graphs;

/**          1    2    3    4
 *      1    0    1    0    1
 *      2    0    0    1    0
 *      3    0    0    0    1
 *      4    0    0    0    0
 *
 *      mat[1,3]  --> 0 , there is no edge between vertex 1 and 3
 *
 *      mat[1,2] --> 1 , there is an edge between vertex 1 and 2
 *
 *   This is being used to represent directed graph
 */
public class AdjacencyMatrixGraph {

  private boolean[][] adjMatrix ;
  private int vertexCount ;

  public AdjacencyMatrixGraph(int vertexCount) {
    this.vertexCount = vertexCount;
    adjMatrix = new boolean[vertexCount][vertexCount] ; // V*V
  }

  /**
   * This method will add the edges between the vertex i and vertex j
   * if i and j are valid..
   * @param i
   * @param j
   *
   * TC -> O(1)
   */
  public void addEdge(int i , int j){
    //validate the arguments
    if(i >=0 && i<vertexCount && j>=0 && j<vertexCount){
      // i and j are valid
      this.adjMatrix[i][j]=true;
      //this.adjMatrix[j][i] = true ; -- if undirected
    }

  }

  /**
   * This method will remove the edge between i and j
   * @param i
   * @param j
   *
   * TC = O(1)
   */
  public void removeEdge(int i, int j){
    if(i>=0 && i < vertexCount && j>=0 && j<vertexCount){
      this.adjMatrix[i][j]=false;
    }
  }

  /**
   * This will tell us , whether there is any link/edge between i and j or not
   * @param i
   * @param j
   * @return
   *
   * TC = O(1)
   */
  public boolean isEdge(int i , int j){
    if(i<0 || i>=vertexCount || j<0 || j>vertexCount){
      return false ;
    }
    return adjMatrix[i][j];
  }

  /**
   * This method will print all  the edges of the graph
   *
   * TC= O(V*V)
   */
  public void getAllEdges(){
    for(int i=0;i<vertexCount;i++){
      for(int j=0 ; j<vertexCount;j++){
        if(adjMatrix[i][j]){
          System.out.println("Edge between vertex : "+ i +" and "+j);
        }
      }
    }
  }

}
