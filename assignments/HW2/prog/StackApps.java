// The StackApps class that implements two Stack applications
// Your name here

import java.util.Scanner;

public class StackApps 
{    
    // convert a decimal number into a binary number and save it in a stack
    // Do not create any arrays! Do not use any Java libraries to do the convertion.
    // Doing so will result in points deduction.
    public String decToBin(int numDec)
    {
        CharStack stackBinary = new CharStack(64);  // stack used to store the result binary number
        
        // TODO: complete this method
        
        return stackBinary.toString();  // return a string representation of the stack
    }
    
    // compute the sum of the two big intergers and save the result in a stack
    // Do not create any arrays! Do not use any Java libraries to do the calculation.
    // Doing so will result in points deduction.
    public String addBigIntegers(String num1, String num2)
    {
        CharStack stackNum1 = new CharStack(64);    // stack used to store number 1
        CharStack stackNum2 = new CharStack(64);    // stack used to store number 2
        CharStack stackResult = new CharStack(64);  // stack used to store the result of the addition
        
        // TODO: complete this method
        
        return stackResult.toString();  // return a string representation of the stack
    }    
}
