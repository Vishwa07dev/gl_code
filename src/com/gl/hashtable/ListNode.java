package com.gl.hashtable;

/**
 * This class will act as the ListNode inside the Hash table bucket or hashtable node
 *
 * node1(key1,data1) --> node2(key2,data2) ---> node3(key3,data3)
 */
public class ListNode {

  private int key ;
  private int data ;
  private ListNode next;

  public ListNode(int key, int data, ListNode next) {
    this.key = key;
    this.data = data;
    this.next = next;
  }

  public ListNode(int key) {
    this.key = key;
  }

  public ListNode(int key, int data) {
    this.key = key;
    this.data = data;
  }

  public ListNode (){

  }

  public int getKey() {
    return key;
  }

  public void setKey(int key) {
    this.key = key;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public ListNode getNext() {
    return next;
  }

  public void setNext(ListNode next) {
    this.next = next;
  }
}
