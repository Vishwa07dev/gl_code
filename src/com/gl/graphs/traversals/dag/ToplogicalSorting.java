package com.gl.graphs.traversals.dag;

import java.util.Collections;
import java.util.Stack;


/**
 * This class contains the logic to arrange the vertices of graph in the
 * topological order
 */
public class ToplogicalSorting {
  private Stack<Vertex> stack ;

  public ToplogicalSorting() {

    this.stack = new Stack<>();
  }

  public void topologicalOrdering(Vertex vertex){
    vertex.setVisited(true);

    for(Edge edge : vertex.getAdjacencies()){
      if(!edge.getTargetVertex().isVisited()){
        edge.getTargetVertex().setVisited(true);
        topologicalOrdering(edge.getTargetVertex());
      }
    }

    stack.push(vertex);
  }

  public Stack<Vertex> getStack() {
    Collections.reverse(stack);
    return stack;
  }

  public void setStack(Stack<Vertex> stack) {
    this.stack = stack;
  }
}
