// The linked list based implementation for the NumberStack ADT
// Your name here

public class LinkedNumberStack implements NumberStack
{
    // instance variable
    private LNode m_top;

    // check whether the stack is empty
    public boolean isEmpty()
    {       
        if (m_top == null)
            return true;
        else
            return false;
    }

    // check whether the stack is full
    public boolean isFull()
    {
        return false;
    }
    
    // return the element at the top of the stack
    public int top()
    { 
        if (isEmpty())
            throw new RuntimeException("top attempted on an empty stack");
        else
            return m_top.getInfo();
    }

    // push a value onto the stack
    public void push(int v)
    {
        if(isFull()) {
           throw new RuntimeException("push attempted on a full stack");
        } else if(!isEmpty()) {
           LNode newNode = new LNode(v);
           // TODO: implement this method
           newNode.setLink(m_top);
           m_top = newNode;
        } else {
           LNode newNode = new LNode(v);
           m_top = newNode;
        }
    }

    // remove and return the value at the top of the stack
    public int pop()
    { 
        // TODO: implement this method
        if(isEmpty()) {
            throw new RuntimeException("pop attempted on empty stack");
        }
        LNode top = m_top;
        if(top.getLink() == null) {  
            m_top = null;
        } else {
            LNode link = top.getLink();    
            m_top = link;  
        } 
		
        return top.getInfo(); // replace this statement with your own return
    }

    // return the number of elements on the stack
    public int size()
    {       
        // TODO: implement this method
		  int count = 0; 
        LNode top = m_top;
        
        if(!isEmpty()) {
           while(top.getLink() != null) {
               top = top.getLink();
               count++;
           }
           count++;
        }
        return count; // replace this statement with your own return
    }

    // return a string representation of the stack
    @Override    
    public String toString()
    {
        String stackContent = "";
        LNode current = m_top;

        while (current != null)
        {
            stackContent += current.getInfo() + " ";
            current = current.getLink();
        }

        return stackContent;    
    }
}