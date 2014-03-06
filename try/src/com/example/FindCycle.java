package com.example;

public class FindCycle {

	public static void main(String[] args) {
		Node<Integer> node1 = new Node<Integer>(1);
		Node<Integer> node2 = new Node<Integer>(2);
		Node<Integer> node3 = new Node<Integer>(3);
		Node<Integer> node4 = new Node<Integer>(4);
		Node<Integer> node5 = new Node<Integer>(5);
		Node<Integer> node6 = new Node<Integer>(6);
		Node<Integer> node7 = new Node<Integer>(7);
		Node<Integer> node8 = new Node<Integer>(8);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		node8.next = node2;
		FindCycle fc = new FindCycle();
		Node<Integer> result = fc.findCycle(node1);
		if (result != null) {
			System.out.println(result.data);
		} else {
		  System.out.println("No cycle");
		}
		
	}
	public Node<Integer> findCycle(Node<Integer> first) {
		Node<Integer> p1 = first;
		Node<Integer> p2 = first;
		Node<Integer> meet = null;
		
		while (p2 != null && p1 != null) {
			p1 = p1.next;
			p2 = p2.next.next;
			
			if (p1 == p2) {
				meet = p1;
				break;
			}
		}
		if (meet != null) {
			p1 = first;
			while (p1 != p2) {
				p1 = p1.next;
				p2 = p2.next;
			}
			return p1;
		}
		return null;
	}
}
