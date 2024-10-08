package com.restart;

public class TestDemo {
	public static void main(String[] args) {
		 String s1 = "igr";
	        String s2 = "igr";
	        String s3 = new String("igr");
	        String s4 = new String("igr");

	        // Comparing references
	        if (s1 == s2) {
	            System.out.println("The output is good  : s1 and s2 ref are equal");
	        }

	        // Comparing objects' contents
	        if (s1.equals(s2)) {
	            System.out.println("s1 and s2 objects are equal");
	        }

	        // Comparing references
	        if (s3 == s4) {
	            System.out.println("s3 and s4 ref are equal");
	        }

	        // Comparing objects' contents
	        if (s3.equals(s4)) {
	            System.out.println("s3 and s4 objects are equal");
	        }
	    }
		
	}

	



