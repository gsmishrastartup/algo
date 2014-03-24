package com.example;

public class LevelOrder {

	public static void main(String[] args) {
		char anc = 'b';
	  System.out.println((int) anc);
		NodeBinary<String> nb1 = new NodeBinary<String>();
		NodeBinary<String> nb2 = new NodeBinary<String>();
		NodeBinary<String> nb3 = new NodeBinary<String>();
		NodeBinary<String> nb4 = new NodeBinary<String>();
		NodeBinary<String> nb5 = new NodeBinary<String>();
		NodeBinary<String> nb6 = new NodeBinary<String>();
		nb1.data = "A";
		nb2.data = "B";
		nb3.data = "C";
		nb4.data = "D";
		nb5.data = "E";
		nb6.data = "F";
		nb1.left = nb2;
		nb1.right = nb3;
		nb2.left = nb4;
		nb3.left = nb5;
		nb3.right = nb6;
		
		NodeBinary<String> root = nb1;
		
		java.util.LinkedList<NodeBinary<String>> q = new java.util.LinkedList<NodeBinary<String>>() ;
		
		q.add(root);
		while (!q.isEmpty()) {
			NodeBinary<String> node = q.remove();
			System.out.println(node.data);
			if (node.left != null ) q.add(node.left);
			if (node.right != null ) q.add(node.right);
		}
		
		//java.util.Stack<NodeBinary<String>> st = new java.util.Stack<NodeBinary<String>>();
		//st.push(root);
		//while (!st.isEmpty()) {
		//	NodeBinary<String> node = st.pop();
		//	if (node.left != null) st.push(node.left);
		//	if (node.right != null) st.push(node.right);
		//	System.out.println(node.data);
		//}
		//inorder(root);

	}
	public static void preorder(NodeBinary<String> node) {
		System.out.println(node.data);
		if (node.left != null) preorder(node.left);
		if (node.right != null) preorder(node.right);
		
	}
	public static void inorder(NodeBinary<String> node) {
		if (node.left != null) inorder(node.left);
		System.out.println(node.data);
		if (node.right != null) inorder(node.right);
		
	}
	public static void postorder(NodeBinary<String> node) {
		if (node.left != null) postorder(node.left);
		if (node.right != null) postorder(node.right);
		System.out.println(node.data);
		
	}
}
