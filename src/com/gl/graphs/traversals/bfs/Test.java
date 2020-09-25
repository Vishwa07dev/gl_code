package com.gl.graphs.traversals.bfs;

public class Test {

  public static void main(String[] args) {


    Vertex v1 = new Vertex("A");
    Vertex v2 = new Vertex("B");
    Vertex v3 = new Vertex("C");
    Vertex v4 = new Vertex("D");
    Vertex v5 = new Vertex("E");
    Vertex v6 = new Vertex("F");
    Vertex v7 = new Vertex("G");
    Vertex v8 = new Vertex("H");

    v1.addNeighbour(v2);
    v1.addNeighbour(v6);
    v1.addNeighbour(v7);

    v2.addNeighbour(v1);
    v2.addNeighbour(v3);
    v2.addNeighbour(v4);

    v3.addNeighbour(v2);

    v4.addNeighbour(v2);
    v4.addNeighbour(v5);

    v7.addNeighbour(v1);
    v7.addNeighbour(v8);

    v8.addNeighbour(v7);

    BFS bfs = new BFS();

    bfs.bfsTraverse(v1);


  }
}
