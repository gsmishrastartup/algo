package com.example.bob;

public interface BinarySearchTree {

  /**
   * Is value contained in the BST
   * @param value
   * @return
   */
  public boolean search(int value);
  
  /**
   * Insert new node
   * @param value
   * @return
   */
  public Node insert(int value);
  
  /**
   * Number of nodes in the BST
   * @return
   */
  public int size();
  
  /**
   * Finds max depth of the BST
   * @return
   */
  public int maxDepth();
  
  /**
   * Finds the min value in the BST
   * @return
   */
  public int minValue();

  /**
   * Finds the max value in the BST
   * @return
   */
  public int maxValue();
  
  /**
   * Prints BST inorder
   */
  public void inorder();
  
  /**
   * Prints BST preorder
   */
  public void preorder();

  /**
   * Prints BST postorder
   */
  public void postorder();
  
  /**
   * Whether BST has a path to leaf with total sum as provided sum
   * @param sum
   * @return
   */
  public boolean hasPathSum(int sum);
  
  /**
   * Print all paths from root to leaf
   */
  public void printAllPaths();
  
  /**
   * Changes BST to its mirror image
   */
  public void mirror();
  
  /**
   * Double all nodes in the tree
   */
  public void doubleTree();
  
  /** 
   * Compares if given tree is same like this BST
   * @param n
   * @return
   */
  public boolean sameTree(Node a, Node b);
  
  /**
   * For the key values 1...numKeys, how many structurally unique 
   * binary search trees are possible that store those keys
   * @return
   */
  public int countTrees(int numKeys);
  
  /**
   * Is valid BST?
   * @return
   */
  public boolean isValid();
  
  /** 
   * Find least common ancestor
   * 
   * @param a
   * @param b
   * @return
   */
  public int findLca(int a, int b);
}
