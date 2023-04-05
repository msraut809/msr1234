package org.StringMethods;

public class StringEx7 {
	public static void main(String[] args) {
		String str ="There is a garden and it is beautiful";
		
		String[] str1 =str.split(" ");
		String ans1 = "";
		for(int i=0; i<str1.length;i++) {
			
	   ans1=ans1 +" "+str1[i].substring(0, 1).toUpperCase()+str1[i].substring(1,str1[i].length());
		}
		System.out.println(ans1);
	}

}
