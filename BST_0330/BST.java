// The BST class that represents binary search trees
// Xiwei Wang

public class BST 
{
    // instance variables
    private BSTNode m_root;
    
    // constructor
    public BST()
    {
        m_root = null;
        m_size = 0;
    }
    
    // empty the tree
    public void clear()
    {
        m_root = null;
    }
    
    // add a value into the tree
    public void add(int v)
    {
        m_root = addRec(v, m_root);
    }
    
    // recursive helper method for add
    public BSTNode addRec(int v, BSTNode node)
    {
        if (node == null) // check if the tree is empty
        {
            node = new BSTNode(v);
        }
        else if (v < node.getInfo()) // if the value is less than the current node, then go to the left subtree
            node.setLeft(addRec(v, node.getLeft()));
        else if (v > node.getInfo()) // if the value is greater than the current node, then go to the right subtree
            node.setRight(addRec(v, node.getRight()));
        
        return node;
    }
    
    // get the size of the tree
    public int size()
    {
        return sizeRec(m_root);
    }
    
    // recursive helper method for size
    public int sizeRec(BSTNode node)
    {
        if (node == null)
            return 0;
        else
            return sizeRec(node.getLeft()) + sizeRec(node.getRight()) + 1;
    }
}
