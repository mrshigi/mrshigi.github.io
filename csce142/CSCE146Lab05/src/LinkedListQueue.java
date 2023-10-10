/*
 *Sean Raudat for CSCE 146, Lab05
 */
public class LinkedListQueue<T> 
{
	class ListNode
	{
		T data;
		ListNode link;
		ListNode(T aData, ListNode sr)		//Fuk it list node sean raudat for the gang
		{
			data = aData;
			link = sr;
		}
	}
	private ListNode head;
	private ListNode tail;
	public LinkedListQueue()
	{
		head = tail = null;
	}
	public LinkedListQueue(T data)
	{
		enqueue(data);
	}
	public void enqueue(T data)
	{
		ListNode n = new ListNode(data, null);
		if(head == null) 					//queue empty?
			head = tail = n;
		else 								//not empty, add to end
			{
			tail.link = n;
			tail = n;
			}
	}
	public T deque()
	{
		if(head == null)
			return null;
		else
		{
			T val = head.data;
			head = head.link; 				//move to next node
			if(head == null) 				//if now queue is empty make tail also null/empty
				tail = null;
			return val;						//i want to play valorant i am deadass in too deep
		}									//I think im gonna start doing comments like this as its visually pleasing to me
	}
	public T peek()
	{
		if(head == null) 					//queue is empty
			return null;
		else
			return head.data;
	}
	public void print()
	{
		ListNode n = head;
		while(n != null)
		{
			System.out.println(n.data);
			n = n.link;
			}
		System.out.println();
	}
}