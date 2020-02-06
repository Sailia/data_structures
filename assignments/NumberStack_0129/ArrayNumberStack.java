// The array based implementation for the NumberStack ADT
// Xiwei Wang

public class ArrayNumberStack implements NumberStack
{
    // instance variables
    private int[] m_array;
    private int m_index;
    
    // constructor
    public ArrayNumberStack(int cap)
    {
        m_array = new int[cap];
        m_index = 0;
    }
    
    // check if the stack is empty
    public boolean isEmpty()
    {
        return (m_index == 0);
    }
    
    // check if the stack is full
    public boolean isFull()
    {
        return (m_index == m_array.length);
    }
    
    // push a value onto the stack
    public void push(int v)
    {
        if (isFull())
            throw new RuntimeException("push attempted on a full stack");
        else
        {
            m_array[m_index] = v;
            m_index++;
        }
    }
    
    // remove and return the element at the top of the stack
    public int pop()
    {
        if (isEmpty())
            throw new RuntimeException("pop attempted on an empty stack");
        else
        {
            int v = m_array[m_index - 1];
            m_index--;
            
            return v;
        }        
    }
    
    // return the element at the top of the stack
    public int top()
    {
        if (isEmpty())
            throw new RuntimeException("top attempted on an empty stack");
        else
            return m_array[m_index - 1];        
    }
    
    // return the number of elements on the stack
    public int size()
    {
        return m_index;
    }
    
    // return string representation of the stack
    @Override
    public String toString()   
    {
        String stackContent = "The content of the stack from top to bottom is\n";
        
        for (int i = m_index - 1; i >= 0; i--)
            stackContent += m_array[i] + "\n";
        
        return stackContent;
    }
}
