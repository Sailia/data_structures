import java.util.*;

public class BST 
{
 // instance variables
 private BSTNode m_root;
 private int m_size;
 
 // constructor
 public BST()
 {
     m_root = null;
     m_size = 0;
 }
 
 // This method returns the number of elements in the tree.
 // Do not make any changes to this method!
 public int size()
 {
     return m_size;
 }
 
 // This method clears the content of the tree.
 // Do not make any changes to this method!
 public void clear()
 {
     m_root = null;
     m_size = 0;
 }    
 
 // This non-recursive method takes a string and inserts it into the binary
 // search tree, keeping the tree ordered.
 public void add(String value)
 {
     // TODO: implement this method using a non-recursive solution
	 BSTNode newNode = new BSTNode(value);
	 if(m_root == null) {
       m_root = newNode;
		 m_size++;
		 return;
	 }
	 
	 BSTNode current = m_root;
	 BSTNode parent = null;
	 
	 while(current != null) {
		 if(value.equals(current.getInfo())) {
			 return;
		 }
		 parent = current;
		 
		 int val = value.compareTo(current.getInfo());
		 if(val < 0) {
			current = current.getLeft();
		 } else {
			current = current.getRight();
		 }
	 }
	 
	 if(value.compareTo(parent.getInfo()) < 0) {
		 parent.setLeft(newNode);
	 } else {
		 parent.setRight(newNode);
	 }
	 m_size++;
 }
 
 // This non-recursive method returns a string that represents the in-order traversal
 // of the binary search tree.
 public String inOrder()
 {   
     // TODO: implement this method using a non-recursive solution
     if(m_root == null) {
    	 return null;
     }
     Stack<BSTNode> stack = new Stack<BSTNode>();
     BSTNode current = m_root;
     String outputStack = "";
     
     while(true) {
    	 if(current != null) {
    		 stack.push(current);
    		 current = current.getLeft();
    	 } else {
    		 if(stack.empty()) {
    			 break;
    		 }
    		 current = stack.pop();
    		 System.out.print(current.getInfo());
    		 outputStack += current.getInfo() + " ";
    		 current = current.getRight();
    	 }
     }
     
     return outputStack;
 } 
 
 // This method returns the smallest element in the binary search tree. You 
 // are not allowed to create any additional structures, including but not 
 // limited to arrays, stacks, queues, or other trees.
 public String min()
 {
     // TODO: implement this method
	 BSTNode current = m_root;
	 while(current.getLeft() != null) {
		 current = current.getLeft();
	 }
     
     return current.getInfo(); // replace this statement with your own return
 }
 
 // This method takes a reference to the root of the expression, evaluates
 // the tree, and returns the result as an int.
 public int evaluate(BSTNode node)
 {
     // TODO: implement this method
     
     int result, operand1, operand2;
     
     
     if(node == null) {
        result = 0;   
     } else {
     
     
        String operator = "*/+-";
        
        if(operator.contains(node.getInfo())) {
           operand1 = evaluate(node.getLeft());
           operand2 = evaluate(node.getRight());
           if(node.getInfo() == "*") {
              result = operand1 * operand2;
           } else if (node.getInfo() == "/") {
              result = operand1 / operand2;
           }  else if (node.getInfo() == "+") {
              result = operand1 + operand2;
           } else {
              result = operand1 - operand2;
           }
        } else {
           result = Integer.parseInt(node.getInfo());
        }
     }
     
     return result; // replace this statement with your own return
 }
}

