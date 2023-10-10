/*
 *Sean Raudat for CSCE 146, HW06, Trees but not the fun kind
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ShapeTree
{
    private ShapeTreeNode root;
   
    //Define the constructor to initialize the root
    public ShapeTree()
    {
        root = null;
    }
   
    //Define the method to insert the node.
    public void insert(Shape newnode)
    {
    //Create a new node and set the root if the tree is empty
        if(root == null)
        {
            root = new ShapeTreeNode(newnode);
        }
        else
        {
            ShapeTreeNode temp = root;
            ShapeTreeNode curr = null;
            while(temp != null)
            {
                  //Move to the left if the value to be inserted
                  // is less than the current node
                if(newnode.getArea() < temp.key.getArea())
                {
                    curr = temp;
                    temp = temp.left;
                }
               
                //Otherwise move to the right
                else
                {
                    curr = temp;
                    temp = temp.right;
                }
            }
            //Insert the node in the left if the value
            // of the value to be inserted is less than
            // the current node
            if(newnode.getArea() < curr.key.getArea())
            {
                curr.left = new ShapeTreeNode(newnode);
            }
            //Otherwise insert the value in the right
            else
            {
                curr.right = new ShapeTreeNode(newnode);
            }
        }
    }
    public void inorder()
    {
    System.out.println("Printing in-order");
        myinorder(root);
    }
    public void myinorder(ShapeTreeNode r)
    {
        if(r!=null)
        {
            myinorder(r.left);
            r.key.print();
            myinorder(r.right);
        }
    }
    public void preorder()
    {
    System.out.println("Printing pre-order");
    mypreorder(root);
    }
    public void mypreorder(ShapeTreeNode r)
    {
        if(r!=null)
        {
            r.key.print();
            mypreorder(r.left);
            mypreorder(r.right);
        }
    } 
    public void postorder()
    {
    System.out.println("Printing post-order");
    mypostorder(root);
    }   
    public void mypostorder(ShapeTreeNode r)
    {
        if(r!=null)
        {
            mypostorder(r.left);
            mypostorder(r.right);
            r.key.print();
        }
    }
    //method to return the maximum area
    public double maxArea()
    {
    ShapeTreeNode temp = root;
    //loop to traverse the tree
    while(temp.right != null)
    {
            //Move to the right side.
            temp = temp.right;
    }
    return temp.key.getArea();
    }
    public void search(String type, double area)
    {
    ShapeTreeNode temp = root;
    while(temp != null)
    {
            //If the node is found print the value and break the loop
            if (area == temp.key.getArea() && type.equals(temp.key.getType()))
            {
                  temp.key.print();
                  break;
            }
            else if(area < temp.key.getArea())
            {
                  temp = temp.left;
            }
            else
            {
                  temp = temp.right;
            }
    }
    }
    public void delete(String type, double area)
    {
    System.out.print("Deleting ");
    search(type, area);
    //Call the method to delete the node
    mydelete(type, area);
    }
    public void mydelete(String type, double area)
    {
    ShapeTreeNode temp = root;
    ShapeTreeNode parent = null;
    while(temp != null)
    {
            if (area == temp.key.getArea() && type.equals(temp.key.getType()))
            {
                 
                  if(temp.left == null && temp.right == null)
                  {
                        if(temp == root)
                        {
                              root = null;
                              break;
                        }
                       
                        if(temp == parent.left)
                        {
                              parent.left = null;
                        }
                        else
                        {
                              parent.right = null;
                        }
                  }
                  else if(temp.right == null)
                  {
                        if(parent == null)
                        {
                              root = root.left;
                              break;
                        }
                        if(temp == parent.left)
                        {
                              parent.left = temp.left;
                        }
                        else
                        {
                              parent.right = temp.left;
                        }
                  }
                  else
                  {
                        //Move to the right sub-tree
                        ShapeTreeNode temp2 = temp.right;
                        ShapeTreeNode parent_temp2 = temp;
                        while(temp2.left!=null)
                        {
                              parent_temp2 = temp2;
                              temp2 = temp2.left;
                        }
                       
                        //Copy the value of the left most tree in the key of the node to be deleted
                        temp.key = temp2.key;
                        //Delete the left-most node
                        if(temp2 == parent_temp2.left)
                        {
                              parent_temp2.left = temp2.right;
                        }
                       
                        else
                        {
                              parent_temp2.right = temp2.right;
                        }
                  }
                  break;
            }
           
            //Move to the left side if the value to be deleted is less than the current node
            else if(area < temp.key.getArea())
            {
                  parent = temp;
                  temp = temp.left;
            }
            //Otherwise move to the right side
            else
            {
                  parent = temp;
                  temp = temp.right;
            }
    }
    }
    public void deleteGreaterThan(double area)
    {
    System.out.println("Deleting values greater than "+area);
    ShapeTreeNode temp = root;
    //Start the loop to traverse the tree
    while(temp!= null)
    {
            if(temp.key.getArea() > area)
            {
                  temp.right = null;
                  mydelete(temp.key.getType(),temp.key.getArea());
                  temp = root;
            }
            else
            {
                  temp = temp.right;
            }
    }
    }
    public void writeTree(ShapeTreeNode root) 
    {
        try {
            FileWriter fileName = new FileWriter("newshape.txt"); 
            BufferedWriter bw = new BufferedWriter(fileName);
            write(root, bw);  
            bw.close();  
        }   
        catch(Exception ex) {
            System.out.print("An error occured try again ");
        }    
    }
    public void write(ShapeTreeNode newnode, BufferedWriter bw)
    {   
        if (newnode == null)
        { 
            return;
        }
        write(newnode.left, bw); // calls recursively
        try {
			bw.write(newnode+"\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        write(newnode.right, bw); // calls recursively
    }
    void addShape(Shape shape, ShapeTreeNode currentNode) 
    {
        if (shape.compareTo(currentNode.getShape()) == 0) 
        {
            return;
        } 
        else if (shape.compareTo(currentNode.getShape()) < 0) 
        {
            if (currentNode.getLeftChild() == null) 
            {
                currentNode.setLeftChild(new ShapeTreeNode(shape));
            } 
            else 
            {
                addShape(shape, currentNode.getLeftChild());
            }
        } 
        else 
        {
            if (currentNode.getRightChild() == null)
            {
                currentNode.setRightChild(new ShapeTreeNode(shape));
            } 
            else 
            {
                addShape(shape, currentNode.getRightChild());
            }
        }
    }

	public void addShape(Shape shape) 
	{
		addShape(shape, root);
		// TODO Auto-generated method stub
		
	}
}