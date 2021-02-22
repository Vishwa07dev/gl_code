package com.gl.graphs.traversals.bellman;

import java.util.ArrayList;
import java.util.List ;

/**
 * This class will indicate the vertex of the class
 * 1. name
 * 2. visited
 * 3. distance
 * 4. list of out going edges
 */
public class Vertex {

  private String name ;
  private boolean visited;
  private double distance= Double.MAX_VALUE;
  private Vertex predecessor ; // in the shortest path, which vertex should be visited before this vertex
  private List<Edge> adjacencies ;

  public Vertex(String name) {
    this.name = name;
    adjacencies = new ArrayList<>();

  }

  /**
   * This method will add the outgoing edge to the neighbouring Vertex
   * @param edge
   */
  public void addNeighbour(Edge edge){
    this.adjacencies.add(edge);
  }

  @Override
  public String toString() {
    return "Vertex{" + "name='" + name + '\'' + '}';
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

  public double getDistance() {
    return distance;
  }

  public void setDistance(double distance) {
    this.distance = distance;
  }

  public Vertex getPredecessor() {
    return predecessor;
  }

  public void setPredecessor(Vertex predecessor) {
    this.predecessor = predecessor;
  }

  public List<Edge> getAdjacencies() {
    return adjacencies;
  }

  public void setAdjacencies(List<Edge> adjacencies) {
    this.adjacencies = adjacencies;
  }
}
