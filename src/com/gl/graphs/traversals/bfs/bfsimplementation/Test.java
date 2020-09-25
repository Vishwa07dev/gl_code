package com.gl.graphs.traversals.bfs.bfsimplementation;

public class Test {

  public static void main(String[] args) {
    WebCrawler webCrawler = new WebCrawler();

    String url = "https://www.greatlearning.in";

    webCrawler.discoverWeb(url);

  }
}
