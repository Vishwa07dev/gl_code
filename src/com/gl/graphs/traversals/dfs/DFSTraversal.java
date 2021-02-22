package com.gl.graphs.traversals.dfs;

import java.util.List;
import java.util.Stack;


public class DFSTraversal {

  private Stack<Vertex> stack ;

  public DFSTraversal() {
    this.stack = new Stack<>();
  }

  /**
   * We pass the list of vertics to cover all the clusters
   * @param vertexList
   */
  public void dfsTraverse( List<Vertex> vertexList){
    // This is needed for the cluster of graph..
    //not needed if single cluster is present
    for( Vertex vertex : vertexList){
      if(!vertex.isVisited()){
        vertex.setVisited(true);
        dfsRec(vertex);
      }
    }

  }

  private void dfsRec(Vertex rootVertex){
    if(rootVertex == null){
      return;
    }
     System.out.println("Visited vertex : "+rootVertex);
    for(Vertex neighbour : rootVertex.getNeighbours()){
      if(!neighbour.isVisited()){
        neighbour.setVisited(true);
        dfsRec(neighbour);
      }
    }
  }

  /**
   *
   *
   * 1
   *
   * 2 3 4 5
   *
   *        6 7 8 9
   *
   *               11 12 13 14
   *
   *
   * @param rootVertex
   */

  private void dfsIter(Vertex rootVertex) {
      this.stack.add(rootVertex);
      rootVertex.setVisited(true);

      while(!this.stack.isEmpty()){
        Vertex currentVertex = this.stack.pop();
        System.out.println("Visited : "+currentVertex);

        for(Vertex v : currentVertex.getNeighbours()){
          if(!v.isVisited()){
            v.setVisited(true);
            this.stack.push(v);
          }
        }
      }

  }
}
