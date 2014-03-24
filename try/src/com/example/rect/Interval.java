package com.example.rect;

public class Interval {

  private double lo;
  private double hi;
  
  public Interval (double lo, double hi) {
    if (hi < lo) {
      this.lo = hi;
      this.hi = lo;
    } else {
      this.lo = lo;
      this.hi = hi;
    }
      
  }
  public boolean intersects(Interval other) {
    return ((this.lo <= other.lo && this.hi >= other.lo) || (this.lo >= other.lo && this.lo <= other.hi));
  }
}
