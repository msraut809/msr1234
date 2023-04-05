package org.StringMethods;

public class StringAdditionEx9 {
	public static void main(String[] args) {
		String str= "ashtv12nbjh3jhhg4gg5jjj6"; ///2+3+4+5+6
		int sum=0;
		for(int i=0; i<str.length();i++) {
			char c =str.charAt(i);
			if(Character.isDigit(c)) {
				sum= sum + Integer.parseInt(String.valueOf(c));
			}
		}
        System.out.println("sum ="+sum);
	}

}
