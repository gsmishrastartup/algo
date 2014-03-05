package com.example.bob;


public class Hashmap {

  public static final int BUCKETS = 4;
  Node[] map;

  public static void main(String[] args) {
    
    Hashmap hm = new Hashmap();
    hm.put("sssa", "helloa");
    hm.put("bdsds", "hellob");
    hm.put("cssss", "helloc");
    hm.put("dsss", "hellod");
    hm.put("eere", "helloe");
    hm.put("fsdss", "hellof");
    hm.put("gsdss", "hellog");
    
//    System.out.println(hm.get("a"));
//    System.out.println(hm.get("b"));
//    System.out.println(hm.get("c"));
//    System.out.println(hm.get("d"));
//    System.out.println(hm.get("e"));
//    System.out.println(hm.get("f"));
//    System.out.println(hm.get("i"));
  }
  private static class Node {
    Node next;
    String key;
    String value;
    public Node(String key, String value) {
      this.key = key;
      this.value = value;
    }
  }
  public Hashmap() {
    map = new Node[BUCKETS]; 
  }
  public int hash(String key) {
    int hash = 0;
    for (int i=0;i < key.length();i++) {
      hash = key.charAt(i) + hash * 31;
    }
    System.out.println(key + " " + hash + " " + hash%BUCKETS);
    return hash;
  }
  
  public void put(String key, String value) {
    Node n = new Node(key, value);
    int hash = hash(key) % BUCKETS;
    if (map[hash] == null) {
      map[hash] = n;
    } else {
      n.next = map[hash];
      map[hash] = n;
    }
  }
  
  public String get(String key) {
    int hash = hash(key) % BUCKETS;
    Node n = map[hash];
    while(n != null) {
      if (n.key.equals(key)) {
        return n.value;
      }
      n = n.next;
    }
    return null;
  }
}
