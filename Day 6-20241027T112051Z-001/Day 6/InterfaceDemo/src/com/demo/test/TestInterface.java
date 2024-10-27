package com.demo.test;

import com.demo.beans.MyClass;
import com.demo.interfaces.Interface1;
import com.demo.interfaces.Intrerface2;

public class TestInterface {
	public static void main(String[] args) {
		MyClass ob=new MyClass();
		ob.combination(5, 2);
		Interface1 ob1=new MyClass();
		ob1.combination(4, 2);
		Intrerface2 ob2=new MyClass();
		ob2.m3();
		((MyClass)ob2).m2(12);
		ob2.hashCode();
		
	}

}
