package com.gl.hashtable;

/**
 * It's actually the bucket where the key->value pairs will get stored
 *
 */
public class HashTableNode {

  //What is the index of the bucket
  private int bucketCount ;

  private ListNode startNode ;

  public HashTableNode(){

  }

  public HashTableNode(int bucketCount, ListNode startNode) {
    this.bucketCount = bucketCount;
    this.startNode = startNode;
  }

  public int getBucketCount() {
    return bucketCount;
  }

  public void setBucketCount(int bucketCount) {
    this.bucketCount = bucketCount;
  }

  public ListNode getStartNode() {
    return startNode;
  }

  public void setStartNode(ListNode startNode) {
    this.startNode = startNode;
  }
}
