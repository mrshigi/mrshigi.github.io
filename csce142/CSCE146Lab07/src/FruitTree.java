/*
 *Sean Raudat for CSCE 146, Lab07
 *I made a non generic one as i made this before really reading that the it was supposed to be generic BST
 * You can use this if you want or the LinkedBST
 */
public class FruitTree 
{
	private class Node 
	{
		private String name;
		private double weight;
		private Node leftChild;
		private Node rightChild;
		private Node(String aName, double aWeight) 
		{
			name = aName;
			weight = aWeight;
			leftChild = rightChild = null;
		}
	}

	private Node root;
	public FruitTree() 
	{
		root = null;
	}
	public void insert(String name, double weight) 
	{
		if(root == null)
			root = new Node(name, weight);
		else
			insert(root, name, weight);
	}
	public void insert(Node aNode, String name, double weight) 
	{
		//recursiveinsert method
		if(aNode == null)
			aNode = new Node(name, weight);
		else if(weight < aNode.weight) 
			if(aNode.leftChild != null) 
			{
				insert(aNode.leftChild, name, weight);
			} 
			else
			{
				aNode.leftChild = new Node(name, weight);
			}
		else if(weight > aNode.weight) 
		{
			if(aNode.rightChild != null) 
			{
				insert(aNode.rightChild, name, weight);
			} 
			else 
			{
				aNode.rightChild = new Node(name, weight);
			}
		}
	}
	public void delete(String name, double weight) 
	{
		root = delete(root, name, weight);
	}
	public Node delete(Node aNode, String name, double weight) 
	{
		//recursivedelete method
		if(aNode == null)
			return null;
		if(weight < aNode.weight) 
		{
			aNode.leftChild = delete(aNode.leftChild, name, weight);
		} 
		else if(weight >aNode.weight) 
			{
				aNode.rightChild = delete(aNode.rightChild, name, weight);
			} 
		else 
		{
			if(aNode.rightChild == null) 
			{
				return aNode.leftChild;
			} 
			else if(aNode.leftChild == null) 
			{
				return aNode.rightChild;
			} 
			else 
			{
				Node temp = aNode;
				aNode = findMin(aNode.rightChild);
				aNode.rightChild = deleteMin(temp.rightChild);
				aNode.leftChild = temp.leftChild;
			}
		}
		return aNode;
	}
	public Node findMin(Node aNode) 
	{
		if(aNode == null)
			return null;
		if(aNode.leftChild == null)
			return aNode;
		else
			return findMin(aNode.leftChild);
	}
	public Node deleteMin(Node aNode) 
	{
		if(aNode == null)
			return null;
		if(aNode.leftChild == null)
			return aNode.rightChild;
		aNode.leftChild = deleteMin(aNode.leftChild);
		return aNode;
	}
	public void printPreOrder() 
	{
		printPreOrder(root);
	}
	public void printPreOrder(Node aNode) 
	{
		if(aNode != null) 
		{
			System.out.println(aNode.name + "\t" + aNode.weight);
			printPreOrder(aNode.leftChild);
			printPreOrder(aNode.rightChild);
		}
	}
	public void printInOrder() 
	{
		printInOrder(root);
	}
	public void printInOrder(Node aNode) 
	{
		if(aNode != null) 
		{
			printInOrder(aNode.leftChild);
			System.out.println(aNode.name + "\t" + aNode.weight);
			printInOrder(aNode.rightChild);
		}
	}
	public void printPostOrder() 
	{
		printPostOrder(root);
	}
	public void printPostOrder(Node aNode) 
	{
		if(aNode != null) 
		{
			printPostOrder(aNode.leftChild);
			printPostOrder(aNode.rightChild);
			System.out.println(aNode.name + "\t" + aNode.weight);
		}
	}
	
}

