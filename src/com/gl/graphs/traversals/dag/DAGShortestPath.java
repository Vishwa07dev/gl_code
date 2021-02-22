package com.gl.graphs.traversals.dag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.List ;


/**
 * This class will hold the logic for finding the shortest path in a DAG
 */
public class DAGShortestPath {

  public void shortestPath(Vertex sourceVertex){
    sourceVertex.setDistance(0);
    ToplogicalSorting toplogicalSorting = new ToplogicalSorting();

    toplogicalSorting.topologicalOrdering(sourceVertex);

    Stack<Vertex> stack = toplogicalSorting.getStack();

    for(Vertex vertex : stack){

      for( Edge edge : vertex.getAdjacencies()){
        Vertex u = edge.getStartVertex();
        Vertex v = edge.getTargetVertex();

        double newDistance = u.getDistance() + edge.getWeight();

        if(newDistance <v.getDistance()){
          v.setDistance(newDistance);
          v.setPredecessor(u);
        }
      }
    }
  }

  public List<Vertex> getShortestPath(Vertex targetVertex){

    if(targetVertex.getDistance() == Double.MAX_VALUE){
      System.out.println("No path from the source vertex to the target vertex");
      return null ;
    }

    System.out.println("Target vertex : "+ targetVertex + " is a distance = "+ targetVertex.getDistance());

    List<Vertex> shortestPath = new ArrayList<>();

    Vertex vertex = targetVertex;
    while(vertex!=null){
      shortestPath.add(vertex);
      vertex = vertex.getPredecessor();
    }
    Collections.reverse(shortestPath);

    return shortestPath ;
  }

}
