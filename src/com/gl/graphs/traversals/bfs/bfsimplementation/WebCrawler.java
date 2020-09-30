package com.gl.graphs.traversals.bfs.bfsimplementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * This class contains the logics to start crawling from the root url
 */
public class WebCrawler {

  private Queue<String> urlQueue ;
  private List<String> visitedUrls ;

  public WebCrawler(){
    urlQueue = new LinkedList<>();

    visitedUrls = new ArrayList<>();
  }

  /**
   * This method has the logic to start crawling the web from the root url
   * @param root
   */
  public void discoverWeb(String root){

    this.urlQueue.add(root);
    this.visitedUrls.add(root); // used to indicate that this url is already visited.


    while(!this.urlQueue.isEmpty()){
      String url = urlQueue.remove();
      String readHtml = readURL(url);

      //Need to scan all the lines in readHTML and see of it contains http links

      String regex = "https://(\\w+\\.)*(\\w+)";
      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(readHtml);

      while(matcher.find()){
        String foundURL =matcher.group();
        if(!visitedUrls.contains(foundURL)){
          visitedUrls.add(foundURL);

          System.out.println("Found  the URL : "+ foundURL);
          urlQueue.add(foundURL);
        }
      }
    }
  }

  private String readURL(String websiteUrl) {

    String  htmlContent = "" ;

    try {
      URL url = new URL(websiteUrl);

      try {
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        String readLine = "";
        while((readLine= in.readLine()) !=null){
          htmlContent += readLine ;
        }
        in.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }

    return htmlContent ;
  }

  public Queue<String> getUrlQueue() {
    return urlQueue;
  }

  public void setUrlQueue(Queue<String> urlQueue) {
    this.urlQueue = urlQueue;
  }

  public List<String> getVisitedUrls() {
    return visitedUrls;
  }

  public void setVisitedUrls(List<String> visitedUrls) {
    this.visitedUrls = visitedUrls;
  }
}
