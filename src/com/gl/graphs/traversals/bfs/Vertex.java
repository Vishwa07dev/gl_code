package com.gl.graphs.traversals.bfs;

import java.util.ArrayList;
import java.util.List;


public class Vertex {

  private String name ;
  private boolean isVisited ;
  private List<Vertex> adjList ;

  public Vertex(String name) {
    this.name = name;
    this.adjList = new ArrayList<>();
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
    return isVisited;
  }

  public void setVisited(boolean visited) {
    isVisited = visited;
  }

  public List<Vertex> getAdjList() {
    return adjList;
  }

  public void setAdjList(List<Vertex> adjList) {
    this.adjList = adjList;
  }

  public void addNeighbour(Vertex v){
    this.adjList.add(v);
  }

}
