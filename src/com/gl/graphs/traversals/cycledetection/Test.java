package com.gl.graphs.traversals.cycledetection;

import java.util.ArrayList;
import java.util.List;


/**
 * Test if we are able to identify the cycle in the graph
 */
public class Test {

  public static void main(String[] args) {

    Vertex vertexA = new Vertex("A");
    Vertex vertexB = new Vertex("B");
    Vertex vertexC = new Vertex("C");
    Vertex vertexD = new Vertex("D");
    Vertex vertexE = new Vertex("E");
    Vertex vertexF = new Vertex("F");

    //Establish the relations between the vertices

    vertexA.addNeighbour(vertexB);
    vertexA.addNeighbour(vertexC);

    vertexB.addNeighbour(vertexC);

    vertexD.addNeighbour(vertexA);

    //Cycle  D--> E --->F --->D
    vertexD.addNeighbour(vertexE);
    vertexE.addNeighbour(vertexF);
    vertexF.addNeighbour(vertexD);

    List<Vertex> vertexList = new ArrayList<>();
    vertexList.add(vertexA);
    vertexList.add(vertexB);
    vertexList.add(vertexC);
    vertexList.add(vertexD);
    vertexList.add(vertexE);
    vertexList.add(vertexF);

    CycleDetection cycleDetection = new CycleDetection();

    //This method call will indicate if the cycle is present in the graph or not
    cycleDetection.checkCycle(vertexList);

  }




}
