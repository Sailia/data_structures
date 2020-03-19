// The LNode class that represents a node in linked lists
// Do not make any changes to this file!
// Xiwei Wang

public class SLNode 
{
    // instance variables
    private int m_info;
    private SLNode m_link;
    
    // constructor
    public LNode(int info)
    {
        m_info = info;
        m_link = null;
    }
    
    // member methods
    public void setLink(SLNode link)
    {
        m_link = link;
    }
    
    public SLNode getLink()
    {
        return m_link;
    }
    
    public int getInfo()
    {
        return m_info;
    }   
}