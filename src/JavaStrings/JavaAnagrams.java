package JavaStrings;

import java.io.*;
import java.util.*;

public class JavaAnagrams {
	static boolean isAnagram(String a, String b)
	  {
	      boolean anagram = true;
	      Character[] charSet =   {'A','B','C','D','E',
	                            'F','G','H','I','J',
	                            'K','L','M','N','O',
	                            'P','Q','R','S','T',
	                            'U','V','W','X','Y','Z'};
	      HashMap<Character,Integer> ALetterFrequency = new HashMap<Character,Integer>();
	      HashMap<Character,Integer> BLetterFrequency = new HashMap<Character,Integer>();
	      intializeHash(ALetterFrequency, charSet);       
	      intializeHash(BLetterFrequency, charSet);       
	      a = a.toUpperCase(); 
	      b = b.toUpperCase(); 
	      
	     
	      for(int i = 0;i <a.length();i++)  
	      {
	    	  Character letter = a.charAt(i);   
	          Integer frequency = ALetterFrequency.get(letter);
	          ALetterFrequency.put(letter,++frequency);
	      }
	      for(int i = 0;i <b.length();i++)  
	      {
	          Character letter = b.charAt(i);   
	          Integer frequency = BLetterFrequency.get(letter);
	          BLetterFrequency.put(letter,++frequency);
	      }
	      
	      
	     
	      for(Character letter : charSet)
	      {
	          if(!ALetterFrequency.get(letter).equals(BLetterFrequency.get(letter)))
	          {
	              anagram = false;
	          }
	      }
	      
	      return anagram;
	  }
	  static void intializeHash(HashMap hash, Character[] set)
	  {
	      for(Character letter : set)
	     {
	          hash.put(letter,0);
	     }
	          
	  }
	  static Character[] toCharacterArray(char[] cArray)
	  {
	      Character[] CArray = new Character[cArray.length];
	      for(int i =0; i<cArray.length;i++)
	      {
	          CArray[i] = (Character) cArray[i];
	      }
	      return CArray;
	  }
		    
		    public static void main(String[] args) {
		        
		        //Scanner scan = new Scanner(System.in);
		      String a = "anagram";
		        String b = "margana";
		        //scan.close();
		        boolean ret = isAnagram(a, b);
		        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
		    }

	}