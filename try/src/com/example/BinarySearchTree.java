package com.example;

public class BinarySearchTree {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		int[] nums = {1,2,3,4,5,6,7,8};
		NodeBinary<Integer> node = bst.makeTree(nums);
		System.out.println(node.data);
	}

	public NodeBinary<Integer> makeTree(int[] nums) {
		return makeTree(0, (nums.length)-1, nums);
	}

	private NodeBinary<Integer> makeTree(int low, int high, int[] nums) {
		if (low > high) {
			return null;
		}
		int mid = (low+high)/2;
		NodeBinary<Integer> node = new NodeBinary<Integer>();
		node.data = nums[mid];
		node.left = makeTree(low, mid - 1, nums);
		node.right = makeTree(mid + 1, high, nums);
		return node;
	}
}
