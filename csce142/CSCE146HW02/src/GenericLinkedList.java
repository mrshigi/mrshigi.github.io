/*
 *Sean Raudat for CSCE 146, HW02
 *I am not sure how successful i was in making this linked list
 */
public class GenericLinkedList <SR>
{
	private class ListNode
	{
		private SR data;
		private ListNode link;
		public ListNode()//default constructor
		{
			data = null;
			link = null;
		}
		public ListNode(SR aData, ListNode aLink) 
		{
			data = aData;
			link = aLink;
		}
	}
	private ListNode head, curr, prev;
	public GenericLinkedList()
	{
		head = curr = prev = null;
	}
	public SR getCurrent()
	{
		if(curr != null)
			return curr.data;
		else
			return null;
	}
	public void setCurrent(SR aData)
	{
		if(curr != null)
			curr.data = aData;
	}
	public void insert(SR aData)
	{
		ListNode newNode = new ListNode(aData, null);
		if(head == null)
		{
			head = newNode; 
			curr = head;
			return;
		}
		ListNode temp = head;
		while(temp.link != null)
		{
			temp = temp.link;
		}
		temp.link = newNode;
	}
	public void insertAfterCurrent(SR aData)
	{
		ListNode newNode = new ListNode(aData, null);
		if(curr != null)
		{
			newNode.link = curr.link;
			curr.link = newNode;
		}
		else if(head != null)
		{
			System.out.println("current is outside of the linked list");
		}
		else
		{
			System.out.println("List is empty");
		}
	}
	public void gotoNext()
	{
		if(curr != null)
		{
			prev = curr;
			curr = curr.link;
		}
	}
	public void resetCurrent()
	{
		curr = head;
		prev = null;
	}
	public boolean hasMore()
	{
		return curr != null;
	}
	public void print()
	{
		ListNode temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.link;
		}
	}
	public void deleteCurrent()
	{
		if(curr != null && prev != null)
		{
			prev.link = curr.link;
			curr = curr.link;
		}
		else if(curr != null && prev == null)
		{
			head = head.link;
			curr = head;
		}
	}
}