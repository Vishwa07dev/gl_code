package com.gl.graphs.traversals.cycledetection;

import java.util.ArrayList;
import java.util.List ;
/**
 * This class represents the vertex in a graph
 * 1. data - identifier
 * 2. isBeingVisited or isVisited
 * 3. list of neighbouring vertices
 */
public class Vertex {

  private String name ;
  private boolean visited ;
  private boolean beingVisited ;
  private List<Vertex> vertexList;

  public Vertex(String name) {
    this.name = name;
    vertexList = new ArrayList<>();
  }

  public void addNeighbour(Vertex vertex){
    this.vertexList.add(vertex);
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

  public boolean isBeingVisited() {
    return beingVisited;
  }

  public void setBeingVisited(boolean beingVisited) {
    this.beingVisited = beingVisited;
  }

  public List<Vertex> getVertexList() {
    return vertexList;
  }

  public void setVertexList(List<Vertex> vertexList) {
    this.vertexList = vertexList;
  }
}
