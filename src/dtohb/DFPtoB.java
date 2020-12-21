/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtohb;

/**
 *
 * @author Lyvia
 */
import java.util.*; 
import java.util.concurrent.ThreadLocalRandom;


public class DFPtoB {
    
	static String decimalToBinary(double decimal, int decimalPlaces) 
	{ 
		String binary = ""; 

		
		int Integral = (int)  decimal; 

		
		double fractional =  decimal- Integral; 

		
		while (Integral > 0) 
		{ 
			int rem = Integral % 2; 

			
			binary += ((char)(rem + '0')); 

			Integral /= 2; 
		} 

		 
		binary = reverse(binary); 

		
		binary += ('.'); 

		
		while (decimalPlaces-- > 0) 
		{ 
			
			fractional *= 2; 
			int fract_bit = (int) fractional; 

			if (fract_bit == 1) 
			{ 
				fractional -= fract_bit; 
				binary += (char)(1 + '0'); 
			} 
			else
			{ 
				binary += (char)(0 + '0'); 
			} 
		} 
            
		return binary;
                
                          
	} 

	static String reverse(String input) 
	{ 
		char[] temparray = input.toCharArray(); 
		int left, right = 0; 
		right = temparray.length - 1; 

		for (left = 0; left < right; left++, right--) 
		{ 
			
			char temp = temparray[left]; 
			temparray[left] = temparray[right]; 
			temparray[right] = temp; 
		} 
		return String.valueOf(temparray); 
	} 
        
        
        
        
       public static double nextDoubleBetween(double min, double max) {
		return ThreadLocalRandom.current().nextDouble(min, max);
	}

	 
	public static void main(String[] args) 
	{ 
		/*double n = 4.47; 
		int k = 3; 
		System.out.println(decimalToBinary(n, k)); 

		n = 6.986; 
		k = 5; 
		System.out.println(decimalToBinary(n, k));\*/
            
          System.out.println("S/No:"+"        "+"Decimal Number: " +"          "+ "Binary Number: "+"         "+"Remark: ");
          for(int j=0;j<30;j++){
              double decimal= DFPtoB .nextDoubleBetween(123.234, 11255.234);
          int decimalPlaces=3;
          String binary=decimalToBinary(decimal, decimalPlaces);
       int count=0;
       String remark;
               for(int i=0;i< binary.length();i++){
               count++;}
               if (count<3){
                   remark="Exact";
                   
               }else{
                   decimalPlaces=5;
                   remark="Approximate";
               }
          
            System.out.println( );
          System.out.println(+j+"           "+decimal+"          "+decimalToBinary(decimal,decimalPlaces)+"          "+remark); 
        }
            
	} 
} 


