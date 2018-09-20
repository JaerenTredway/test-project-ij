package edu.cnm.deepdive.testproject;

public class TestClass {

  public static void main(String[] args) {
    salute(salutation(args));
  }

  private static String salutation(String[] args) {
    return "Hello, " + ((args.length > 0) ? args[0] : "TestClass!");
  }

  private static void salute(String salutation) {
    System.out.println(salutation);
  }

}