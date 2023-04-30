package _00_Intro_To_String_Methods;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

/*
 * Visit the JavaDocs for the String class to view everything you can do with a String.
 * https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
 * https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html
 *
 * HINT:  Here are some String methods you might find useful 
 * contains
 * replace
 * trim
 * length
 * getBytes
 * endsWith
 * split 
 * indexOf
 * lastIndexOf
 * compareTo(IgnoreCase)
 * substring
 * toUpperCase/toLowerCase
 * valueOf
 *
 * Here are some Character methods you might find useful:
 * Character.toLowerCase(char c);
 * Character.toUpperCase(char c);
 * Character.isLetter(char c);
 * Character.isDigit(char c);
 * Character.getNumericValue(char c);
 */

public class _01_StringMethods {

    // Given Strings s1 and s2, return the longer String
    public static String longerString(String s1, String s2) {
    	String longerString = null;
    	if(s1.length() > s2.length()) {
    		longerString = s1;
    	}
    	else {
    		longerString = s2;
    	}
        return longerString;
    }

    // If String s contains the word "underscores", change all of the spaces
    // to underscores
    public static String formatSpaces(String s) {
    	String replacedString = null;
    	if(s.contains("underscores")) {
    	 replacedString = s.replace(" ", "_");
    	 return replacedString;
    	}
        return s;
    }

    // Return the name of the person whose LAST name would appear first if they
    // were in alphabetical order.
    // You cannot assume there are no extra spaces around the name, but you can
    // assume there is only one space between the first and last name
    public static String lineLeader(String s1, String s2, String s3) {
    	System.out.println(s1);
    	System.out.println(s2);
    	System.out.println(s3);
    	String name = null;
    			
    	String[] words = s1.trim().split(" ");
    	String[] words2 = s2.trim().split(" ");
    	String[] words3 = s3.trim().split(" ");
    	String[] arr3 = {words[1],words2[1],words3[1]};
    	  for (int i = 0; i < arr3.length; i++) {
              for (int k = 0; k < arr3.length - 1; k++) {
                  
                  // "a".compareTo( "b" ) => -1
                  // "b".compareTo( "a" ) => 1
                  // "b".compareTo( "b" ) => 0
                  if( arr3[k].compareTo(arr3[ k+1 ]) > 0 ) {
                      String temp = arr3[k];
                      arr3[k] = arr3[ k+1 ];
                      arr3[ k+1 ] = temp;
                      
                  }
                  
                  
              }
          }
        if(arr3[0].equals(words[1])){
        	name = words[0] + " " + words[1];
        }
        if(arr3[0].equals(words2[1])) {
        	name = words2[0] + " " + words2[1];
        }
        if(arr3[0].equals(words3[1])) {
        	name = words3[0] + " " + words3[1];
        }
        System.out.println(name);
        return name;
    }

    // Return the sum of all numerical digits in the String
    public static int numeralSum(String s) {
    	int sum = 0;
    	int additionalNum = 0;
    	String man;
    	for(int i = 0; i < s.length(); i++) {
       if(Character.isDigit(s.charAt(i))) {
    	   man = "" + s.charAt(i);
    	    additionalNum = Integer.parseInt(man);
    	    sum += additionalNum;
    	 
       }
       char character = s.charAt(i);
       System.out.println(character);
    }
 return sum;
    }
    // Return the number of times String substring appears in String s
    public static int substringCount(String s, String substring) {
        int index;
    	int numOccurances = 0;
    	index = s.indexOf(substring);
    	while(index != -1) {
    		numOccurances++;
    		index = s.indexOf(substring, index + substring.length());
    	}
    	        return numOccurances;
    }

    // Call Utilities.encrypt at the bottom of this file to encrypt String s
    public static String encrypt(String s, char key) {
    	
    	byte[] strybytes = null;
	
			strybytes = s.getBytes();
		 
			
			
		
    	
    	
        return Utilities.encrypt(strybytes, (byte) key);
    }

    // Call Utilities.decrypt at the bottom of this file to decrypt the
    // cyphertext (encrypted text)
    public static String decrypt(String s, char key) {
    	byte[] strybytes = null;
    	
		strybytes = s.getBytes();
	 
		
		
	
	
	
    return Utilities.decrypt(s, (byte) key);
        
    }

    // Return the number of words in String s that end with String substring
    // You can assume there are no punctuation marks between words
    public static int wordsEndsWithSubstring(String s, String substring) {
    	
    	String[] strings = s.split(" ");
    	int index;
    	int numOccurances = 0;
    	index = s.indexOf(substring);
    	while(index != -1 ) {
    		
    		index = s.indexOf(substring, index + substring.length());
    	}
    	for (int i = 0; i < strings.length; i++) {
			if(strings[i].endsWith(substring)) {
				numOccurances++;
			}
		}
    	        return numOccurances;	
        
    }

    // Given String s, return the number of characters between the first
    // occurrence of String substring and the final occurrence
    // You can assume that substring will appear at least twice
    public static int distance(String s, String substring) {
    	int dist = 0;
     	
     	String firstSub;
     	String lastSub;
     	boolean isInitialized;
     	for (int i = 0; i < s.length(); i++) {
			
		firstSub =	s.substring(i, i +substring.length()-1);
		if(firstSub!=)
		}
     	
     	
        return 0;
    }
    
    // Return true if String s is a palindrome
    // palindromes are words or phrases are read the same forward as backward.
    // HINT: ignore/remove all punctuation and spaces in the String
    public static boolean palindrome(String s) {
    	String nothing = "";
    	String spac = " ";
    	char question = '?';
    	char period = '.';
    	char comma = ',';
    	char colon = ':';
    	char dash = '-';
    	char space = ' ';
    s =	s.replace(question, ' ');
    s =	s.replace(period,  ' ');
    s =	s.replace(comma,  ' ');
    s =	s.replace(colon,  ' ');
    s =	s.replace(dash, ' ');
    s = s.replace(spac, nothing);
    	s = s.trim().toLowerCase();
    	System.out.println("line 3:" + s);
    	for (int i = 0; i < s.length(); i++) {
    	     
    	    	 if(s.charAt(0 + i) != s.charAt(s.length()-1 - i)) {
    	    		 
    	    		 return false;
    	    	 }
    	     
    	}
			
		
    	
    	
        return true;
    }
}

class Utilities {
    // This basic encryption scheme is called single-byte xor. It takes a
    // single byte and uses exclusive-or on every character in the String.
    public static String encrypt(byte[] plaintext, byte key) {
        for (int i = 0; i < plaintext.length; i++) {
            plaintext[i] = (byte) (plaintext[i] ^ key);
        }
        return Base64.getEncoder().encodeToString(plaintext);
    }

    public static String decrypt(String cyphertext, byte key) {
        byte[] b = Base64.getDecoder().decode(cyphertext);
        for (int i = 0; i < b.length; i++) {
            b[i] = (byte) (b[i] ^ key);
        }
        return new String(b);
    }
}
