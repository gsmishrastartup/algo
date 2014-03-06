package com.example.bob;

public class MergeSortedLinkedList {

  public static void main(String[] args) {
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    Node n5 = new Node(5);
    Node n6 = new Node(6);
    Node n7 = new Node(7);
    Node n8 = new Node(8);
    
    
    n1.next = n3;
    n3.next = n5;
    n5.next = n8;
    n2.next = n4;
    n4.next = n6;
    n6.next = n7;
    
    MergeSortedLinkedList merge = new MergeSortedLinkedList();
    Node nn = merge.merge(n1, n2);
    System.out.println(nn.value);
  }
  private static class Node {
    Node next;
    int value;
    public Node(int value) {
      this.value = value;
    }
  }
  
  public Node merge(Node n1, Node n2) {
    if (n1 == null && n2 != null) return n2;
    if (n1 != null && n2 == null) return n1;
    Node n = null;
    if (n1.value < n2.value) {
      n = n1;
      n.next = merge(n1.next, n2);
    } else {
      n = n2;
      n.next = merge(n1, n2.next);
    }
    return n;
  }
}
