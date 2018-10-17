package com.camille.asciiart.utiles;

import java.util.Scanner;

public class ScannerProvider {
	
	    /** Constructeur privé */
	    private ScannerProvider()
	    {
	    	this.scanner = new Scanner(System.in);
	    }
	     
	    /** Instance unique non préinitialisée */
	    private static ScannerProvider INSTANCE = null;
	     
	    /** Point d'accès pour l'instance unique du singleton */
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

