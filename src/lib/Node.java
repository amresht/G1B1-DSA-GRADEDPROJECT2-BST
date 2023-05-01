/**
 * @class           Node Class for Binary Tree to Skewed BST Assignment
 * @author          Amresh Tripathi 
 * @date            25-Apr-2023
 * @version         1.0
 */

package lib;

//Class of the node
public class Node {
	public int val;
	public Node left, right;

	public Node(int data) {
		val = data;
		left = null;
		right = null;
	}
}