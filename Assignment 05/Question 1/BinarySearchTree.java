package com.sunbeam.assignment5.question1;


class Node{
	int data;
	Node left, right;
	
	public Node(int data) {
	this.data = data;
	left = right = null;
	}
}

public class BinarySearchTree {
	Node root;
	
	public void addNode(int value) {
		if (root == null) {
			root = new Node(value);
		}else {
			addNode(value, root);
		}
	}

	private void addNode(int value, Node trav) {
		if (value < trav.data) {
			if (trav.left == null) {
				trav.left = new Node(value);
			} else {
				addNode(value, trav.left);
			}
		} else {
			if(trav.right == null) {
				trav.right = new Node(value);
			} else {
				addNode(value, trav.right);
			}
		}
		
	}
	
	private void inOrder(Node trav) {
		if(trav == null)
			return;
		inOrder(trav.left);
		System.out.print(" " + trav.data);
		inOrder(trav.right);
	}
	
	public void inOrder() {
		System.out.print("Inorder : ");	
		inOrder(root);
		System.out.println();
	}
	

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.addNode(50);
		bst.addNode(30);
		bst.addNode(70);
		bst.addNode(20);
		bst.addNode(40);
		bst.addNode(60);
		bst.addNode(80);
		
		bst.inOrder();


	}

}
