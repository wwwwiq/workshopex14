package predictive;

import java.math.BigInteger;
import java.util.ArrayList;



public class WordSig implements Comparable<WordSig>{
private String signature;
private String words;
public WordSig (String words,String signature)
{ 
    this.words = words;
    this.signature = signature;
    
}
public String getwords() { return words; }
public String getsignature() { return signature; }


	public int compareTo(WordSig a)
    {
		
//    	PredictivePrototype a =new PredictivePrototype();
    	DictionaryListImpl b = new DictionaryListImpl(null);
    	if(b.SignatureCount(words) > b.SignatureCount(a.getwords()))
    	    return 1;
    	else if(b.SignatureCount(words) == (b.SignatureCount(a.getwords())))
    		return 0;
    	else
    		return -1;
    	
    }


 

}