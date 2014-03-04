package com.example;

public class Queue {

	Node<Integer> head = null;
	Node<Integer> tail = null;
	public static void main(String[] args) throws Exception{
		Queue q = new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		while (!q.isEmpty()) {
			System.out.println(q.dequeue());
		}
		
	}
	public void enqueue(int num) {
		Node<Integer> node = new Node<Integer>(num);
		if (isEmpty()) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
		
	}
	public int dequeue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Empty");
		}
		Node<Integer> node = head;
		head = head.next;
		if (head == null) {
			tail = null;
		}
		return node.data;
	}
	public boolean isEmpty() {
		if (head == null && tail == null) {
			return true;
		}
		return false;
	}
}
