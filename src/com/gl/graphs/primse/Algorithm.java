package com.gl.graphs.primse;


import java.util.List ;
import java.util.PriorityQueue;


/**
 * This class contains the logic for the eager Prims algorithm
 * for finding the MST
 */
public class Algorithm {

  private List<Vertex> vertexList ;
  private PriorityQueue<Vertex> heap ;

  public Algorithm(Graph graph){
    this.vertexList = graph.getVertexList();
    this.heap = new PriorityQueue<>();
  }


  public void spanningTree(){
    for(Vertex vertex : vertexList){
      if(!vertex.isVisited()){
        eagerPrim(vertex);
      }
    }
  }

  private void eagerPrim(Vertex vertex) {

    vertex.setDistance(0);
    this.heap.add(vertex);

    while(!heap.isEmpty()){
      Vertex v = heap.remove();
      scanVertex(v);
    }
  }

  private void scanVertex(Vertex vertex) {
     vertex.setVisited(true);

     for(Edge edge : vertex.getAdjacencies()){
       Vertex w = edge.getTargetVertex();

       if(w.isVisited()) continue;

       if(edge.getWeight() < w.getDistance()){
         w.setDistance(edge.getWeight());
         w.setEdge(edge);

         if(this.heap.contains(w)){
           this.heap.remove(w);
         }
         this.heap.add(w);
       }
     }
  }


  public void show(){
    for(Vertex  vertex : vertexList){
      Edge edge = vertex.getEdge() ;

      if(edge !=null){
        System.out.println("Edge : "+edge.getStartVertex() + " - "+ edge.getTargetVertex());
      }
    }
  }
}
