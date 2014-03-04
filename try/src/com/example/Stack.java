package com.example;

public class Stack {

	private Node<Integer> head = null;
	public static void main(String[] args) throws Exception {
		Stack st = new Stack();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		while (!st.isEmpty()) {
			System.out.println(st.pop());
		}
	}
	
	public void push(int num) {
		Node<Integer> node = new Node<Integer>(num);
		node.next = head;
		head = node;
	}
	public int pop() throws Exception {
		if (head == null) {
			throw new Exception("Empty");
		}
		Node<Integer> node = head;
		head = head.next;
		return node.data;
	}
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		return false;
	}
}
