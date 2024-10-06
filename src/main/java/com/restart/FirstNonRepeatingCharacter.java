package com.restart;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static char FirstNonRepeatingCharacter(String str) {
		
		Map<Character, Integer> charCountMap = new LinkedHashMap<>();

		for (char c : str.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer>

		entry : charCountMap.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}

		return '\0';
	}
	
	
	public static void main(String[] args) {
		String input="aabccac";
		char output= FirstNonRepeatingCharacter(input);
		
		if(output !='\0') {
			System.out.println("FirstNonRepeatingCharacter : "+ output );
		}else {
			
			System.out.println("no NonRepeatingCharacter found.");
		}
		
	}

}
