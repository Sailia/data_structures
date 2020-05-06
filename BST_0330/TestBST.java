// Test driver for the BST class
public class TestBST
{
    public static void main(String[] args)
    {
        BST mytree = new BST();
        mytree.add(20);
        mytree.add(10);
        mytree.add(30);
        mytree.add(5);
        mytree.add(12);
        mytree.add(25);
        mytree.add(36);
        
        System.out.println("size() returns " + mytree.size());
    }
}
