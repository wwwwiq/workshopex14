package predictive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Scanner;



public class DictionaryListImpl extends PredictivePrototype {
	public static String now;
	/**
	public static ArrayList<WordSig> values(int length){ // contain all the values of possible moves 

		ArrayList<WordSig>  n = new ArrayList<WordSig>();
		for(int i =0;i<length ; i++){
				n.add(new WordSig());
			}

			
				
		
		  return n;
		  
	}
	*/
	
	
	
	public DictionaryListImpl(File _file) {
		  try {
		Scanner dictRead = new Scanner(_file);
		   ArrayList<WordSig> dictEnt = new ArrayList<WordSig>();
		   while (dictRead.hasNext()) {
		    String next = dictRead.nextLine();
		    if(isValidWord(next)) {
		     WordSig entry = new WordSig(next.toLowerCase(), wordToSignature(next.toLowerCase()));
		     dictEnt.add(entry);
		    }
		   }
		   Collections.sort(dictEnt);

		  } catch (FileNotFoundException e) {
		   e.printStackTrace();
		  }
		 }

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
				
		System.out.println("test wordToSignature");
		input = in.nextLine();
		now = input;
		System.out.println(wordToSignature(input));
		System.out.println();
		System.out.println("Testing signatureToWords...");
		System.out.println();
		System.out.println(signatureToWords(wordToSignature(input)));
		System.out.println("Your input word should be one of the above...hopefully");	
	}
	
	public String getinput()
	{
		return now;
	}
	public int SignatureCount(String word) {
		ArrayList<Integer> Slot = new ArrayList<Integer>();
		int cal = 0;
		word = word.toLowerCase();
		
		Hashtable<String, Integer> charTable = new Hashtable<String, Integer>();
		charTable.put("a", 2);
		charTable.put("b", 2);
		charTable.put("c", 2);
		charTable.put("d", 3);
		charTable.put("e", 3);
		charTable.put("f", 3);
		charTable.put("g", 4);
		charTable.put("h", 4);
		charTable.put("i", 4);
		charTable.put("j", 5);
		charTable.put("k", 5);
		charTable.put("l", 5);
		charTable.put("m", 6);
		charTable.put("n", 6);
		charTable.put("o", 6);
		charTable.put("p", 7);
		charTable.put("q", 7);
		charTable.put("r", 7);
		charTable.put("s", 7);
		charTable.put("t", 8);
		charTable.put("u", 8);
		charTable.put("v", 8);
		charTable.put("w", 9);
		charTable.put("x", 9);
		charTable.put("y", 9);
		charTable.put("z", 9);
		

		
		for(int i = 0; i < word.length(); i++) { 
			if(!charTable.containsKey(Character.toString(word.charAt(i)))) {
				Slot.add(0);
			} else {
				Slot.add(charTable.get(Character.toString(word.charAt(i))));
			}
		}
		for(int i = 0; i < Slot.size(); i++) { 
			cal = (int) (cal + Slot.get(i) * Math.pow(10, i));
			
		}
		
		Slot.clear();
		
		return cal;
	}

}
