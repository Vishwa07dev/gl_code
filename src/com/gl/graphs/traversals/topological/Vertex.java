package com.gl.graphs.traversals.topological;

import java.util.List;
import java.util.ArrayList;


/**
 * This class represents the vertex of the graph
 *
 * 1. data
 * 2. whether it's visited or not already
 * 3. it's neighbours
 */
public class Vertex {

  private String name ;
  public boolean isVisited ;

  private List<Vertex>  neighbours ;

  public Vertex(String name) {
    this.name = name;
    neighbours = new ArrayList<>();
  }


  public void addNeighbour(Vertex vertex){
    this.neighbours.add(vertex);
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

  public List<Vertex> getNeighbours() {
    return neighbours;
  }

  public void setNeighbours(List<Vertex> neighbours) {
    this.neighbours = neighbours;
  }
}
