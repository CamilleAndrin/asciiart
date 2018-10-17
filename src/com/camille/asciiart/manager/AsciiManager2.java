package com.camille.asciiart.manager;

import com.camille.asciiart.alphabets.DefaultAlphabet;

public class AsciiManager2 {
	 
	private DefaultAlphabet alphabet;
    	
	public AsciiManager2(DefaultAlphabet alphabet){
		this.alphabet = alphabet;
	}
	
	public String getAsciiTranslation(String msg){ 
		
	int h = alphabet.getH();
	int w = alphabet.getW();
	String[] datas = alphabet.getDatas();
	
    char[] Tab = msg.toUpperCase().toCharArray();
    StringBuilder builder = new StringBuilder();
    
    for (int i = 0; i < h; i++){
    	for (int j = 0; j < Tab.length; j++) {
    		if(Tab[j] <= 65 && Tab[j] >= 90) {
    			builder.append(datas[i].substring((Tab[j]-55)*w, (Tab[j]-55)*w+w));
    		}else if(Tab[j] <= 48 && Tab[j] >= 57) {
    			builder.append(datas[i].substring((Tab[j]-48)*w, (Tab[j]-48)*w+w));
    		}else {
    			builder.append(datas[i].substring(35*w, (35*w)+w));
    		}
    	}
    	builder.append("\n");
    	
    }
	return builder.toString();
    
	}
}
