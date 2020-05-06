// The NumberList interface
// Xiwei Wang

public interface NumberList
{
    void insert(int v);         // insert a number into the list
    boolean isFull();           // check if the list is full
    boolean contains(int v);    // check if a given number exists in the list
    @Override
    String toString();          // return a string representatin of the list
}
