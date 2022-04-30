package com.darwinsys.strings;

/**
 * StringEscapes.java - show string escapes.
 * Note that they may not print correctly on all platforms.
 */
public class StringEscapes {
    public static void main(String[] args) {
        
		System.out.println("Java Strings in action:");
		// System.out.println("An alarm or alert: \a");	// not supported
		System.out.println("An alarm entered in Octal: \007");// An alarm entered in Octal: 
		System.out.println("A tab key: \t(what comes after)"); // A tab key: 	(what comes after)
		System.out.println("A newline: \n(what comes after)"); 
		/*
		 * A newline: 
		 * (what comes after)
		 */
		System.out.println("A UniCode character: \u0207"); // A UniCode character: ȇ
		System.out.println("A backslash character: \\"); // A backslash character: \
	}
}