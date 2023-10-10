/*
 *Sean Raudat for CSCE 146, HW06, Trees but not the fun kind
 */

public class ShapeTreeNode
{
      public Shape key;
      public ShapeTreeNode left;
      public ShapeTreeNode right;
      
      public ShapeTreeNode(Shape obj)
    {
        key = obj;
        left = null;
        right = null;
    }
      private Shape shape;
      private ShapeTreeNode leftChild;
      private ShapeTreeNode rightChild;

      public Shape getShape() 
      {
          return shape;
      }

      public void setShape(Shape shape) 
      {
          this.shape = shape;
      }

      public ShapeTreeNode getLeftChild() 
      {
          return leftChild;
      }

      public void setLeftChild(ShapeTreeNode leftChild) 
      {
          this.leftChild = leftChild;
      }

      public ShapeTreeNode getRightChild() 
      {
          return rightChild;
      }

      public void setRightChild(ShapeTreeNode rightChild) 
      {
          this.rightChild = rightChild;
      }
}