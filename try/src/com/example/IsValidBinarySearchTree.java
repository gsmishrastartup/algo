package com.example;

public class IsValidBinarySearchTree {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		NodeBinary<Integer> node = bst.makeTree(nums);
		IsValidBinarySearchTree bs = new IsValidBinarySearchTree();
		System.out.println(bs.isValid(node));
		
		NodeBinary<Integer> one = new NodeBinary<Integer>();
		NodeBinary<Integer> two = new NodeBinary<Integer>();
		NodeBinary<Integer> three = new NodeBinary<Integer>();
		NodeBinary<Integer> four = new NodeBinary<Integer>();
		NodeBinary<Integer> five = new NodeBinary<Integer>();
		one.data = 1;
		two.data = 2;
		three.data = 3;
		four.data = 4;
		five.data = 5;
		
		four.left = two;
		two.left = one;
		two.right = three;
		three.right = five;
		
		System.out.println(bs.isValid(four));
		
	}

	private boolean isValid(NodeBinary<Integer> node) {
		return isValid(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean isValid(NodeBinary<Integer> node, int minValue, int maxValue) {
		if (node == null) return true;
		System.out.println(minValue + " " + node.data   + " " + maxValue);
		if (node.data.intValue() < minValue || node.data.intValue() > maxValue) return false;
		if (!isValid(node.left, minValue, node.data.intValue())) return false;
		if (!isValid(node.right, node.data.intValue(), maxValue)) return false;
		return true;
	}
}
