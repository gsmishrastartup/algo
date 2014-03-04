package com.example;

public class BinarySearch {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		int[] nums = {1, 2,3,4,6,5,7,8,9,10};
		NodeBinary<Integer> node = bst.makeTree(nums);
		BinarySearch bs = new BinarySearch();
		System.out.println(bs.search(node, 6));
	}

	public boolean search(NodeBinary<Integer> node, int i) {
		if (i == node.data) {
			return true;
		} else if (i < node.data) {
			if (node.left == null) {
				return false;
			}
			search(node.left, i);
		} else {
			if (node.right == null) {
				return false;
			}
			search(node.right, i);
		}
		return false;
	}
}
