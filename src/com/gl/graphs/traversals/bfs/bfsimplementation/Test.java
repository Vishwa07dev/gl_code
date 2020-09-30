package com.gl.graphs.traversals.bfs.bfsimplementation;

/**
 * This class will be used to test the Webcrawler written
 */
public class Test {

  public static void main(String[] args) {
    WebCrawler webCrawler = new WebCrawler();

    String rootUrl = "https://www.greatlearning.in";

    webCrawler.discoverWeb(rootUrl);
  }

}
