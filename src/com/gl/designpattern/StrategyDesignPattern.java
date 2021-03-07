package com.gl.designpattern;

public class StrategyDesignPattern {

  public static void main(String[] args) {

    Problem problem = new Problem("Find the smalled path between two point");

    //problem.solve(new Algorithm1());

    problem.solve(new Algorithm2());
  }

}

/**
 *
 *  Problem --- There can be multiple algorithms or strategies...
 *  and this how we will make use of Strategy design pattern
 */

interface SolutionStrategy {

  public void solve();
}


class Algorithm1 implements  SolutionStrategy{

  @Override
  public void solve() {
    System.out.println("Solving the problem using Algorithm 1 with O(n) time complexity");
  }
}

class Algorithm2 implements  SolutionStrategy{

  @Override
  public void solve() {
    System.out.println("Solving the problem using Algorithm 2 with O(logn) time complexity");
  }
}

class Problem {

  private String problemStatement ;

  public Problem(String problemStatement) {
    this.problemStatement = problemStatement;
  }

  public String getProblemStatement() {
    return problemStatement;
  }

  public void setProblemStatement(String problemStatement) {
    this.problemStatement = problemStatement;
  }

  public void solve(SolutionStrategy solutionStrategy){
    solutionStrategy.solve();
  }
}
