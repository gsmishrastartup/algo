package com.example;

import java.util.ArrayList;
import java.util.List;

public class Graph {

	private int[][] matrix;
	private int vertices;
    Vertex[] vertexList;
	
 	public Vertex getUnvisitedVertex(int node) {
		for (int i=0; i < vertices; i++) {
			if (matrix[node][i] == 1 && vertexList[i].visited == false) {
				return vertexList[i];
			}
		}
		return null;
	}
	public Graph(int vertices) {
		matrix = new int[vertices][vertices];
		vertexList = new Vertex[vertices];
		this.vertices = vertices;
		for (int i=0; i< vertices;i++) {
			for (int j=0; j< vertices;j++){
				matrix[i][j] = 0;
			}
		}
	}
	public void addVertex(int id, char label) {
		Vertex vertex = new Vertex();
		vertex.label = label;
		vertex.visited = false;
		vertex.id = id;
		vertexList[id] = vertex;
		
	}
	public void addEdge(int from, int to) {
		matrix[from][to] = 1;
		matrix[to][from] = 1;
	}
	public int vertices() {
		return vertices;
	}
}
