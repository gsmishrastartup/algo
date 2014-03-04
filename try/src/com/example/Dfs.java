package com.example;

public class Dfs {

	public static void main(String[] args) {
		Graph g = new Graph(6);
		g.addVertex(0, 'A');
		g.addVertex(1, 'B');
		g.addVertex(2, 'C');
		g.addVertex(3, 'D');
		g.addVertex(4, 'E');
		g.addVertex(5, 'F');
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 4);
		g.addEdge(1, 5);
		g.addEdge(2, 5);
		java.util.Stack<Integer> st = new java.util.Stack<Integer>();
		
		st.push(0);
		g.vertexList[0].visited = true;
		System.out.println(g.vertexList[0].label);
		while (!st.isEmpty()) {
			int node = st.peek();
			Vertex vert = g.getUnvisitedVertex(node);
			if (vert != null) {
				vert.visited = true;
				System.out.println(vert.label);
				st.push(vert.id);
			} else {
				st.pop();
			}
		}
		
	}

}
