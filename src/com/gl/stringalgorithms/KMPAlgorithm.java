package com.gl.stringalgorithms;

public class KMPAlgorithm {

  static void kmpAlgorithm(String p, String t)
  {

    int m = p.length() ;
    int n = t.length();

    int[] prefixTable = new int[n] ;
    int j=0 ;

    computePrefixTable(p,m,prefixTable);

    int i=0;
    while(i<n){
      if(p.charAt(j) == t.charAt(i)){
        i++;
        j++;
      }
      if(j==m){
        System.out.println("Found the pattern and it's starting index"
            + "is "+ (i-j));
        j=prefixTable[j+1];
      }else if(i<n && p.charAt(j) != t.charAt(i)){
        if(j!=0){
          j = prefixTable[j-1];
        }else{
          i=i+1;
        }
      }
    }

  }

  static void computePrefixTable(String p, int m, int prefixTable[])
  {
    int len = 0 ;
    int i =1 ;
    prefixTable[0]=0;

    while(i<m){
      if(p.charAt(i) == p.charAt(len)){
        len++;
        prefixTable[i]=len ;
        i++;
      }else{
        if(len!=0){
          len = prefixTable[len-1];
        }else{
          prefixTable[i]=len;
          i++;
        }
      }
    }

  }


  public static void main(String args[])
  {
    String txt = "DABACDABABCABCBXYZABC";
    String pat = "ABABCABCB";
    kmpAlgorithm(pat, txt);
  }
}

