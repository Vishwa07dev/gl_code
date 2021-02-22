package com.gl.graphs.kruskals;

/**
 * This represents the vertex of the graph
 * 1. Identifier - name
 * 2. Node node
 */
public class Vertex {

  private String name ;
  private Node node ;

  public Vertex(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Vertex{" + "name='" + name + '\'' + ", node=" + node + '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Node getNode() {
    return node;
  }

  public void setNode(Node node) {
    this.node = node;
  }


}
