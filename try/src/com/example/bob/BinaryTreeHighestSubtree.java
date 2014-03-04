package com.example.bob;


public class BinaryTreeHighestSubtree {

	static Node highest = null;
	public int postOrder(Node n) {
		int leftValue = 0;
		int rightValue = 0;
		if (n.left != null) leftValue = postOrder(n.left);
		if (n.right != null) rightValue = postOrder(n.right);
		int total = leftValue + n.value + rightValue;
		n.totalValue = total;
		if (highest == null) {
			highest = n;
		} else  if (total > highest.totalValue) {
			highest = n;
		}
		System.out.println(n.id + " " + n.totalValue);
		return total;
	}
	
	public static void main(String[] args) {
		Node nb1 = new Node("A");
		Node nb2 = new Node("B");
		Node nb3 = new Node("C");
		Node nb4 = new Node("D");
		Node nb5 = new Node("E");
		Node nb6 = new Node("F");
		nb1.value = -10;
		nb2.value = 5;
		nb3.value = 5;
		nb4.value = 1;
		nb5.value = -3;
		nb6.value = 4;
		nb1.left = nb2;
		nb1.right = nb3;
		nb2.left = nb4;
		nb3.left = nb5;
		nb3.right = nb6;
		
		BinaryTreeHighestSubtree bt = new BinaryTreeHighestSubtree();
		bt.postOrder(nb1);
		System.out.println(highest.id);
		
	}
}
