package com.gl.graphs.unionfind;

/**
 * This class represents the vertex of a given class
 * 1.name
 * 2.node
 */
public class Vertex {
  private String name ;
  private Node node ;

  public Vertex(String name) {
    this.name = name;
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

  public Node getNode() {
    return node;
  }

  public void setNode(Node node) {
    this.node = node;
  }
}
