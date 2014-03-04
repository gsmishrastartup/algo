package com.example.bob;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {

	int V;
	int E;
	LinkedList<Integer>[] adjList;
	@SuppressWarnings("unchecked")
	public Graph(int num) {
		adjList = (LinkedList<Integer>[]) new LinkedList<?>[num];
		for (int i=0;i<num;i++) {
			LinkedList<Integer> ll = new LinkedList<Integer>();
			adjList[i] = ll;
		}
		V = num;
	}
	public void addEdge(int v, int w) {
		adjList[v].add(w);
		adjList[w].add(v);
		E++;
	}
	public Iterable<Integer> adj(int v) {
		return adjList[v];
	}
	public int V() {
		return V;
	}
	public int E() {
		return E;
	}
	
}
