// Test driver for the RecursiveMethods class
// Do not make any changes to this file!
// Xiwei Wang

import java.util.Arrays;

public class TestRecursiveMethods
{
    public static void main(String[] args)
    {
        RecursiveMethods myMethods = new RecursiveMethods();
        
        int numPassedTests = 0;
        int numTotalTests = 0;
        String testResult;
        
        // Test 1
        numTotalTests++;
        int iReturn = -1;
        testResult = "[Failed]";
        String eMsg = "N/A";
        try
        {
            int[] myArray = {10};
            iReturn = myMethods.sumSquares(myArray);
            
            if (iReturn == 100)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": sumSquares(10) ==> " + testResult + "\n Expected: 100" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 2
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            int[] myArray = {10, 20, 30, 40, 50, 60};
            iReturn = myMethods.sumSquares(myArray);
            
            if (iReturn == 9100)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": sumSquares(10, 20, 30, 40, 50, 60) ==> " + testResult + "\n Expected: 9100" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 3
        numTotalTests++;
        CharStack s = new CharStack(5);
        String sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            s.push('a');
            myMethods.upperStackRec(s);
            sReturn = s.toString();
            
            if (sReturn.equals("A"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": upperStackRec(\"a\" (from top to bottom)) ==> " + testResult + "\n Expected: \"A\" (from top to bottom)" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: \"" + sReturn + "\" (from top to bottom)\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 4
        numTotalTests++;
        s = new CharStack(5);
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            s.push('7');
            s.push('?');
            s.push('p');
            myMethods.upperStackRec(s);
            sReturn = s.toString();
            
            if (sReturn.equals("P?7"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": upperStackRec(\"p?7\" (from top to bottom)) ==> " + testResult + "\n Expected: \"P?7\" (from top to bottom)" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: \"" + sReturn + "\" (from top to bottom)\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");        
        
        // Test 5
        numTotalTests++;
        s = new CharStack(5);
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            s.push('4');
            s.push('K');
            s.push('3');
            s.push('s');
            s.push('c');
            
            myMethods.upperStackRec(s);
            sReturn = s.toString();
            
            if (sReturn.equals("CS3K4"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": upperStackRec(\"cs3K4\" (from top to bottom)) ==> " + testResult + "\n Expected: \"CS3K4\" (from top to bottom)" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: \"" + sReturn + "\" (from top to bottom)\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 6
        numTotalTests++;
        s = new CharStack(9);
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            s.push('Z');
            s.push('y');
            s.push('X');
            s.push('|');
            s.push('E');
            s.push('d');
            s.push('C');
            s.push('b');
            s.push('A');
            
            myMethods.upperStackRec(s);
            sReturn = s.toString();
            
            if (sReturn.equals("ABCDE|XYZ"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": upperStackRec(\"AbCdE|XyZ\" (from top to bottom)) ==> " + testResult + "\n Expected: \"ABCDE|XYZ\" (from top to bottom)" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: \"" + sReturn + "\" (from top to bottom)\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");        
        
        // Test 7
        numTotalTests++;
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            String myString = "";
            sReturn = myMethods.reverseStringRec(myString);
            
            if (sReturn.equals(""))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": reverseStringRec(\"\") ==> " + testResult + "\n Expected: \"\"" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: \"" + sReturn + "\"\n");
        else
            System.out.println(" Yours: " + eMsg + "\n"); 
        
        // Test 8
        numTotalTests++;
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            String myString = "a";
            sReturn = myMethods.reverseStringRec(myString);
            
            if (sReturn.equals("a"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": reverseStringRec(\"a\") ==> " + testResult + "\n Expected: \"a\"" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: \"" + sReturn + "\"\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");    
        
        // Test 9
        numTotalTests++;
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            String myString = "abc";
            sReturn = myMethods.reverseStringRec(myString);
            
            if (sReturn.equals("cba"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": reverseStringRec(\"abc\") ==> " + testResult + "\n Expected: \"cba\"" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: \"" + sReturn + "\"\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 10
        numTotalTests++;
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            String myString = "Hello, Data Structures!";
            sReturn = myMethods.reverseStringRec(myString);
            
            if (sReturn.equals("!serutcurtS ataD ,olleH"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": reverseStringRec(\"Hello, Data Structures!\") ==> " + testResult + "\n Expected: \"!serutcurtS ataD ,olleH\"" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: \"" + sReturn + "\"\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");    
        
        // Test 11
        numTotalTests++;
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            LNode myNode = null;
            sReturn = traverseList(myMethods.reverseListRec(myNode));
            
            if (sReturn.equals("head->null"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": reverseListRec(null) ==> " + testResult + "\n Expected: head->null" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + sReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n"); 
        
        // Test 12
        numTotalTests++;
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            LNode myNode = new LNode(20);
            sReturn = traverseList(myMethods.reverseListRec(myNode));
            
            if (sReturn.equals("head->20->null"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": reverseListRec(20) ==> " + testResult + "\n Expected: head->20->null" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + sReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");  
        
        // Test 13
        numTotalTests++;
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            LNode myNode = new LNode(20);
            LNode myNode1 = new LNode(30);
            LNode myNode2 = new LNode(40);            
            myNode.setLink(myNode1);
            myNode1.setLink(myNode2);
            sReturn = traverseList(myMethods.reverseListRec(myNode));
            
            if (sReturn.equals("head->40->30->20->null"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": reverseListRec(20->30->40) ==> " + testResult + "\n Expected: head->40->30->20->null" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + sReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n"); 
        
        // Test 14
        numTotalTests++;
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            LNode myNode = new LNode(90);
            LNode myNode1 = new LNode(80);
            LNode myNode2 = new LNode(70);
            LNode myNode3 = new LNode(60); 
            LNode myNode4 = new LNode(50); 
            LNode myNode5 = new LNode(40); 
            myNode.setLink(myNode1);
            myNode1.setLink(myNode2);
            myNode2.setLink(myNode3);
            myNode3.setLink(myNode4);
            myNode4.setLink(myNode5);
            sReturn = traverseList(myMethods.reverseListRec(myNode));
            
            if (sReturn.equals("head->40->50->60->70->80->90->null"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": reverseListRec(90->80->70->60->50->40) ==> " + testResult + "\n Expected: head->40->50->60->70->80->90->null" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + sReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");  

        System.out.println("Total test cases: " + numTotalTests + "\nCorrect: " + numPassedTests + "\nWrong: " + (numTotalTests - numPassedTests));		
    }
    
    public static String traverseList(LNode head)
    {
        String listContent = "head->";
        LNode current = head;
        
        while (current != null)
        {
            listContent += current.getInfo() + "->";
            current = current.getLink();
        }
        
        listContent += "null";
        
        return listContent;
    }
    
}
