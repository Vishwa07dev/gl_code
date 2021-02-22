package com.gl.recursion;

import java.util.Comparator;
import java.util.PriorityQueue;


public class Huffmancoding {

  public static void printCode(HuffmanNode root, String s) {
    if (root.left == null && root.right == null && Character.isLetter(root.c)) {

      System.out.println(root.c + ":" + s);

      return;
    }
    printCode(root.left, s + "0");
    printCode(root.right, s + "1");
  }

  public static void main(String[] args) {

    int n = 5;
    char[] charArray = { 'p', 't', 'u', 'v' ,'w'};
    int[] charfreq = { 5, 19, 26, 55 ,118 };

    PriorityQueue<HuffmanNode> q
        = new PriorityQueue<HuffmanNode>(n, new HuffmanComparator());

    for (int i = 0; i < n; i++) {
      HuffmanNode hn = new HuffmanNode();

      hn.c = charArray[i];
      hn.freq = charfreq[i];

      hn.left = null;
      hn.right = null;

      q.add(hn);
    }

    HuffmanNode root = null;

    while (q.size() > 1) {

      HuffmanNode x = q.peek();
      q.poll();

      HuffmanNode y = q.peek();
      q.poll();

      HuffmanNode f = new HuffmanNode();

      f.freq = x.freq + y.freq;
      f.c = '-';

      f.left = x;

      f.right = y;

      root = f;

      q.add(f);
    }

    printCode(root, "");
  }
}

class HuffmanNode {

  int freq;
  char c;

  HuffmanNode left;
  HuffmanNode right;
}


class HuffmanComparator implements Comparator<HuffmanNode> {
  public int compare(HuffmanNode x, HuffmanNode y) {

    return x.freq - y.freq;
  }
}
