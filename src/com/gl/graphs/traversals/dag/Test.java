package com.gl.graphs.traversals.dag;

import java.util.ArrayList;
import java.util.List;


/**
 * We will be using this class to test the logic
 */
public class Test {

  public static void main(String[] args) {

    Vertex vertexA = new Vertex("A");
    Vertex vertexB = new Vertex("B");
    Vertex vertexC = new Vertex("C");

    List<Vertex> vertices = new ArrayList<>();
    vertices.add(vertexA);
    vertices.add(vertexB);
    vertices.add(vertexC);

    Edge edge1 = new Edge(1, vertexA, vertexB);
    Edge edge2 = new Edge(1,vertexA, vertexC);
    Edge edge3 = new Edge(1, vertexB, vertexC);

    vertexA.addNeighbour(edge1);
    vertexA.addNeighbour(edge2);
    vertexB.addNeighbour(edge3);

    DAGShortestPath dagShortestPath = new DAGShortestPath();

    dagShortestPath.shortestPath(vertexA);

    System.out.println(dagShortestPath.getShortestPath(vertexC));

  }
}
