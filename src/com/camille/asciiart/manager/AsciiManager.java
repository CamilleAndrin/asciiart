package com.camille.asciiart.manager;

import com.camille.asciiart.alphabets.DefaultAlphabet;

public class AsciiManager {
	 
	private DefaultAlphabet alphabet;
    	
	public AsciiManager(DefaultAlphabet alphabet){
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
    		if(Tab[j] <= 90 && Tab[j] >= 65) {
    			builder.append(datas[i].substring((Tab[j]-65)*w, (Tab[j]-65)*w+w));
    		}else {
    			builder.append(datas[i].substring(26*w, (26*w)+w));
    		}
    	}
    	builder.append("\n");
    	
    }
	return builder.toString();
    
	}
}
