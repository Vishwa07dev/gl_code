package com.gl.graphs.traversals.bellman;

import java.util.ArrayList;
import java.util.List;


/**
 * This will be used to test this class
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

    //Define the edges

    Edge edge1 = new Edge(1, vertexA,vertexB);
    Edge edge2 = new Edge(-1, vertexB, vertexC);
    Edge edge3 = new Edge(-1, vertexC, vertexA);




    List<Edge> edgeList = new ArrayList<>();
    edgeList.add(edge1);
    edgeList.add(edge2);
    edgeList.add(edge3);

    BellManFordAlgorithm bellManFordAlgorithm = new BellManFordAlgorithm(edgeList, vertices);

    bellManFordAlgorithm.bellmanFordAlgorithm(vertexA);

    //System.out.println(bellManFordAlgorithm.shortestPathTraversal(vertexC));

  }
}
