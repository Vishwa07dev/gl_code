package com.gl.graphs;

import java.util.ArrayList;
import java.util.List;


/**
 * This will contain following information :
 * 1. Identifier for the vertex
 * 2. What are the neighbours of the given vertex
 */
public class Vertex {
  private String name ;
  private List<Vertex> adjacencyList ;

  public Vertex(String name) {
    this.name = name;
    adjacencyList = new ArrayList<>();
  }

  /**
   *  This method will be used to add vertex as the neighbour of the given Vertex
   * @param vertex
   *
   * TC = O(1)
   */
  public void addNeighbour(Vertex vertex){
    if(vertex==null){ // validation of the input argument
      return ;
    }
    this.adjacencyList.add(vertex);
  }

  /**
   * This method will be used to remove the vertex from the neighbour list
   * @param vertex
   *
   * TC: O(E)
   */
  public void removeNeighbour(Vertex vertex){
    if(vertex== null){
      return ;
    }
    this.adjacencyList.remove(vertex);
  }

  /**
   * This will be used to show all the neighbours of the given vertex
   * TC: O(E)
   */
  public void showNeighbours(){
    for(Vertex v : this.adjacencyList){
      System.out.println("Edge between "+ this.name + " and "+ v.getName());
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Vertex> getAdjacencyList() {
    return adjacencyList;
  }

  public void setAdjacencyList(List<Vertex> adjacencyList) {
    this.adjacencyList = adjacencyList;
  }

  @Override
  public String toString() {
    return "Vertex{" + "name='" + name + '\'' + ", adjacencyList=" + adjacencyList + '}';
  }
}
