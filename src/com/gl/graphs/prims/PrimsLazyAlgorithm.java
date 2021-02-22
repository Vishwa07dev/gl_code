package com.gl.graphs.prims;

import java.util.ArrayList;
import java.util.List ;
import java.util.PriorityQueue;


/**
 * This class will hold the logic for the Prim's algorithm to find MST
 */
public class PrimsLazyAlgorithm {

  private List<Vertex> unvisitedVertexes ;
  private List<Edge> spanningTree ;
  private PriorityQueue<Edge> edgeHeap ;
  private double fullCost ;

  public PrimsLazyAlgorithm(List<Vertex> unvisitedVertexes) {
    this.unvisitedVertexes = unvisitedVertexes;
    spanningTree = new ArrayList<>();
    edgeHeap = new PriorityQueue<>();
  }

  public void primAlgorithm(Vertex startVertex){
    this.unvisitedVertexes.remove(startVertex);

    while(!unvisitedVertexes.isEmpty()){
      for(Edge edge : startVertex.getAdjacencyList()){
        if(this.unvisitedVertexes.contains(edge.getTargetVertex())){
          this.edgeHeap.add(edge);
        }
      }

      Edge edge = this.edgeHeap.remove();

      this.spanningTree.add(edge);
      this.fullCost += edge.getWeight();

      startVertex = edge.getTargetVertex();
      this.unvisitedVertexes.remove(startVertex);
    }
  }

  public void showSpanningTree(){
    System.out.println("Total cost/weight of MST created is : "+this.fullCost);

    for(Edge edge : spanningTree){
      System.out.println(edge.getStartVertex() + " - "+edge.getTargetVertex());
    }
  }
}
