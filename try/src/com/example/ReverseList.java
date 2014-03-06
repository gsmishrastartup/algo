package com.example;

public class ReverseList {

	public static void main(String[] args) {
		
		Node<String> node = new Node<String>("A");
		node.appendAtEnd("B");
		node.appendAtEnd("C");
		node.appendAtEnd("D");
		print(node);
		System.out.println("");
		print(reverse(node));
	}

	private static void print(Node<String> node) {
		Node<String> x = node;
		while (x != null) {
			System.out.print(x.data);
			x = x.next;
		}
	}

	private static Node<String> reverse(Node<String> node) {
	  if (node == null) return null;
	  if (node.next == null) return node;
	  Node<String> second = node.next;
	  node.next = null;
	  
	  Node<String> reversed = reverse(second);
	  
	  second.next = node;
	  
//		Node<String> first = node;
//		Node<String> previous = null;
//		while (first != null) {
//			Node<String> second = first.next;
//			first.next = previous;
//			previous = first;
//			first = second;
//		}
		
		return reversed;
	}
}
