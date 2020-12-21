/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtohb;
import java.util.Scanner;

/**
 *
 * @author Lyvia
 */
public class DtoHB {
    

    /**
     * @param args the command line arguments
     */
    
    public static String DtoB(int decimal){
        
     int remainder, i = 0;
     String binaryNum="";

        while (decimal != 0){
            remainder = decimal % 2;
            decimal /= 2;
            binaryNum = binaryNum + remainder;
            i *= 10;
        }
        return binaryNum;
   
        
        
    }
    public static String DtoH(int decimal){
    
    String hexNum = "";
    int remainder;
    
while (decimal > 0) {
  remainder = decimal % 16;
  if (remainder == 10) {
    hexNum = "A" + hexNum;
  } else if (remainder == 11) {
    hexNum = "B" + hexNum;
  } else if (remainder == 12) {
    hexNum = "C" + hexNum;
  } else if (remainder == 13) {
    hexNum = "D" + hexNum;
  } else if (remainder == 14) {
    hexNum = "E" + hexNum;
  } else if (remainder == 15) {
    hexNum = "F" + hexNum;
  } else {
    hexNum = remainder + hexNum;
  }
  decimal = decimal / 16;
}
return hexNum;
    
    
    
    }
    public static void main(String[] args) {
        
        
        // TODO code application logic here
        Scanner keyboard = new Scanner (System.in);
    System.out.println("Please enter the decimal number: ");
    int decimal = keyboard.nextInt ();
    String Binary = DtoB(decimal);
    System.out.println ("The Binary Value is: " +Binary); 
    String Hexa = DtoH(decimal);
        System.out.println("The hexadecimal value is : "+Hexa);
        
   
    }
    
}
