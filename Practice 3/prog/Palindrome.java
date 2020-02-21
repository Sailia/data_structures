// The test driver that checks for palindromes
// Xiwei Wang

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner conIn = new Scanner(System.in);
        
        System.out.print("Please enter a string: ");
        String str = conIn.nextLine();
        
        if (stringIsPalindrome(str))
            System.out.println("\"" + str + "\" is a palindrome." );
        else
            System.out.println("\"" + str + "\" is not a palindrome." );
    }
	

    public static boolean stringIsPalindrome(String str)
    {
        // TODO: implement this method 
        CharQueue q = new CharQueue(str.length());
        CharStack s = new CharStack(str.length());
        
        for(int = 0l i < str.length
    }
}
