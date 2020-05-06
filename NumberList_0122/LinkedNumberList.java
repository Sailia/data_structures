// The linked list based implementation for the NumberList ADT
// Xiwei Wang

public class LinkedNumberList implements NumberList
{
    // instance variables
    private LNode m_first, m_last;
    
    // constructor
    public LinkedNumberList()
    {
        m_first = null = m_last = null; //create empty linked list
    }    
    
    // insert a number into the list
    public void insert(int v)
    {
        LNode newNode = new LNode(v); //create placeholder for node
        
        /* insertion at the front
        newNode.setLink(m_first); //grab the first node in the list
        m_first = newNode; //set the new node to the beginning of the list
        */
        
        //insertion at the end
        if (m_first == null) {
         m_first = m_last = newNode;
        } else { 
         m_last.setLink(newNode);
         m_last = newNode;
        }
    }
    
    // check if the list is full
    public boolean isFull()
    {
        return false;
    }
    
    // check if a given number exists in the list
    public boolean contains(int v)
    {
        LNode current = m_first;
        
        while (current != null)
        {
            if (current.getInfo() == v)
                return true;
            else
                current = current.getLink();
        }
                
        return false;
    }
    
    // return a string representation of the list
    @Override
    public String toString()
    {
        String listContent = "The content of the list is ";        
        LNode current = m_first;
        
        while (current != null)
        {
            listContent += current.getInfo() + " ";
            current = current.getLink();
        }
        
        return listContent;
    }    
}
