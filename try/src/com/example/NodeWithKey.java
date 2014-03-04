package com.example;

public class NodeWithKey<T> {
	public NodeWithKey<T> next = null;
	public T data;
	public String key;
	NodeWithKey(String key, T data) {
		this.key = key;
		this.data = data;
	}
	public void appendAtEnd(String key, T data) {
		NodeWithKey<T> newNode = new NodeWithKey<T>(key, data);
		NodeWithKey<T> p = this;
		while (p.next != null) {
			p = p.next;
		}
		p.next = newNode;
	}
	
}
