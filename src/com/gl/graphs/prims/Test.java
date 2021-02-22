package com.gl.graphs.prims;

import java.util.ArrayList;
import java.util.List;

/**
 * This class will test the Prim's lazy algorithm
 */
public class Test {

  public static void main(String[] args) {
     Vertex vertexA  = new Vertex("A");
    Vertex vertexB  = new Vertex("B");
    Vertex vertexC  = new Vertex("C");

    List<Vertex> vertexList = new ArrayList<>();

    vertexList.add(vertexA);
    vertexList.add(vertexB);
    vertexList.add(vertexC);


    vertexA.addEdge(new Edge(1, vertexA, vertexB));
    vertexA.addEdge(new Edge(1, vertexA, vertexC));
    vertexB.addEdge(new Edge(10, vertexB, vertexC));
    vertexB.addEdge(new Edge(1, vertexB, vertexA));
    vertexC.addEdge(new Edge(1, vertexC, vertexA));
    vertexC.addEdge(new Edge(10, vertexC, vertexB));

    PrimsLazyAlgorithm primsLazyAlgorithm = new PrimsLazyAlgorithm(vertexList);

    primsLazyAlgorithm.primAlgorithm(vertexC);

    primsLazyAlgorithm.showSpanningTree();



  }
}
