/*
 *Sean Raudat for CSCE 146, Lab04, Linked list shit
 */
public class DoubleDoubleLL 
{
    private class Node 
    {
        public double data;
        public Node next;
        public Node prev;
    }
    private Node head;
    private Node current;
    public DoubleDoubleLL() //Constructor for LL
    {
        head = null;
        current = null;
    }
    public void gotoNext() 
    {
        if (current != null) {
            current = current.next;
        }
    }
    public void gotoPrev() 
    {
        if (current != null) 
        {
            current = current.prev;
        }
    }
    public void reset() 
    {
        current = head; 
    }
    public void gotoEnd() //Self explanatory but it goes to the last node in the list
    {
        if (head == null) 
        {
            return;
        }
        current = head;
        while (current.next != null) 
        {
            current = current.next;
        }
    }
    //from lab -- “hasMore” must return true if the current reference is not null or false if it is.
    public boolean hasMore() 
    {
        return (current != null);
    }
    public double getCurrent()
    {
        if (current != null) 
        {
            return current.data;
        } 
        else 
        {
            return -1;
        }
    }
    public void setCurrent(double data) 
    {
        if (current != null) 
        {
            current.data = data;
        }
    }
    //If head reference null, then it adds the new node to the start
    public void add(double data) 
    {
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = null;
        if (head == null) 
        {
            
            newnode.prev = null;
            head = newnode;
        } 
        else 
        {
            current = head;
            while (current.next != null) 
            {
                current = current.next;
            }
            newnode.prev = current;
            current.next = newnode;
        }
    }
    public void addAfterCurrent(double data) //uses add code to add after the current node
    {
        if (current == null) 
        {
            return;
        }
        Node  newnode = new Node();
        newnode.data = data;
        newnode.prev = current;
        newnode.next = current.next;
        current.next = newnode;
        if (newnode.next != null) 
        {
            newnode.next.prev = newnode;
        }
    }
    public void remove(double data) 
    {
        if (head == null)
        {
            return;
        }
        if (head.data == data) 
        {
            head = head.next;
            if (head != null) 
            {
                head.prev = null;
            }
            return;
        }
        current = head;
        while (current != null && current.data != data) 
        {
            current = current.next;
        }
        if (current == null) 
        {
            return;
        }
        current.prev.next = current.next;
        if (current.next != null) 
        {
            current.next.prev = current.prev;
        }
    }
    public void removeCurrent() //uses remove to remove the current 
    {
        if (current == null) 
        {
            return;
        }
        if (current == head) 
        {
            
            head = current.next;
            if (head != null) 
            {
                head.prev = null;
            }
            current = null;
            return;
        }
        current.prev.next = current.next;
        if (current.next != null) 
        {
            current.next.prev = current.prev;
        }
        current = null;
    }
    public void print() 
    {
        current = head;
        while (current != null) 
        {
        System.out.println(current.data);
        current = current.next;
        }
    }
    public boolean contains(double data) //clean up 
    {
        current = head;
        while (current != null) 
        {
        if (current.data == data) 
        {
        return true;
        }
        current = current.next;
        }
        return false;
    }
}