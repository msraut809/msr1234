package org.StringMethods;

public class StringReplaceMethodEx4 {
	public static void main(String[] args) {
		String str ="There is a garden and it is beautiful.";
		
		System.out.println(str.replace('i', 'z'));
		
		System.out.println(str.replace("is", "was"));
		
		System.out.println(str.replaceAll(" ", " AAA "));
		
		System.out.println(str.replaceFirst("is", "was"));
	
		//Concat method
		String strA ="Pune";
		String strB ="Mumbai";
		String strAB=strA+"_"+strB;
		System.out.println(strAB);
		System.out.println(strA.concat(strB));
		System.out.println();
	}

}
