package com.sunbeam.assignment5.question2;

import java.util.Scanner;

class Node {
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
		
		public Node binarySearchRec(int key) {
			return binarySearchRec(key, root);
		}
		
	private Node binarySearchRec(int key, Node trav) {
			if (trav == null) {
				return null;
			}
			if (key == trav.data) {
				return trav;
			}
			
			else if (key < trav.data) {
				return binarySearchRec(key, trav.left);
				
			}
			else {
				return binarySearchRec(key, trav.right);
			}
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
		
		
		//int searchKey =10;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to search in BST: ");
		int key = sc.nextInt();
		
		Node result = bst.binarySearchRec(key);
		
		if (result != null) {
			System.out.println("Node with key " + key + " found: " + result.data);
		} else {
			System.out.println("Node with key " + key + " not found.");
		}
		

	}

}
