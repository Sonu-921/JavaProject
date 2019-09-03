package com.app.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(50);
		al.add(20);
		al.add(87);
		al.add(45);
		System.out.println("ArrayList ::"+al);
		Collections.sort(al);
		System.out.println("ArrayList::"+al);
		System.out.println("Search 20::"+Collections.binarySearch(al,20));

	}

}
