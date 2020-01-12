package com.dhiyan;

import java.util.ArrayList;
import java.util.List;

interface Drawable{
	public void draw(int i,String x);
}

public class LambdaTest {
	
	public void Test() {
//(arguments)->{body}
	Drawable d = (i,x) -> {		
			System.out.println("hello" + i+x);			
		};
	
	d.draw(10,"hey");
	List<String> al = new ArrayList<String>();
	al.add("one");
	al.add("two");
	al.add("three");
	
	al.forEach(
			
			n -> System.out.println(n)
			
			);
	
	}
	
	
}
