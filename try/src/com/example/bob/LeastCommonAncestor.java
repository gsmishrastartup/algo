package com.example.bob;

public class LeastCommonAncestor {

  public static void main(String[] args) {
    Node n1 = new Node(5);
    Node n2 = new Node(8);
    Node n3 = new Node(1);
    Node n4 = new Node(2);
    Node n5 = new Node(4);
    n1.left = n4;
    n1.right = n2;
    n4.left = n3;
    n4.right = n5;
    
    System.out.println(findLca(n1, 1, 8));
  }
  private static class Node {
    Node left;
    Node right;
    int value;
    public Node(int value) {
      this.value = value;
    }
  }
  public static int findLca(Node n, int a, int b) {
    if (n == null) return 0;
    if (a < n.value && b < n.value) {
      return findLca(n.left, a, b);
    } else if (a > n.value && b > n.value) {
      return findLca(n.right, a, b);
    } else {
      return n.value;
    }
  }
}
