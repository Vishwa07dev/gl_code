package com.gl.graphs.kruskals;

/**
 * This class typically represents the path or the edge between vertex
 *
 * 1. weight
 * 2. starting vertex
 * 3. target vertex
 */
public class Edge implements Comparable<Edge> {

  private double weight ;
  private Vertex startVertex ;
  private Vertex targetVertex ;

  public Edge(double weight, Vertex startVertex, Vertex targetVertex) {
    this.weight = weight;
    this.startVertex = startVertex;
    this.targetVertex = targetVertex;
  }

  @Override
  public String toString() {
    return "Edge{" + "weight=" + weight + ", startVertex=" + startVertex + ", targetVertex=" + targetVertex + '}';
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public Vertex getStartVertex() {
    return startVertex;
  }

  public void setStartVertex(Vertex startVertex) {
    this.startVertex = startVertex;
  }

  public Vertex getTargetVertex() {
    return targetVertex;
  }

  public void setTargetVertex(Vertex targetVertex) {
    this.targetVertex = targetVertex;
  }

  @Override
  public int compareTo(Edge otherEdge) {
    return Double.compare(this.weight, otherEdge.getWeight());
  }
}
