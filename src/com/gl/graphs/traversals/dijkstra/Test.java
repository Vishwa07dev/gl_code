package com.gl.graphs.traversals.dijkstra;

/**
 * This class has the logic to test the Dijkstra algorithm
 */
public class Test {

  public static void main(String[] args) {

    Vertex vertexA = new Vertex("A");

    Vertex vertexB = new Vertex("B");

    Vertex vertexC = new Vertex("C");


    vertexA.addNeighbour(new Edge(1, vertexA,vertexB));
    vertexA.addNeighbour(new Edge(3,vertexA,vertexC));
    vertexB.addNeighbour(new Edge(3,vertexB,vertexC));


    DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm();

    dijkstraAlgorithm.computePath(vertexA);

    System.out.println(dijkstraAlgorithm.getShortestPath(vertexC));


  }

}
