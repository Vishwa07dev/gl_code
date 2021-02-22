package com.gl.graphs.traversals.bellman;

/**
 * This indicates the path between two Vertex
 * 1.starting vertex
 * 2.target vertex
 * 3. What is the weight of the edge
 */
public class Edge {

  private double weight ;
  private Vertex sourceVertex ;
  private Vertex targetVertex ;

  public Edge(double weight, Vertex sourceVertex, Vertex targetVertex) {
    this.weight = weight;
    this.sourceVertex = sourceVertex;
    this.targetVertex = targetVertex;
  }

  @Override
  public String toString() {
    return "Edge{" + "weight=" + weight + ", sourceVertex=" + sourceVertex + ", targetVertex=" + targetVertex + '}';
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public Vertex getSourceVertex() {
    return sourceVertex;
  }

  public void setSourceVertex(Vertex sourceVertex) {
    this.sourceVertex = sourceVertex;
  }

  public Vertex getTargetVertex() {
    return targetVertex;
  }

  public void setTargetVertex(Vertex targetVertex) {
    this.targetVertex = targetVertex;
  }
}
