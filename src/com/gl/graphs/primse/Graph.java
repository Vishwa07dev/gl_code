package com.gl.graphs.primse;

import java.util.ArrayList;
import java.util.List ;

/**
 * This represents the vertices and the path between them which is known as edges
 */
public class Graph {

  private List<Vertex> vertexList ;
  private List<Edge> edgeList;



  public Graph() {

    vertexList = new ArrayList<>();
    edgeList = new ArrayList<>();
  }


  public void addEdge(Edge edge){
    Vertex startVertex = edge.getStartVertex();
    Vertex targetVertex = edge.getTargetVertex();

    startVertex.addEdge(new Edge(edge.getWeight(),startVertex, edge.getTargetVertex()));
    targetVertex.addEdge(new Edge(edge.getWeight(), targetVertex, edge.getStartVertex()));

  }

  public List<Vertex> getVertexList() {
    return vertexList;
  }

  public void setVertexList(List<Vertex> vertexList) {
    this.vertexList = vertexList;
  }

  public List<Edge> getEdgeList() {
    return edgeList;
  }

  public void setEdgeList(List<Edge> edgeList) {
    this.edgeList = edgeList;
  }

  public void addVertex(Vertex vertex) {

    this.vertexList.add(vertex);
  }
}
