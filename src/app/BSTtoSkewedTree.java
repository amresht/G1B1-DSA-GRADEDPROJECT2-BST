/**
 * @class           App Driver Class for Binary Tree to Skewed BST Assignment
 * @author          Amresh Tripathi 
 * @date            25-Apr-2023
 * @version         1.0
 */

package app;

//import java.io.*;
import lib.*;

class BSTtoSkewedTree
{
	public Node node;
	Node prevNode = null;
	static Node headNode = null;

	void flattenBTToSkewedRight(Node root)
	{
		// Base Case if root node is null
		if(root == null)
		{
			return;
		}

		flattenBTToSkewedRight(root.left);

		Node rightNode = root.right;

		// Condition to check if the root Node
		// of the skewed tree is not defined
		if(headNode == null)
		{
			headNode = root;
			root.left = null;
			prevNode = root;
		}
		else
		{
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		flattenBTToSkewedRight(rightNode);
	}

	// Function to traverse the right
	// skewed tree using recursion
	static void traverseRightSkewed(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);	
	}

	// Driver Code
	public static void main (String[] args)
	{

		BSTtoSkewedTree tree = new BSTtoSkewedTree();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left= new Node(55);

		tree.flattenBTToSkewedRight(tree.node);
		traverseRightSkewed(headNode);
	}
}

