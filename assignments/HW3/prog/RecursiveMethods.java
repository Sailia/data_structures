// The RecursiveMethods class that implements several recursive solutions
// Your name here

public class RecursiveMethods 
{   
    // This method calls the sumSquareRec method and returns the sum of the 
    // squares of the elements in the array.
    public int sumSquares(int[] A)
    {
        // Do not make any changes to this method!
        return sumSquaresRec(A, 0);
    }    

    // This method takes an integer array as well as an integer (the starting 
    // index) and returns the sum of the squares of the elements in the array.
    public int sumSquaresRec(int[] A, int pos)
    {   
       /*
       Recursion requirements
       - Must have the recursive call 
       - Must have the terminating condition
       - Must make progress towards terminating
		*/
       // replace this statement with your own return
       int element = A[pos] * A[pos]; 
       
       if(pos < A.length - 1) {
         element += sumSquaresRec(A, pos + 1);
       }
       
       return element;
       
    }   

    // This method takes a character stack and converts all lower case letters
    // to upper case ones.
    public void upperStackRec(CharStack s)
    {
        // TODO: implement this method 
        /*
         This method takes a character stack and converts all lower case letters to upper case ones. 
        */ 
        
        char popped;
        
        if(!s.isEmpty()) {   
           popped = s.pop();
           String poppedString = popped + "";
           poppedString = poppedString.toUpperCase();
           popped = poppedString.charAt(0);
           upperStackRec(s);
           
           s.push(popped);
           
        }  else {
           return;
        }        
    }
    
    // This method reads a string and returns the string in the reversed order.
    public String reverseStringRec(String s)
    {
        // TODO: implement this method
		  // This method reads a string and returns the string in the reversed order.
        if(s.isEmpty()) {
           return s;
        }
        String letter = s.substring(0, 1);
        s = s.substring(1, s.length());
        return reverseStringRec(s) + letter;
    }
    
    // This method takes a reference to the head of a linked list.
    // It returns the reference to the head of the linked list in the reversed order.
    public LNode reverseListRec(LNode head)
    {
        // TODO: implement this method
		  /*This method takes a reference to the head of a linked list and returns 
        the reference to the head of the linked list in the reversed order.  */
        
        if(head == null) { return head; }
        if(head.getLink() == null) { return head; }
        
        
        
        head.getLink().setLink(head);
        head.setLink(null);
        return reverseListRec(head);
        
       
        
        
        
        
         // replace this statement with your own return
    }
}