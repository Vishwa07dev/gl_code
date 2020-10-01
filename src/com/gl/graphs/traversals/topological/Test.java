package com.gl.graphs.traversals.topological;

import java.util.List;
import java.util.ArrayList;


/**
 * Test the code written for the topological sorting
 */
public class Test {

  public static void main(String[] args) {

    Vertex vertexA = new Vertex("A");
    Vertex vertexB = new Vertex("B");
    Vertex vertexC = new Vertex("C");
    Vertex vertexD = new Vertex("D");
    Vertex vertexE = new Vertex("E");

    //created the graph by adding edges
    vertexA.addNeighbour(vertexD);
    vertexA.addNeighbour(vertexC);
    vertexC.addNeighbour(vertexB);
    vertexC.addNeighbour(vertexE);
    vertexB.addNeighbour(vertexD);
    vertexE.addNeighbour(vertexD);

    List<Vertex> vertexList = new ArrayList<>();

    vertexList.add(vertexA);
    vertexList.add(vertexB);
    vertexList.add(vertexC);
    vertexList.add(vertexD);
    vertexList.add(vertexE);

    ToplogicalSorting toplogicalSorting = new ToplogicalSorting();


    // this loop will topologically order all the elements
    for(Vertex v : vertexList){
      if(!v.isVisited){
        toplogicalSorting.topological_ordering(v);
      }
    }

    //iterate through stack to get the topological order
    while(!toplogicalSorting.getStack().isEmpty()){
      System.out.print( toplogicalSorting.getStack().pop() + " -> ");
    }
  }

}
