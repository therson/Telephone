

import java.lang.Math; 
import java.util.*;


public class NumericConverter {
	
  public NumericConverter(){
  
  }
  
  // Remove whitespace from input string and convert to upper case for map comparison
  public String StringChecker(String let){
  
  	String letters = let;
    
    //System.out.println(letters.trim().toUpperCase());
	return letters.trim().toUpperCase();
  }

  // Returns true if input string is not empty and contains only letters
  public boolean isLetter(String let){
  //System.out.println((let.matches("[a-zA-Z]+")) && !(let.isEmpty()));
  return((let.matches("[a-zA-Z]+")) && !(let.isEmpty()));
  }	
  
  // Convert input string into output string of digits
  public String convertToKeys(String inp){
    
  	HashMap<Character, Integer> keyNumber = new HashMap<Character, Integer>();
    
      keyNumber.put('A', 2);
      keyNumber.put('B', 2);
      keyNumber.put('C', 2);
      keyNumber.put('D', 3);
      keyNumber.put('E', 3);
      keyNumber.put('F', 3);
      keyNumber.put('G', 4);
      keyNumber.put('H', 4);
      keyNumber.put('I', 4);
      keyNumber.put('J', 5);
      keyNumber.put('K', 5);
      keyNumber.put('L', 5);
      keyNumber.put('M', 6);
      keyNumber.put('N', 6);
      keyNumber.put('O', 6);
      keyNumber.put('P', 7);
      keyNumber.put('Q', 7);
      keyNumber.put('R', 7);
      keyNumber.put('S', 7);
      keyNumber.put('T', 8);
      keyNumber.put('U', 8);
      keyNumber.put('V', 8);
      keyNumber.put('W', 9);
      keyNumber.put('X', 9);
      keyNumber.put('Y', 9);
      keyNumber.put('Z', 9);
    
    


    if (isLetter(inp)){
    String final_input = StringChecker(inp);
    StringBuilder tk = new StringBuilder(final_input.length());
    for(char c: final_input.toCharArray()){
      tk.append(keyNumber.get(c));
    
    }
  		System.out.println(tk.toString());
		return tk.toString();
  } else {
        System.out.println("Error -- Input must contain only letters and have length > 0");
		return("Error -- Input must contain only letters have have length > 0");	
  		}
  }
  
  
  public static void main(String[] args){
    if (args.length > 0) { 
  NumericConverter test = new NumericConverter();
  test.convertToKeys(args[0]);
    } else {
    System.out.println("Error -- Must pass an argument");
    }
  
  }

}