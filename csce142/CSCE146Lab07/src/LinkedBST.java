/*
 *Sean Raudat for CSCE 146, Lab07
 */
public class LinkedBST<T extends Comparable<T>> 
{
    private class Node 
    {
    	String name;
        T data;
        Node left;
    	double weight;
        Node right;
        Node(T data) 
        {
            this.data = data;
            left = null;
            right = null;
        }
    	private Node(String aName, double aWeight) 
		{
			name = aName;
			weight = aWeight;
			left = right = null;
		}
    }
    private Node root;
    public LinkedBST() 
    {
        root = null;
    }
    public void add(T data) 
    {
        root = add(root, data);
    }
    private Node add(Node node, T data) 
    {
        if (node == null) 
        {
            return new Node(data);
        }
        if (data.compareTo(node.data) < 0) 
        {
            node.left = add(node.left, data);
        } 
        else 
        {
            node.right = add(node.right, data);
        }
        return node;
    }
    public void delete(String name, double weight) 
	{
		root = delete(root, name, weight);
	}
    public Node deleteMin(Node aNode) 
	{
		if(aNode == null)
			return null;
		if(aNode.left == null)
			return aNode.right;
		aNode.left = deleteMin(aNode.left);
		return aNode;
	}
	public Node delete(Node aNode, String name, double weight) 
	{
		//recursivedelete method
		if(aNode == null)
			return null;
		if(weight < aNode.weight) 
		{
			aNode.left = delete(aNode.left, name, weight);
		} 
		else if(weight >aNode.weight) 
			{
				aNode.right = delete(aNode.right, name, weight);
			} 
		else 
		{
			if(aNode.right == null) 
			{
				return aNode.left;
			} 
			else if(aNode.left == null) 
			{
				return aNode.right;
			} 
			else 
			{
				Node temp = aNode;
				aNode = findMin(aNode.right);
				aNode.right = deleteMin(temp.right);
				aNode.left = temp.left;
			}
		}
		return aNode;
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
			if(aNode.left != null) 
			{
				insert(aNode.left, name, weight);
			} 
			else
			{
				aNode.left = new Node(name, weight);
			}
		else if(weight > aNode.weight) 
		{
			if(aNode.right != null) 
			{
				insert(aNode.right, name, weight);
			} 
			else 
			{
				aNode.right = new Node(name, weight);
			}
		}
	}
    
    
    public void remove(T data) 
    {
        root = remove(root, data);
    }
    private Node remove(Node node, T data) 
    {
        if (node == null) 
        {
            return null;
        }
        int cmp = data.compareTo(node.data);
        if (cmp < 0) 
        {
            node.left = remove(node.left, data);
        } 
        else if (cmp > 0) 
        {
            node.right = remove(node.right, data);
        } 
        else 
        {
            if (node.left == null) 
            {
                return node.right;
            } 
            else if (node.right == null) 
            {
                return node.left;
            }
            Node minNode = findMin(node.right);
            node.data = minNode.data;
            node.right = remove(node.right, minNode.data);
        }
        return node;
    }
    private Node findMin(Node node) 
    {
        while (node.left != null) 
        {
            node = node.left;
        }
        return node;
    }

    public boolean search(T data) 
    {
        return search(root, data);
    }

    private boolean search(Node node, T data) 
    {
        if (node == null) 
        {
            return false;
        }

        int cmp = data.compareTo(node.data);

        if (cmp < 0) 
        {
            return search(node.left, data);
        }
        else if (cmp > 0)
        {
            return search(node.right, data);
        } 
        else 
        {
            return true;
        }
    }

    public void printPreOrder() 
    {
        printPreOrder(root);
    }

    private void printPreOrder(Node node) 
    {
        if (node != null) 
        {
            System.out.print(node.data + " ");
            printPreOrder(node.left);
            printPreOrder(node.right);
        }
    }

    public void printInOrder() 
    {
        printInOrder(root);
    }

    private void printInOrder(Node node)
    {
        if (node != null) 
        {
            printInOrder(node.left);
            System.out.print(node.data + " ");
            printInOrder(node.right);
        }
    }

    public void printPostOrder() 
    {
        printPostOrder(root);
    }

    private void printPostOrder(Node node) 
    {
        if (node != null) 
        {
            printPostOrder(node.left);
            printPostOrder(node.right);
            System.out.print(node.data + " ");
        }
    }
}
