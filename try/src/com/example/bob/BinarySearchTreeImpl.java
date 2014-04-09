package com.example.bob;

import java.util.Arrays;

public class BinarySearchTreeImpl implements BinarySearchTree {

  Node root;

  public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTreeImpl();
    bst.insert(4);
    bst.insert(8);
    bst.insert(2);
    bst.insert(3);
    bst.insert(7);
    bst.insert(1);
    bst.insert(5);
    bst.insert(6);
    System.out.println("Search for 6: " + bst.search(6));
    System.out.println("Search for 5: " + bst.search(5));
    System.out.print("Inorder: ");
    bst.inorder();
    System.out.print("Preorder: ");
    bst.preorder();
    System.out.print("Postorder: ");
    bst.postorder();
    System.out.println("Size: " + bst.size());
    System.out.println("Max Depth: " + bst.maxDepth());
    System.out.println("Min Value: " + bst.minValue());
    System.out.println("Max Value: " + bst.maxValue());
    System.out.println("Print All Paths: ");
    bst.printAllPaths();
    System.out.println("LCA Value: " + bst.findLca(2, 7));
  }
  @Override
  public boolean search(int value) {
    return search(root, value);
  }

  private boolean search(Node node, int value) {
    if (node == null) return false;
    else if (value < node.value) return search(node.left, value);
    else if (value > node.value) return search(node.right, value);
    else return true;
  }
  @Override
  public Node insert(int value) {
    if (root == null) {
      root = insert(root, value);
      return root;
    }
    else {
      return insert(root, value);
    }
  }
  private Node insert(Node node, int value){
    if (node == null) return new Node(value);
    if (value < node.value) node.left = insert(node.left, value);
    else if (value > node.value) node.right = insert(node.right, value);
    return node;
  }

  @Override
  public int size() {
    return size(root);
  }

  private int size(Node node) {
    if (node == null) return 0;
    return size(node.left) + 1 + size(node.right);
  }
  @Override
  public int maxDepth() {
    return maxDepth(root);
  }

  private int maxDepth(Node node) {
    if (node == null) return 0;
    return Math.max((maxDepth(node.left) + 1), (maxDepth(node.right) +1));
  }
  @Override
  public int minValue() {
    return minValue(root);
  }

  private int minValue(Node node) {
    if (node == null) return Integer.MAX_VALUE;
    if (node.left != null) return minValue(node.left);
    else return node.value;
  }
  @Override
  public int maxValue() {
    return maxValue(root);
  }

  private int maxValue(Node node) {
    if (node == null) return Integer.MIN_VALUE;
    if (node.right != null) return maxValue(node.right);
    else return node.value;
  }
  @Override
  public void inorder() {
    inorder(root);
    System.out.println("");
  }

  private void inorder(Node node) {
    if (node == null) return;
    inorder(node.left);
    System.out.print(node.value + " ");
    inorder(node.right);
  }
  @Override
  public void preorder() {
    preorder(root);
    System.out.println("");
  }

  private void preorder(Node node) {
    if (node == null) return;
    System.out.print(node.value + " ");
    preorder(node.left);
    preorder(node.right);
  }
  @Override
  public void postorder() {
    postorder(root);
    System.out.println("");
  }

  private void postorder(Node node) {
    if (node == null) return;
    postorder(node.left);
    postorder(node.right);
    System.out.print(node.value + " ");
  }
  @Override
  public boolean hasPathSum(int sum) {
    return hasPathSum(root, sum);
  }

  private boolean hasPathSum(Node node, int sum) {
    if (node == null) {
      return (sum == 0);
    } else {
      int leftsum = sum - node.value;
      return hasPathSum(node.left, leftsum) || hasPathSum(node.right, leftsum);
    }
  }
  @Override
  public void printAllPaths() {
    int[] paths = new int[1000];
    printAllPaths(root, paths, 0);

  }

  private void printAllPaths(Node node, int[] paths, int pathLen) {
    if (node == null) return;
    paths[pathLen++] = node.value;
    if (node.left == null && node.right == null) {
      printArray(paths, pathLen);
    }
    else {
      printAllPaths(node.left, paths, pathLen);
      printAllPaths(node.right, paths, pathLen);
    }
  }
  private void printArray(int[] paths, int pathLen) {
    for (int i = 0; i < pathLen; i++) {
      System.out.print(paths[i] + " ");
    }
    System.out.println("");
  }
  @Override
  public void mirror() {
    mirror(root);
  }

  private void mirror(Node node) {
    if (node == null) return;
    mirror(node.left);
    mirror(node.right);
    Node tmp = node.left;
    node.left = node.right;
    node.right = tmp;
  }
  @Override
  public void doubleTree() {
    doubleTree(root);
  }

  private void doubleTree(Node node) {
    if (node == null) return;
    doubleTree(node.left);
    doubleTree(node.right);
    
    Node tmp = node.left;
    node.left = new Node(node.value);
    node.left.left = tmp;
  }
  @Override
  public boolean sameTree(Node a, Node b) {
    if (a == null && b == null) {
      return true;
    }
    else if (a != null && b != null)  {
      return a.value == b.value && sameTree(a.left, b.left) && sameTree(a.right, b.right);
    } else {
      return false;
    }
  }

  @Override
  public int countTrees(int numKeys) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public boolean isValid() {
    return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  private boolean isValid(Node n, int min, int max) {
    if (n == null) return true;
    
    return false;
  }
  @Override
  public int findLca(int a, int b) {
    return findLca(root, a, b);
  }
  private int findLca(Node n, int a, int b) {
    if (n == null) return 0;
    if (a < n.value && b < n.value) return findLca(n.left, a, b);
    else if (a > n.value && b > n.value) return findLca(n.right, a, b);
    else if (a < n.value && n.value < b) return n.value;
    else return 0;
  }

}
