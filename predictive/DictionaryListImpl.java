package predictive;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;



public class DictionaryListImpl extends PredictivePrototype {
	public static String now;
	public static ArrayList<WordSig> dictEnt = new ArrayList<WordSig>();
	private File textFile;
    private Scanner input;
    private Scanner dictRead;
    private String teamName;
    public static WordSig entry = new WordSig(null, null);
	DictionaryListImpl(File file) {
		textFile = file;
		ReadFile(file);
	//	File _file = textFile;
		
//		entry = new WordSig("abc", wordToSignature("abc"));
//		dictEnt.add(entry);
		
//		ReadFile(textFile);
		/*
		 try {
			  if (checkBeforeReadfile(_file)){
		   dictRead = new Scanner(_file);
//		   dictEnt = new ArrayList<WordSig>();
		   while (dictRead.hasNext()) {
		    String next = dictRead.nextLine();
		    if(isValidWord(next)) {
		     WordSig entry = new WordSig(next.toLowerCase(), wordToSignature(next.toLowerCase()));
		     System.out.println(entry.toString()); 
		     dictEnt.add(entry);
		    }teamName
		   }
		   Collections.sort(dictEnt);
			  }else{
			        System.out.println("Can't find the file");
			      }
		  } catch (FileNotFoundException e) {
		   e.printStackTrace();
		  }
		  */
		  
			  
			 

		 }
	
	 private void ReadFile(File _file) {
		 try {
			  if (checkBeforeReadfile(_file)){
		   dictRead = new Scanner(_file);
		   dictEnt = new ArrayList<WordSig>();
		   while (dictRead.hasNext()) {
		    String next = dictRead.nextLine().toLowerCase();
		    if(isValidWord(next)) {
		      entry = new WordSig(next, wordToSignature(next));
		//     System.out.println(entry.toString()); 
		     dictEnt.add(entry);
		    }
		   }
		   Collections.sort(dictEnt);		

			  }else{
			        System.out.println("Can't find the file");
			      }
		  } catch (FileNotFoundException e) {
		   e.printStackTrace();
		  }
		  }

		  private static boolean checkBeforeReadfile(File file){
		    if (file.exists()){
		      if (file.isFile() && file.canRead()){
		        return true;
		      }
		    }

		    return false;
		  }
		  
		    
	/*
	private void readInFile(File textFile){
        try {
            input = new Scanner(textFile);

            //read first string into variable teamName
            teamName = input.next();

            int i=0;
            //iterate through rest of file adding it to an ArrayList
            while(input.hasNext()){
                battingAvgs[i] = input.nextDouble();
                i++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    */
	
		    private BufferedReader wordsFile() {
		    	BufferedReader words = null;

		    	try {
		                words = new BufferedReader(new FileReader("K://Study/Software workshop/workspace/EX14/src/predictive/words.txt"));
		    	}
		    	catch (IOException e) {
		    	    System.out.println("Couldn't open words file");
		                System.out.println(e.getMessage());
		                System.exit(1);
		            }

		    	return words;
		        }


	public static void main(String[] args) {

		DictionaryListImpl reader = new DictionaryListImpl(new File("/usr/share/dict/words"));
//		reader.ReadFile(new File("K://Study/Software workshop/workspace/EX14/src/predictive/words.txt"));
//BufferedReader words = reader.wordsFile();
//		for(int i = 0; i < dictEnt.size(); i++) { 
//		 entry = new WordSig("abc", wordToSignature("abc"));
//		dictEnt.add(entry);
			System.out.println(dictEnt.get(0).toString()); 
			
//		}
		/*
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
		*/	
	}
	


	public String getinput()
	{
		return now;
	}
	
	 public static Set<String> signatureToWords(String signature) {
		return null;

	 }

}
