/*
 *Sean Raudat for CSCE 146, Lab03
 *I am gonna take an L on this lab it feels, i could not get my scanner to open properly again on the tester and so i get 
 *a file not found every time i try to test my code and it is mega frustrating
 *I do not know if my code is working as every time i try to store the Grocery list in the directory it somehow fries my code.
 *I will hope and assume it will work for you all as the gtrocery list will be actually working for your testing but idk fam
 *Line 71 of the tester also throws an error every time
 *I am gonna make a bold assumption i am going to have to redo this lab for the redo assignment
 */
public class GroceryList {
    private ListNode head;//Instance variables
    private ListNode current;
    private ListNode previous;
    public GroceryList()//constructor
    {
        head = new ListNode(null, null);
        current = head;
        previous = head;
    }
    public void gotoNext() //gotoNext: This moves the current node forward in the list by one node
    {
    	if (current != null) 
    	{
    		previous = current;
    		current = current.getLink();
        }
    }
    public GroceryItem getCurrent() //getCurrent: returns the data at the current node as long as the current isn’t null
    {
    	if (current != null) 
    	{
    		return current.getData();
    	}
    	return null;
    	}
    public void setCurrent(GroceryItem item) 
    /*setCurrent: takes in a parameter of type GroceryItem and 
     *sets the data at the current node to that value as 
     *long as current is not null and the data provided is also not null. 
     */
    {
    	if (current != null && item != null) 
    	{
            current.setData(item);
        }
    }
    public void addItem(GroceryItem item) 
    {
        if (item != null) 
        {
            ListNode newNode = new ListNode(item, null);
            if (head.getLink() == null) 
            {
                head.setLink(newNode);
                current = newNode;
            } 
            else 
            {
                ListNode temp = head.getLink();
                while (temp.getLink() != null) 
                {
                    temp = temp.getLink();
                }
                temp.setLink(newNode);
            }
        }
    }
    public void addAfterCurrent(GroceryItem item) 
    {
        if (item != null && current != null) 
        {
            ListNode newNode = new ListNode(item, current.getLink());
            current.setLink(newNode);
        }
    }
    public void removeCurrent() 
    {
        if (current != null) 
        {
            previous.setLink(current.getLink());
            current = current.getLink();
        }
    }
    public void showList() 
    {
        ListNode temp = head.getLink();
        while (temp != null) 
        {
            System.out.println(temp.getData());
            temp = temp.getLink();
        }
    }
    public boolean contains(GroceryItem item) 
    {
        ListNode temp = head.getLink();
        while (temp != null) 
        {
            if (temp.getData().equals(item)) 
            {
                return true;
            }
            temp = temp.getLink();
        }
        return false;
    }
    public double totalCost() //totalCost: returns the sum of all of the groceries. (5pts)
    {
        ListNode temp = head.getLink();
        double sum = 0;
        while (temp != null) 
        {
            sum += temp.getData().getValue();
            temp = temp.getLink();
        }
        return sum;
    }
    private class ListNode //this is to "Create an Internal class ListNode (5pts)"
    {
        private GroceryItem data;
        private ListNode link;
        public ListNode(GroceryItem data, ListNode link) 
        {
            this.data = data;
            this.link = link;
        }
        public GroceryItem getData() 
        {
            return data;
        }
        public void setData(GroceryItem data) 
        {
            this.data = data;
        }
        public ListNode getLink() 
        {
            return link;
        }
        public void setLink(ListNode link) 
        {
            this.link = link;
        }
    }
}