package com.example;

public class FindFromLast<T> {

	public Node<T> findFromLast1(Node<T> first, int n) {
		Node<T> p1 = first;
		Node<T> p2 = first;
		
		for (int i=0; i<n-1; i++) {
			p2 = p2.next;
		}
		while (p2.next != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}
	
	public Node<T> findFromLast2(Node<T> first, int n) {
		Node<T> found = null;
		recursive(first, n, 0);
		return found;
	}
	public Node<T> recursive(Node<T> node, int n, Integer count) {
		Node<T> found = null;
		if (node.next != null) {
			found = recursive(node.next, n, count);
		}
		if (count == n-1) {
			found = node;
			System.out.println("found="+ node.data);
		}
		count++;
		System.out.println(count);
		return found;
	}
	public static void main(String[] args) {
		Node<String> n1 = new Node<String>("hello1");
		n1.appendAtEnd("hello2");
		n1.appendAtEnd("hello3");
		n1.appendAtEnd("hello4");
		n1.appendAtEnd("hello5");
		n1.appendAtEnd("hello6");
		n1.appendAtEnd("hello7");
		n1.appendAtEnd("hello8");
		
		FindFromLast<String> test1 = new FindFromLast<String>();
		Node<String> fromLast = test1.findFromLast1(n1, 3);
		System.out.println(fromLast.data);
	}
}
