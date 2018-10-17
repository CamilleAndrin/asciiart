package com.camille.asciiart;

import com.camille.asciiart.alphabets.VotreAlphabet;
import com.camille.asciiart.alphabets.VotreAlphabet2;
import com.camille.asciiart.manager.AsciiManager;

public class ApplicationAsciiArt {

	public static void main(String[] args) {
        AsciiManager ascii = new AsciiManager(new VotreAlphabet());
        System.out.println(ascii.getAsciiTranslation("bonjour"));
        
        
	}
}
