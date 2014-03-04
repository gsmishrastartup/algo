package com.example.bob;

public class Edge {

	int v;
	int w;
	public Edge(int v, int w) {
		this.v = v;
		this.w = w;
	}
	public Integer anyVertex() {
		return v;
	}
	public Integer getOtherVertex(int v) {
		if (this.v == v) return w;
		return v;
	}
}
