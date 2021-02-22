package com.gl.graphs.traversals.cycledetection;

import java.util.List ;
/**
 * This class will hold all the logic for detecting cycle in the graph
 */
public class CycleDetection {

  public void checkCycle(List<Vertex> vertexList){

    for(Vertex vertex : vertexList){
      if(!vertex.isVisited()){
        detectCycle(vertex);
      }
    }
  }

  /**
   * This method will typically follow the logic of DFS
   * @param vertex
   */
  private void detectCycle(Vertex vertex) {
    System.out.println("Starting the DFS traversal of : "+vertex);

    vertex.setBeingVisited(true);

    for(Vertex neighbour : vertex.getVertexList()){
      System.out.println("Visiting the neighbour of vertex "+ neighbour);

      if(neighbour.isBeingVisited()){
        System.out.println("This is the backward edge, so there is a cycle");
        return ;
      }
      if(!neighbour.isVisited()){
        System.out.println("Visiting neighbour vertex : "+ neighbour + " recursively");
        neighbour.setBeingVisited(true);
        detectCycle(neighbour);
      }
    }
    //Once the above for loop is done,the vertex in hand is not done with all the neighbours
    System.out.println("Setting the beingVisited value to false and visited to true for vertex : "+ vertex);
    vertex.setBeingVisited(false);
    vertex.setVisited(true);
  }
}
