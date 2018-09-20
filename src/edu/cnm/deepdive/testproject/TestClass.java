package edu.cnm.deepdive.testproject;

public class TestClass {

  public static void main(String[] args) {
    salute((args.length > 0) ? args[0] : "TestClass");
  }


  private static void salute(String target) {
    System.out.println("Hello " + target + "!");
  }

}