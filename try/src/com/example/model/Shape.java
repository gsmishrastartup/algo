package com.example.model;

public class Shape {

	public double[] low;
	public double[] high;
	public int dimension;
	
	public Shape(int dimension, double[] low, double[] high) {
		this.dimension  = dimension;
		this.low = new double[dimension];
		this.high = new double[dimension];
		for (int i=0;i< dimension; i++) {
			this.low[i] = low[i];
			this.high[i] = high[i];
		}
	}
}
