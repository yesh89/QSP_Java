package com.rakuten;

public class Test {
	public static void main(String[] args) {
			String str = "I Love Java";
			System.out.println(str);
			String[] strArr = str.split(" ");
			for(String arr :strArr)
			{
				System.out.println(arr);
			}
			String [] strRev = null;
			for(int i=0;i<strArr.length;i--) {
				strRev[i]=strArr[strArr.length-1];
			}
			System.out.println(strRev);
	}
}
