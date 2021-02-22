package com.gl.graphs.primse;


import java.util.ArrayList;
import java.util.List ;
/**
 * This class represents the vertex or node in the class
 *
 * 1. name
 * 2. Edge - minimum edge for this vertex
 * 3. visited
 * 4. PreviousVertex
 * 5. distance
 * 6. List<Edge>  outgoing edges
 */
public class Vertex implements  Comparable<Vertex> {

  private String name ;
  private Edge edge ;
  private boolean visited;
  private Vertex prevVertex;
  private double distance = Double.POSITIVE_INFINITY;
  private List<Edge> adjacencies ;

  public Vertex(String name) {
    this.name = name;
    this.adjacencies = new ArrayList<>();
  }

  @Override
  public String toString() {
    return "Vertex{" + "name='" + name + '\'' + '}';
  }

  public void addEdge(Edge edge){
    this.adjacencies.add(edge);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Edge getEdge() {
    return edge;
  }

  public void setEdge(Edge edge) {
    this.edge = edge;
  }

  public boolean isVisited() {
    return visited;
  }

  public void setVisited(boolean visited) {
    this.visited = visited;
  }

  public Vertex getPrevVertex() {
    return prevVertex;
  }

  public void setPrevVertex(Vertex prevVertex) {
    this.prevVertex = prevVertex;
  }

  public double getDistance() {
    return distance;
  }

  public void setDistance(double distance) {
    this.distance = distance;
  }

  public List<Edge> getAdjacencies() {
    return adjacencies;
  }

  public void setAdjacencies(List<Edge> adjacencies) {
    this.adjacencies = adjacencies;
  }

  @Override
  public int compareTo(Vertex otherVertex) {
    return Double.compare(this.distance, otherVertex.getDistance());
  }
}
