package com.gl.graphs.traversals.topological;

import java.util.Stack;


/**
 * This class will have the logic to arrange the nodes of the graph
 * in topological order
 */
public class ToplogicalSorting {

  private Stack<Vertex> stack ;

  public ToplogicalSorting() {
    this.stack = new Stack<>();
  }

  public void topological_ordering(Vertex vertex){
    vertex.setVisited(true);

    //Once all the neighbours are handled, push vertex to the stack
    for(Vertex neighbour : vertex.getNeighbours()){
      if(!neighbour.isVisited){
        topological_ordering(neighbour);
      }
    }
    stack.push(vertex);
  }

  public Stack<Vertex> getStack() {
    return stack;
  }

  public void setStack(Stack<Vertex> stack) {
    this.stack = stack;
  }
}
