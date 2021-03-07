package com.gl.designpattern;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDesignPatternDemo {

  public static void main(String[] args) throws CloneNotSupportedException {

    Movies movies = new Movies();
    movies.loadMoviesData();
    List<String> originalMovies = movies.getMoviesList();


    //Getting the prototype

    Movies prototype = (Movies) movies.clone();

    List<String> prototypeMovies = prototype.getMoviesList();

    prototypeMovies.add("Flag");

    System.out.println(originalMovies);

    System.out.println(prototypeMovies);


  }


}

/**
 * For implementing the prototype design pattern, we need to enable the class to be copied or cloneable
 *
 * We need to implement the cloneable interface in the given class
 *
 * Let's say we have a Movies class, which needs to be cloneable
 */


class Movies implements  Cloneable{


  private List<String> moviesList ;

  public Movies() {
    this.moviesList = new ArrayList<>();
  }

  public Movies(List<String> moviesList) {
    this.moviesList = moviesList;
  }

  public void loadMoviesData(){

    System.out.println("Started loading movie data");
    moviesList.add("Titanic");
    moviesList.add("Avenger");
    moviesList.add("Dhoom");
  }

  public List<String> getMoviesList() {
    return moviesList;
  }

  public void setMoviesList(List<String> moviesList) {
    this.moviesList = moviesList;
  }

  /**
   * Support the cloning method
   */

  @Override
  public Object clone() throws CloneNotSupportedException {
    List<String> copyMovieList = new ArrayList<>();

    for(String movie : moviesList){
      copyMovieList.add(movie);
    }

    return new Movies(copyMovieList);
  }
}