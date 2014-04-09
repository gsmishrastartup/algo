package com.example.bob;

public class Initialization {

  public static void main(String[] args) {
    new Subclass();
  }
}
class Superclass {
  protected int superValue;
  
  Superclass() {
    System.out.println("Super const");
    doValue();
  }
  void doValue() {
    superValue = 100;
    System.out.println("Super value:" + superValue);
  }
}
class Subclass extends Superclass {
  private int value = 200;
  Subclass() {
    System.out.println("Subclass const");
    doValue();
    System.out.println("superValue:"  + superValue);
    
  }
  void doValue() {
    System.out.println("value:" + value);
  }
}
