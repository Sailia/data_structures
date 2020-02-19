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
        char bin = 'i';
        int num = numDec;
        
        while(num > 0) {
            int n = num % 2;
            bin = (char)(n + 48);
            num = num / 2;
            //System.out.println(bin);
            stackBinary.push(bin);
        }
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
        
        // 
//         // TODO: complete this method
//         for(int i = num1.length - 1; i >= 0; i--) {
//             stackNum1.push(num1.charAt(i));
//         } 
//         
//         for(int i = num2.length - 1; i >= 0; i--) {
//             stackNum2.push(num2.charAt(i));
//         }   
//         
//         BigInteger num1Int = new BigInteger(0);
//         BigInteger num2Int = new BigInteger(0);
//         int n = 0;
//         
//         for(int i = 0; i < num1.length; i++) {
//             n = (int) (stackNum1.pop() - 48);
//             num1Int *= 10;
//             num1Int += (BigInteger) n;
//         }
//         
//         for(int i = 0; i < num2.length; i++) {
//             n = (int) (stackNum2.pop() - 48);
//             num2Int = num2Int.multiply(10);
//             num2Int = num2Int.add((BigInteger) n);
//         }
//         
//         BigInteger sum = num1Int.add(num2Int);
//         BigInteger count = sum;
//         
//         while(count > 0) {
//             stackResult.push((char) (count.mod(10)));
//             count = count.divide(10);
//         }
        
        return stackResult.toString();  // return a string representation of the stack
    }    
}
