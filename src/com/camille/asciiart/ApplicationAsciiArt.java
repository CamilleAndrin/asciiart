package com.camille.asciiart;

import com.camille.asciiart.alphabets.VotreAlphabet;
import com.camille.asciiart.alphabets.VotreAlphabet2;
import com.camille.asciiart.alphabets.VotreAlphabet3;
import com.camille.asciiart.manager.AsciiManager;
import com.camille.asciiart.manager.AsciiManager2;
import com.camille.asciiart.utiles.ScannerProvider;

public class ApplicationAsciiArt {

	public static void main(String[] args) {
        AsciiManager2 ascii = new AsciiManager2(new VotreAlphabet3());
        System.out.println(ascii.getAsciiTranslation(ScannerProvider.getInstance().getScanner().nextLine()));
        
        
	}
}
