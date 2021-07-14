package com.learn.gfg;

import java.security.*; 
import java.util.*; 

public class SecureRandomGetInstance {
	public static void main(String[] argv) 
	{ 
		try { 
			// creating the object of SecureRandom and getting instance 
			// By usng getInstance() method 
			SecureRandom sr = SecureRandom.getInstance("SHA1PRNG"); 

			// Declaring the string variable 
			String str = "Tajmahal"; 

			// Declaring the byte Array 
			// converting string into byte 
			byte[] b = str.getBytes(); 

			// printing the byte array 
			System.out.println("Byte array before operation : "
							+ Arrays.toString(b)); 
			
			System.out.println("Provider "+sr.getProvider());
			
			// generating user-specified number of random bytes 
			// using nextBytes() method 
			sr.nextBytes(b); 

			// printing the new byte array 
			System.out.println("Byte array after operation : "
							+ Arrays.toString(b)); 
		} 

		catch (NoSuchAlgorithmException e) { 

			System.out.println("Exception thrown : " + e); 
		} 
		catch (ProviderException e) { 

			System.out.println("Exception thrown : " + e); 
		} 
	} 
} 
