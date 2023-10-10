/*
 *Sean Raudat for CSCE 146, HW04QQQQQQQ
 */
public class Queue<T> //I have been between using T and SR, In class ik we use T and shit but I always have a desire to make it SR
{
// node class
	public class Node<T>
	{
		private T data;
		private Node<T> next;
		public Node()// constructors
		{
			this.setData((T) new Object());
			this.setNext(null);
		}
		public Node(T d)
		{
			this.setData(d);
			this.setNext(null);
		}
		public Node<T> getNext() 
		{
			return next;
		}
		public void setNext(Node<T> next) 
		{
			this.next = next;
		}
		public T getData() 
		{
			return data;
		}
		public void setData(T data) 
		{
			this.data = data;
		}
	}
	// root for queue
	private Node<T> root;
	// constructor
	public Queue()
	{
		this.root=null;
	}
	// add data in queue
	void enqueue(T data)
	{
		Node<T> node=new Node<T>(data);
		if(this.root==null)
		{
			this.root=node;
		}
		else
		{
			Node<T> cur=this.root;
			while(cur!=null)
			{
				if(cur.getNext()==null)
				{
					cur.setNext(node);
					break;
				}
				cur=cur.getNext();
			}
		}
	}
	// return root data
	T denqueue()
	{
		if(this.isEmpty()==false)
		{
			T data=this.root.getData();
			// set root as next root element
			this.root=this.root.getNext();
			return data;
		}
		return null;
	}
	// top of the element
	T top()
	{
		if(this.isEmpty()==false)
		{
			T data=this.root.getData();
			return data;
		}
		return null;
	}
	// empty queue
	boolean isEmpty()
	{
		return this.root==null;
	}
	// clear queue
	void clear()
	{
		this.root=null;
	}
}