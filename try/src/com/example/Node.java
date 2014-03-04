package com.example;

public class Node<T> {
	public Node<T> next = null;
	public T data;
	Node(T data) {
		this.data = data;
	}
	public void appendAtEnd(T data) {
		Node<T> newNode = new Node<T>(data);
		Node<T> p = this;
		while (p.next != null) {
			p = p.next;
		}
		p.next = newNode;
	}
	
}
