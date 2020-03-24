package com.thunisoft.bamboo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;

public class Main {
	public static void  main(String[] args){
		testPX();
	}

	public static void testPX(){
		int[] a = new int[]{3,5,8,11};
		int[] b = new int[]{2,6,8,9,11,15,20};
		int[] c = new int[a.length+b.length];
		int j = 0;

		StringBuilder s1 = new StringBuilder();
		StringBuffer s2 = new StringBuffer();
		HashMap h1 = new HashMap();
		Hashtable h2 = new Hashtable();
		ArrayList a1 = new ArrayList<>();

		Vector a2 = new Vector();
		s1.append("123");
		s2.append("fd");
		h1.put("12","212");
		h2.put("112321","212");

		a1.add("");
		a2.add("");
		for(int i=0;i<a.length;i++){
			for(j=0;j<b.length;j++){
				System.out.println(a[i]+":"+b[j]);
				if(a[i]<b[j]){
					c[i+j]=a[i];
					j--;
					break;
				}else{
					c[i+j]=b[j];
				}
			}
		}
		System.out.println(Arrays.toString(c));
	}
}
