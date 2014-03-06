package com.example.bob;

import java.util.ArrayList;
import java.util.List;

public class DegreeOfFriends {
  public static void main(String[] args) {
    Profile a = new Profile(1, "A");
    Profile b = new Profile(1, "B");
    Profile c = new Profile(1, "C");
    Profile d = new Profile(1, "D");
    Profile e = new Profile(1, "E");
    List<Profile> af = new ArrayList<Profile>();
    af.add(b);
    af.add(c);
    af.add(d);
    a.friends = af;
    List<Profile> bf = new ArrayList<Profile>();
    bf.add(d);
    bf.add(e);
    b.friends = bf;
    
    DegreeOfFriends degreeF = new DegreeOfFriends();
    System.out.println(degreeF.findShortestPath(a, e));
    System.out.println(degreeF.findShortestPath(a, d));
  }
  
  private static class Profile {
    public Profile(int id, String name){
      distance = Integer.MAX_VALUE;
      this.id = id;
      this.name = name;
    }
    boolean visited;
    int distance;
    long id;
    String name;
    List<Profile> friends;
}

  public int findShortestPath(Profile p1, Profile p2) {
    p1.distance = 0;
    visit(p1);
    return p2.distance;
  }

  public void visit(Profile p1) {
    if (p1 == null) return;
    List<Profile> p1Friends  = p1.friends;
    if (p1Friends == null) return;
    p1.visited = true;
    for (Profile p: p1Friends) {
      if (!p.visited) {
        int pDistance = p1.distance + 1;
        if (pDistance < p.distance) {
          p.distance = pDistance;
        }
        p.visited = true;
        visit(p);
      } else {
        int pDistance = p1.distance + 1;
        if (pDistance < p.distance) {
          p.distance = pDistance;
        }
      }
    }
  }

}
