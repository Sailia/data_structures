// The NumberStack interface
// Xiwei Wang

public interface NumberStack
{
    boolean isEmpty();      // check if the stack is empty
    boolean isFull();       // check if the stack is full
    void push(int v);       // push a value onto the stack
    int pop();              // remove and return the element at the top of the stack
    int top();              // return the element at the top of the stack
    int size();             // return the number of elements on the stack
    @Override
    String toString();      // return string representation of the stack
}
