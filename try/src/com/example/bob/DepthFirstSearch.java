package com.example.bob;

import java.util.Stack;

public class DepthFirstSearch {

	boolean marked[];
	int pathTo[];
	int s;
	public DepthFirstSearch(Graph G, int s) {
		pathTo = new int[G.V()];
		marked = new boolean[G.V()];
		this.s = s;
		dfs(G, s);
	}
	private void dfs(Graph g, int s) {
		marked[s] = true;
		for (int v : g.adj(s)) {
			
			if (!marked[v]) {
				dfs(g, v);
				System.out.println("Node=" + v + " s=" + s);
				pathTo[v] = s;
			}
		}
		
	}
	Iterable<Integer> pathTo(int v) {
		Stack<Integer> st = new Stack<Integer>();
		while (v != s) {
			int p = pathTo[v];
			System.out.println("temp" + p);
			st.push(p);
			v = p;
		}
		return st;
	}
	public static void main(String[] args) {
		Graph g = new Graph(6);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 4);
		g.addEdge(1, 5);
		g.addEdge(2, 5);
		DepthFirstSearch d = new DepthFirstSearch(g, 0);
		System.out.println(d.pathTo(4));
	}
}
