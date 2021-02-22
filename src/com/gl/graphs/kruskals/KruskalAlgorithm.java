package com.gl.graphs.kruskals;

import com.sun.media.jfxmediaimpl.HostUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


/**
 * This is the main class, which holds the logic for the Kruskal's algorithm
 */
public class KruskalAlgorithm {
   public void spanningTree(List<Vertex> vertexList , List<Edge> edgeList){

      DisjointSet disjointSet = new DisjointSet(vertexList);

      List<Edge> mst = new ArrayList<>();
      Collections.sort(edgeList);
      for(Edge edge : edgeList){
         Vertex startVertex = edge.getStartVertex();
         Vertex targetVertex = edge.getTargetVertex();

         if(disjointSet.find(startVertex.getNode()) !=  disjointSet.find(targetVertex.getNode())){
            mst.add(edge);
            disjointSet.union(startVertex.getNode(), targetVertex.getNode());
         }
      }


      for(Edge edge : mst){
         System.out.println(edge.getStartVertex() + " -> "+ edge.getTargetVertex()+"--");
      }
   }


   public static  void printingMandatoryAndOptional(List<Vertex> vertexList , List<Edge> edgeList){

      List<Edge> mandatory = new ArrayList<>();
      List<Edge> optional = new ArrayList<>();

      Map<Double, List<Edge>> map = new TreeMap<>();
      for(Edge edge : edgeList){
         if(map.get(edge.getWeight())==null){
            map.put(edge.getWeight(),new ArrayList<>());
         }
         map.get(edge.getWeight()).add(edge);
      }
      DisjointSet disjointSet = new DisjointSet(vertexList);
      List<Edge> mst = new ArrayList<>();
      for(List<Edge> edges :map.values() ){
         List<Edge> edgeGroup = new ArrayList<>();
         for(Edge edge : edges){
            Vertex startVertex = edge.getStartVertex();
            Vertex targetVertex = edge.getTargetVertex();

            if(disjointSet.find(startVertex.getNode()) !=  disjointSet.find(targetVertex.getNode())){

               edgeGroup.add(edge);
               disjointSet.union(startVertex.getNode(), targetVertex.getNode());
            }
         }
         for(Edge edge : edgeGroup) {
            if(edge != edgeGroup.get(0)){
               if (disjointSet.find(edge.getStartVertex().getNode()) != disjointSet.find(
                   edgeGroup.get(0).getStartVertex().getNode())) {
                  mandatory.add(edge);
               } else {
                  optional.add(edge);
               }
            }else{
               for(Edge e : mst){
                  if(disjointSet.find(e.getStartVertex().getNode()) != disjointSet.find(
                      edge.getStartVertex().getNode())){
                     continue;
                  }
               }
               mandatory.add(edge);
            }

         }
         mst.addAll(edgeGroup);

      }

      System.out.println("####### Mandatory ######### ");
      for(Edge edge : mandatory){
         System.out.println(edge);
      }
      System.out.println("####### Optional ######### ");
      for(Edge edge : optional){
         System.out.println(edge);
      }
   }

   public static void main(String[] args) {
      /**
       * 1 2 1 // First edge, from node 1 to node 2, with cost 1
       * 2 3 1
       * 3 4 2
       * 4 1 2
       * 1 5 3
       * 4 5 3
       * 2 5 6
       */

      Vertex v1  = new Vertex("1");
      Vertex v2  = new Vertex("2");
      Vertex v3  = new Vertex("3");
      Vertex v4  = new Vertex("4");
      Vertex v5  = new Vertex("5");

      List<Vertex> vertexList = new ArrayList<>();

      vertexList.add(v1);
      vertexList.add(v2);
      vertexList.add(v3);
      vertexList.add(v4);
      vertexList.add(v5);

      Edge edge1 = new Edge(1, v1, v2);
      Edge edge2 = new Edge(1, v2, v3);
      Edge edge3 = new Edge(2, v3, v4);
      Edge edge4 = new Edge(2, v4, v1);
      Edge edge5 = new Edge(3, v1, v5);
      Edge edge6 = new Edge(3, v4, v5);
      Edge edge7 = new Edge(6, v2, v5);

      List<Edge> edgeList = new ArrayList<>();
      edgeList.add(edge1);
      edgeList.add(edge2);
      edgeList.add(edge3);
      edgeList.add(edge4);
      edgeList.add(edge5);
      edgeList.add(edge6);
      edgeList.add(edge7);

      printingMandatoryAndOptional(vertexList,edgeList);

   }
}
