package com.gl.graphs.unionfind;
import java.util.ArrayList;
import java.util.List;
/**
 * This class will contain the logic for Union Find DS
 * 1. MakeSet
 * 2. Union
 * 3. Find
 */
public class UnionFind {

  private int nodeCount ;
  private int setcount ;
  private List<Node> rootNodes ;

  public UnionFind( List<Vertex> vertexList){
    this.rootNodes = new ArrayList<>(vertexList.size());
    makeSets(vertexList);
  }

  private void makeSets(List<Vertex> vertexList) {

    for(Vertex vertex : vertexList){
      makeset(vertex);
    }
  }

  public void makeset(Vertex vertex) {

    Node node  = new Node(0, this.rootNodes.size(),null);
    vertex.setNode(node);
    this.rootNodes.add(node);
    this.setcount++;
    this.nodeCount++;
  }

  /**
   * This method  will be used to find the union of two nodes
   * @param node1
   * @param node2
   */
  public void union(Node node1 , Node node2){
    int index1 = find(node1);
    int index2 = find(node2);

    if(index1 == index2){
      return ;
    }
    Node root1 = this.rootNodes.get(index1);

    Node root2 = this.rootNodes.get(index2);

    if(root1.getRank()<root2.getRank()){
      root1.setParent(root2);
    }else if( root1.getRank() > root2.getRank()){
      root2.setParent(root1);
    }else{
      root2.setParent(root1);
      root1.setRank(root1.getRank()+1);
    }
    this.setcount--;
  }

  public int find(Node node) {

    Node currentNode  = node ;
    while(currentNode!=null && currentNode.getParent() !=null){
      currentNode = currentNode.getParent();
    }

    Node rootNode = currentNode ;
    currentNode = node ;
    while(currentNode != rootNode){
      Node temp = currentNode.getParent();
      currentNode.setParent(rootNode);
      currentNode = temp ;
    }

    return rootNode.getId();
  }
}
