package com.camille.asciiart.utiles;

import java.util.Scanner;

public class ScannerProvider {
	
	    /** Constructeur priv� */
	    private ScannerProvider()
	    {
	    	this.scanner = new Scanner(System.in);
	    }
	     
	    /** Instance unique non pr�initialis�e */
	    private static ScannerProvider INSTANCE = null;
	     
	    /** Point d'acc�s pour l'instance unique du singleton */
	    public static synchronized ScannerProvider getInstance()
	    {           
	        if (INSTANCE == null)
	        {   INSTANCE = new ScannerProvider(); 
	        }
	        return INSTANCE;
	    }
	    
	    private Scanner scanner;
	    
	    public Scanner getScanner() {
	    	 return scanner;	
	    } 
	    
	}

