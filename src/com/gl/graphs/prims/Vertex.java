package com.gl.graphs.prims;


import java.util.ArrayList;
import java.util.List ;
/**
 * This class will represent the Vertex of the given graph
 */
public class Vertex {
  private String name ;
  private boolean  visited ;
  private Vertex previousVertex ;
  private List<Edge> adjacencyList ;

  public Vertex(String name) {
    this.name = name;
    this.adjacencyList = new ArrayList<>();
  }

  @Override
  public String toString() {
    return "Vertex{" + "name='" + name + '\'' + '}';
  }

  public void addEdge(Edge edge){
    this.adjacencyList.add(edge);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isVisited() {
    return visited;
  }

  public void setVisited(boolean visited) {
    this.visited = visited;
  }

  public Vertex getPreviousVertex() {
    return previousVertex;
  }

  public void setPreviousVertex(Vertex previousVertex) {
    this.previousVertex = previousVertex;
  }

  public List<Edge> getAdjacencyList() {
    return adjacencyList;
  }

  public void setAdjacencyList(List<Edge> adjacencyList) {
    this.adjacencyList = adjacencyList;
  }
}
