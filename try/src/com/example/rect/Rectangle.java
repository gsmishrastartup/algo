package com.example.rect;

public class Rectangle {

  Interval x;
  Interval y;
  public Rectangle (Interval x, Interval y) {
    this.x = x;
    this.y = y;
  }
  
  public boolean intersects (Rectangle other) {
    return this.x.intersects(other.x) && this.y.intersects(other.y);
  }
  
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle(new Interval(1, 2), new Interval(1, 2));
    Rectangle r2 = new Rectangle(new Interval(3, 4), new Interval(3, 4));
    System.out.println(r1.intersects(r2));

    r1 = new Rectangle(new Interval(1, 4), new Interval(1, 2));
    r2 = new Rectangle(new Interval(3, 4), new Interval(3, 4));
    System.out.println(r1.intersects(r2));

    r1 = new Rectangle(new Interval(1, 4), new Interval(1, 4));
    r2 = new Rectangle(new Interval(3, 4), new Interval(3, 4));
    System.out.println(r1.intersects(r2));
  }
}
