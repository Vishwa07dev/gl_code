package com.gl.graphs;

public class TestGraph {

  public static void main(String[] args) {



     AdjacencyListGraph adjacencyListGraph = new AdjacencyListGraph(4);

     Vertex vertex1 = new Vertex("A");
     Vertex vertex2 = new Vertex("B");
     Vertex vertex3 = new Vertex("C");
     Vertex vertex4 = new Vertex("D");

     adjacencyListGraph.getVertices()[0] = vertex1;
     adjacencyListGraph.getVertices()[1]=vertex2;
     adjacencyListGraph.getVertices()[2]=vertex3;
     adjacencyListGraph.getVertices()[3]=vertex4;

     //We will set the neighbours
    adjacencyListGraph.addNeighbour(vertex1,vertex2);
    adjacencyListGraph.addNeighbour(vertex1,vertex3);
    adjacencyListGraph.addNeighbour(vertex2,vertex3);
    adjacencyListGraph.addNeighbour(vertex3,vertex4);

    adjacencyListGraph.printAllEdges();

  }
}
