package com.gl.graphs.kruskals;

import java.util.ArrayList;
import java.util.List;

/**
 * This class will be used to test the Kruskals algorithm
 */
public class Test {

  public static void main(String[] args) {

    Vertex vertexA = new Vertex("A");
    Vertex vertexB = new Vertex("B");
    Vertex vertexC = new Vertex("C");
    Vertex vertexD = new Vertex("D");
    Vertex vertexE = new Vertex("E");
    Vertex vertexF = new Vertex("F");
    Vertex vertexG = new Vertex("G");
    Vertex vertexH = new Vertex("H");


    List<Vertex> vertexList = new ArrayList<>();

    vertexList.add(vertexA);
    vertexList.add(vertexB);
    vertexList.add(vertexC);
    vertexList.add(vertexD);
    vertexList.add(vertexE);
    vertexList.add(vertexF);
    vertexList.add(vertexG);
    vertexList.add(vertexH);


    List<Edge> edgeList = new ArrayList<>();

    edgeList.add(new Edge(3, vertexA, vertexB));
    edgeList.add(new Edge(2, vertexA, vertexC));
    edgeList.add(new Edge(5, vertexA,vertexD));
    edgeList.add(new Edge(13, vertexB,vertexF));
    edgeList.add(new Edge(2,vertexB,vertexD));
    edgeList.add(new Edge(5, vertexC,vertexE));
    edgeList.add(new Edge(2, vertexC, vertexD));
    edgeList.add(new Edge(4, vertexD, vertexF));
    edgeList.add(new Edge(6, vertexD,vertexG));
    edgeList.add(new Edge(3, vertexD,vertexH));
    edgeList.add(new Edge(6, vertexE,vertexG));
    edgeList.add(new Edge(2, vertexF,vertexG));
    edgeList.add(new Edge(3, vertexF,vertexH));
    edgeList.add(new Edge(6, vertexG,vertexH));

    KruskalAlgorithm kruskalAlgorithm = new KruskalAlgorithm();

    kruskalAlgorithm.spanningTree(vertexList,edgeList);
  }
}
