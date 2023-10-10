import java.util.Iterator;

/*
 *Sean Raudat for CSCE 146, HW03, TASKS ON TASKS ON TASKS 
 */
public class GenLL<T> implements Iterable
{
    Node<T> head; // head node of linked list
    Node<T> tail; // tail node of linked list
    int size; // size of linked list
    public class Node<T> 
    {
        public T data; // data of node
        public Node<T> next; // next node in linked list
        public Node(T data) 
        {
            this.data = data;
        }
        
        public T getData() 
        {
            return data;
        }
        
        public Node<T> getNext() 
        {
            return next;
        }
        
        public void setNext(Node<T> next) 
        {
            this.next = next;
        }
    }

    // constructor to initialize head, tail, and size of linked list
    public GenLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    // method to add a node to the end of linked list
    public void add(T data) 
    {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }
    // method to remove a node from linked list
    public boolean remove(T data) {
        Node<T> current = head;
        Node<T> prev = null;

        // traverse linked list until data is found
        while (current != null) {
            if (current.data.equals(data)) 
            {
                // update the link of previous node to next node
                if (prev != null) {
                    prev.next = current.next;
                } else {
                    head = current.next;
                }
                size--;
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }
    public int getSize() 
    {
        return size;
    }
    public boolean contains(T data) 
    {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    // method to display the linked list
    public void display() 
    {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
}