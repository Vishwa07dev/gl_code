package com.gl.graphs.traversals.dijkstra;

/**
 * This class will comprise of edge information
 * 1. Weight
 * 2. Starting vertex
 * 3. Target Vertex
 *
 */
public class Edge {

  private double weight ;
  private Vertex startVertex;
  private Vertex targetVertex;

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
}
