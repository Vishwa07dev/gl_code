package com.gl.graphs.kruskals;

import java.util.ArrayList;
import java.util.List;
/**
 * This class will represent the disjoint set data structure
 */
public class DisjointSet {
   private int nodeCount ;
   private int setCount ;

   private List<Node> rootNode ;

  public DisjointSet(List<Vertex> vertexList) {
    this.rootNode = new ArrayList<>(vertexList.size());
    makeSets(vertexList);
  }


  public int find(Node n){
    Node currentNode = n ;
    try {
      while (currentNode.getParent() != null) {
        currentNode = currentNode.getParent();
      }
    }catch (NullPointerException e){
      e.printStackTrace();
      System.out.println(n);
    }

    Node rootNode  = currentNode;

    currentNode = n ;
    while(currentNode != rootNode){
      Node temp = currentNode.getParent();
      currentNode.setParent(rootNode);
      currentNode=temp;
    }

    return rootNode.getId();
  }


  public void union(Node node1 , Node node2){
    int index1 = find(node1);
    int index2 = find(node2);

    if(index1 == index2){
      return ;
    }

    Node root1 = this.rootNode.get(index1);
    Node root2 = this.rootNode.get(index2);

    if(root1.getRank()<root2.getRank()){
      root1.setParent(root2);
    }else if( root1.getRank() > root2.getRank()){
      root2.setParent(root1);
    }else{
      root2.setParent(root1);
      root1.setRank(root1.getRank()+1);
    }
    this.setCount--;
  }

  /**
   * This method will be used to create sets from the given vertex list
   * @param vertexList
   */
  private void makeSets(List<Vertex> vertexList) {

    for(Vertex vertex : vertexList){
      makeset(vertex);

    }
  }


  private void makeset(Vertex vertex) {

    Node n  = new Node(0,rootNode.size(), null);
    vertex.setNode(n);
    this.rootNode.add(n);
    this.setCount++;
    this.nodeCount++;
  }
}
