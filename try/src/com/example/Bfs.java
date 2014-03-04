package com.example;

public class Bfs {

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
		java.util.LinkedList<Integer> q = new java.util.LinkedList<Integer>() ;
		
		q.add(0);
		g.vertexList[0].visited = true;
		System.out.println(g.vertexList[0].label);
		while (!q.isEmpty()) {
			int node = q.remove();
			Vertex vert = null;
			while((vert =g.getUnvisitedVertex(node)) != null) {
				q.add(vert.id);
				vert.visited = true;
				System.out.println(vert.label);
			}
		}
	}
}
