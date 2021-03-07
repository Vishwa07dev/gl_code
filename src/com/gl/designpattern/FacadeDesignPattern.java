package com.gl.designpattern;

import static com.gl.designpattern.OsType.*;


public class FacadeDesignPattern {

  public static void main(String[] args) {

    OSFacade.getPerformanceReport(WINDOWS);
  }

}
/**
 *
 * 1. Windows image
 * 2. Linux image
 * 3. Mac OS image
 *
 */

class WindowsDownloader {

  public static String getWindowsImage(){
    return "Windows image";
  }

  public void getWindowsPerformanceReport(){
    System.out.println("Windows performance report");
  }

}

class LinuxDownloader {

  public static String getLinuxDownloader(){
    return "Linux image";
  }

  public void getLinuxPerformanceReport(){
    System.out.println("Linux performance report");
  }
}

class MacDownloader{
  public static String getMacDownloader(){
    return "Mac image";
  }

  public void getMacPerformanceReport(){
    System.out.println("Mac performance report");
  }
}

/**
 * Define a facade class
 */

class OSFacade{

    public static void getPerformanceReport(OsType osType){
      switch(osType){
        case WINDOWS:
          WindowsDownloader windowsDownloader = new WindowsDownloader();
          windowsDownloader.getWindowsPerformanceReport();
          break;
        case LINUX:
          LinuxDownloader linuxDownloader = new LinuxDownloader();
          linuxDownloader.getLinuxPerformanceReport();
          break;
        case MAC:
          MacDownloader macDownloader = new MacDownloader();
          macDownloader.getMacPerformanceReport();
          break;
      }
    }
}
