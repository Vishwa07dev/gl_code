package com.gl.graphs.traversals.bfs.bfsimplementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class WebCrawler {

  private Queue<String> urlQueue ;
  private List<String> visitedUrls ;

  public WebCrawler() {
    this.urlQueue = new LinkedList<>();
    this.visitedUrls = new ArrayList<>();
  }

  public void discoverWeb(String root){
    this.urlQueue.add(root);
    this.visitedUrls.add(root);

    while(!urlQueue.isEmpty()){
      String url = urlQueue.remove();
      String readHtml = readURL(url );
      String regex = "https://(\\w+\\.)*(\\w+)";
      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(readHtml);

      while(matcher.find()){
        String foundURL = matcher.group();
        if(!visitedUrls.contains(foundURL)){
          visitedUrls.add(foundURL);
          System.out.println("Found the URL : "+ foundURL);
          urlQueue.add(foundURL);
        }
      }

    }
  }

  private String readURL(String websiteUrl) {

    String htmlContent = "";

    try {
      URL url = new URL(websiteUrl);
      BufferedReader in  = new BufferedReader(new InputStreamReader(url.openStream()));
      String readLine ="" ;
      while((readLine = in.readLine())!=null){
        htmlContent += readLine;
      }
      in.close();
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }catch(Exception e){
      e.printStackTrace();
    }
    return htmlContent;
  }
}
