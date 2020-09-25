package com.gl.graphs.traversals.bfs;

import java.util.LinkedList;
import java.util.Queue;


public class BFS {

  public void bfsTraverse(Vertex root){
    Queue<Vertex> q = new LinkedList<>();
    root.setVisited(true);

    q.add(root);

    while(!q.isEmpty()){
      Vertex currentVert = q.remove();
      System.out.println ("Visited vertex "+ currentVert );
      for(Vertex v : currentVert.getAdjList()){
        if(!v.isVisited()){
          v.setVisited(true);
          q.add(v);
        }
      }
    }
  }
}
