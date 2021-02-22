package com.gl.graphs.traversals.bellman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class contains the logic for the Bellman Ford algorithm
 */
public class BellManFordAlgorithm {

  private List<Edge> edges ;
  private List<Vertex> vertexList ;

  public BellManFordAlgorithm(List<Edge> edges, List<Vertex> vertexList) {
    this.edges = edges;
    this.vertexList = vertexList;
  }

  /**
   * This method will set the minimum distance of each vertex from the sourceVertex passed
   * as argument
   * @param sourceVertex
   */
  public void bellmanFordAlgorithm(Vertex sourceVertex){
    sourceVertex.setDistance(0);

    // All the vertices will be updated with the minimum distance from source vertex
    for(int i=1;i<=vertexList.size()-1;i++){
      for(Edge edge : edges){
        if(edge.getSourceVertex().getDistance() == Double.MAX_VALUE){
          continue ;
        }
        double newDistance = edge.getSourceVertex().getDistance() +edge.getWeight();

        if(newDistance < edge.getTargetVertex().getDistance()){
          edge.getTargetVertex().setDistance(newDistance);
          edge.getTargetVertex().setPredecessor(edge.getSourceVertex());
        }
      }
    }

    //We need to check for the negative cycles
    for(Edge edge : edges){
      if(edge.getSourceVertex().getDistance() != Double.MAX_VALUE){
        if(hasCycle(edge)){
          System.out.println("Found the negative cycle");
          return ;
        }
      }
    }
  }

  private boolean hasCycle(Edge edge) {

    return edge.getSourceVertex().getDistance() + edge.getWeight() < edge.getTargetVertex().getDistance();
  }

  /**
   * This method
   * @param targetVertex
   * @return
   */
  public List<Vertex> shortestPathTraversal(Vertex targetVertex){
     if(targetVertex.getDistance() == Double.MAX_VALUE){
       System.out.println("There is no path possible between source and target vertex");
     }

     List<Vertex> shortestPath = new ArrayList<>();

     Vertex currentVertex = targetVertex ;
     while(currentVertex !=null){
       shortestPath.add(currentVertex);
       currentVertex = currentVertex.getPredecessor();
     }

    Collections.reverse(shortestPath);
     return  shortestPath ;
  }
}
