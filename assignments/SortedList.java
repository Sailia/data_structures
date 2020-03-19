//SortedList class that represents the sorted linked lists

public class SortedList {
   //instance variable
   private SLNode m_first;
   
   //constructor 
   public SortedList() {
      m_first = null;
   }
   
   // add a new node into the list, keeping it sorted
   public void add(int v) {
      SLNode newNode = new SLNode(v);
      
     // if(m_first == null) {
     //    m_first = newNode;
     // } else {
         SLNode current = m_first;
         SLNode previous = null;
         
         while(current != null) {
            if(current.getInfo() < v) {
               previous = current;
               current = current.getLink();
            } else {
               break;
            }
         }
         
         if(previous == null) {
            newNode.setLink(current);
            m_first = newNode;
         } else {
            newNode.setLink(current);
            previous.setLink(newNode);
         }
     // }
   }
   
   //remove a node from the list, keeping it sorted
   public boolean remove(int v) {
      SLNode current = m_first;
      SLNode previous = null;
      boolean found = false;
      
      while(current != null) {
         if(current.getInfo() < v) {   
            previous = current;
            current = current.getLink();
         } else if (current.getInfo() == v) {
            found = true;
            current = current.getLink();
            
            if(previous == null) {
               m_first = current;
            } else {
               previous.setLink(current);
               
            }
         } else {
            return found;
         }
      return found;
            
   }
   
   @Override
   public String toString() {
      String listContent = "The content of the list is ";
      SLNode current = m_first;
      
      while(current != null) {
         listContent += current.getInfo() + " ";
         current = current.getLink();
      }
      
      return listContent;
   }
}