package com.datastructures.NonLinearDataStructures.Tree.BinaryTree;

public class BinaryTree {
	
	private Node root;
	private class Node{
		private int data;
		private Node left;
		private Node right;
		public Node(int data) {
			this.data=data;
		}
	}
	
	public void newBinaryTree() {
		
		Node first=new Node(18);
		Node second=new Node(21);
		Node third=new Node(51);
		Node forth=new Node(16);
		Node fifth=new Node(31);
		Node sixth=new Node(81);
		Node sevnth=new Node(5);
		
		root=first;
		root.left=second;
		root.right=third;
		
		second.left=forth;
		second.right=fifth;
		third.left=sixth;
		third.right=sevnth;
		
	}
	//	Implementation of Binary tree with all possible traversals
	//  By using Recursive Model
	// Pre-Order Traversal
	public void preOrder(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(+root.data+",");
		preOrder(root.left);
		preOrder(root.right);
	}
	// In-Order Traversal
	public void inOrder(Node root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(+root.data+",");
		inOrder(root.right);
	}
	// Post-Order Traversal
	public void postOrder(Node root) {
		if(root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(+root.data+",");
	}
	
	
//	Implementation of Binary tree with all possible traversals
	//  By using Iterative Model
	// Pre-Order Traversal
	public void preOrderIt(Node root) {
		
	}
	// In-Order Traversal
	public void inOrderIt(Node root) {
		
	}
	// Post-Order Traversal
	public void postOrderIt(Node root) {
	
	}
	
	public static void main(String[]args) {
		BinaryTree bt=new BinaryTree();
		bt.newBinaryTree();
		System.out.println("Pre Order Output");
		bt.preOrder(bt.root);
//		System.out.println("Pre Order IT Output");
//		bt.preOrderIt(bt.root);
		System.out.println("In Order Output");
		bt.inOrder(bt.root);
//		System.out.println("In Order IT Output");
//		bt.inOrderIt(bt.root);
		System.out.println("Post Order Output");
		bt.postOrder(bt.root);
//		System.out.println("Post Order IT Output");
//		bt.postOrderIt(bt.root);
	}

}
