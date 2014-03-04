package com.example;

import com.example.model.Shape;

public class Intersect {

	public static void main(String[] args) {
		double[] low1 = {1,1};
		double[] high1 = {2,2};
		Shape shape1 = new Shape(2, low1, high1);
		
		double[] low2 = {1,1};
		double[] high2 = {4,4};
		Shape shape2 = new Shape(2, low2, high2);
		
		Intersect is = new Intersect();
		System.out.println(is.intersects1(shape1, shape2));
	}
	
	public boolean intersects(Shape shape1, Shape shape2) {
		boolean intersect = true;
		for (int i=0; i < shape1.dimension; i++) {
			if (shape1.low[i] < shape2.high[i] && shape1.high[i] > shape2.low[i]) {
				intersect &= true;
			} else {
				return false;
			}
		}
		return intersect;
	}
	
	public boolean intersects1(Shape shape1, Shape shape2) {
		for (int i=0; i < shape1.dimension; i++) {
			if ((shape1.low[i] > shape2.high[i] || shape1.high[i] < shape2.low[i])){
				return false;
			}
		}
		//return (!(shape1.low[0] > shape2.high[0] || shape1.high[0] < shape2.low[0]));
		return true;
	}
}
