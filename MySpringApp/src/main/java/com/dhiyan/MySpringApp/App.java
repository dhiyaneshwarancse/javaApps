package com.dhiyan.MySpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static int x = 10;
    public static void main( String[] args )
    {
		/*
		 * // https://www.youtube.com/watch?v=If1Lw4pLLEo&t=2734s //normal way of
		 * interface using Vehicle objNormal = new Bike(); objNormal.drive();
		 * 
		 * //spring method ApplicationContext context = new
		 * ClassPathXmlApplicationContext("spring.xml");
		 * 
		 * Vehicle objSpring = (Vehicle)context.getBean("vehicle"); objSpring.drive();
		 * 
		 * //annotation based System.out.println("annotation based"); Vehicle
		 * objSpringAnnot = (Vehicle)context.getBean("car"); objSpringAnnot.drive();
		 * 
		 * Tyre t = (Tyre)context.getBean("tyre"); System.out.println(t);
		 */
    	
    	App val= new App();
    	val.testMain();
       System.out.println(val.x);
   	App val1= new App();
	val1.testMain();
   System.out.println(val1.x);
    }
    
    public int testMain() {
    	x ++;
    	return x;
    }
    
    
    
    
}
