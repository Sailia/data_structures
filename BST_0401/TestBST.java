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
        mytree.inOrder();
        System.out.println("Is 12 in the tree? " + mytree.contains(12));
        System.out.println("Is 35 in the tree? " + mytree.contains(35));
        
        mytree.clear();
        System.out.print("Inserting 50,000 random numbers into the tree...");
        long startTime = System.currentTimeMillis();
        
        for (int i = 0; i < 50000; i++)
            mytree.add((int)(Math.random() * 100000));
        
        long endTime = System.currentTimeMillis();
        System.out.println("Done! Time cost: " + (endTime - startTime) / 1000.0 + "s.");
        
        mytree.clear();
        System.out.print("Inserting 50,000 sequential numbers into the tree...");
        startTime = System.currentTimeMillis();
        
        for (int i = 0; i < 50000; i++)
            mytree.add(i);
        
        endTime = System.currentTimeMillis();
        System.out.println("Done! Time cost: " + (endTime - startTime) / 1000.0 + "s.");      
    }
}
