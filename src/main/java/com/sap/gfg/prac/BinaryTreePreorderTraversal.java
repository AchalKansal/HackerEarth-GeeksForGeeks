package com.sap.gfg.prac;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreePreorderTraversal {

	TreeNode root;
	static List<Integer> preOrederElementList = new ArrayList<>();
	static List<Integer> inOrederElementList = new ArrayList<>();
	static List<Integer> postOrederElementList = new ArrayList<>();
	static List<Integer> levelOrederElementList = new ArrayList<>();

	public BinaryTreePreorderTraversal() {
		root = null;
	}

	public void insert(int data) {
		root = insertElement(root, data);
	}

	private TreeNode insertElement(TreeNode root, int data) {

		if (root == null) {
			root = new TreeNode(data);
			return root;
		} else

		if (data > root.val) {
			root.right = insertElement(root.right, data);
		} else {
			root.left = insertElement(root.left, data);
		}
		return root;
	}

	public void TraversaPreOrder() {
		// NLR
		preOrder(root);
	}

	public void preOrder(TreeNode root) {

		if (root == null) {
			return;
		}
		preOrederElementList.add(root.val);

		preOrder(root.left);
		preOrder(root.right);
	}

	public void TraversaInOrder() {
		// LNR
		inOrder(root);
	}

	private void inOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		inOrederElementList.add(root.val);
		inOrder(root.right);
	}

	public void TraversaPostOrder() {
		// LRN
		postOrder(root);
	}

	private void postOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		postOrederElementList.add(root.val);
	}

	private void levelOrderTraversal() {
		Queue<TreeNode> node = new LinkedList<TreeNode>();
		node.add(root);
		TreeNode treeNode = null;
		while (!node.isEmpty()) {
			treeNode = node.poll();
			levelOrederElementList.add(treeNode.val);
			System.out.println(treeNode.val);
			if (treeNode.left != null) {
				node.add(treeNode.left);
			} 
			if (treeNode.right != null) {
				node.add(treeNode.right);
			}
		}
	}

	public static void main(String args[]) {
		BinaryTreePreorderTraversal bt = new BinaryTreePreorderTraversal();
		bt.insert(6);
		bt.insert(24);
		bt.insert(19);
		bt.insert(94);
		bt.insert(5);
		bt.insert(1);
		bt.insert(10);
		bt.TraversaPreOrder();
		bt.TraversaInOrder();
		bt.TraversaPostOrder();
		bt.levelOrderTraversal();
		System.out.println("pre order elements: " + preOrederElementList);
		System.out.println("in order elements: " + inOrederElementList);
		System.out.println("post order elements: " + postOrederElementList);
		System.out.println("level order elements: " + levelOrederElementList);
	}

}
